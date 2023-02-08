package com.example.car_shop.controller.api;

import com.example.car_shop.dto.ArticleDTO;
import com.example.car_shop.dto.OrderDTO;
import com.example.car_shop.dto.mapper.ArticleDTOMapper;
import com.example.car_shop.model.Article;
import com.example.car_shop.model.OrderArticles;
import com.example.car_shop.controller.request.OrderRequest;
import com.example.car_shop.repositories.ArticleRepository;
import com.example.car_shop.services.ArticleService;
import com.example.car_shop.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.example.car_shop.Constants.API_PATH;
import static com.example.car_shop.Constants.ORDER_PATH;

@RestController
@RequestMapping(API_PATH)
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    ArticleService articleservice;
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping(ORDER_PATH + "/{id}")
    public OrderDTO getOrderById(@PathVariable("id") long id) { // TODO: use something other (like a hash-generated link) to retrieve the order
        List<OrderArticles> orderArticles = this.orderService.getArticleNumbersInOrderWithId(id);
        List<ArticleDTO> articles = orderArticles.stream().map(orderArticle -> {
            Article article = (this.articleservice.byArticleNumber(orderArticle.getArticle().getArticleNumber())).get();
            return new ArticleDTOMapper().mapModelToDto(article);
        }).toList();

        return new OrderDTO(id, articles);
    }

    @PostMapping(value = ORDER_PATH, consumes = "application/json")
    public void postOrder(@RequestBody OrderRequest request) {
        this.orderService.createOrder(request.articleNumbers());
    }
}
