package com.example.car_shop.services;

import com.example.car_shop.model.Article;
import com.example.car_shop.model.Order;
import com.example.car_shop.model.OrderArticles;
import com.example.car_shop.repositories.OrderArticlesRepository;
import com.example.car_shop.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderArticlesRepository orderArticlesRepository;

    public List<Order> list() {
        return this.orderRepository.findAll();
    }

    public Optional<Order> getOrderById(long id) {
        return this.orderRepository.findById(id);
    }

    public List<OrderArticles> getArticleNumbersInOrderWithId(long id) {
        return this.orderArticlesRepository.findByOrder_Id(id);
    }

    public List<OrderArticles> getArticleNumbersInOrderWithLink(String link) {
        return this.orderArticlesRepository.findByOrder_Link(link);
    }

    public void createOrder(List<Long> articleNumbers, String link) {
        if (articleNumbers.isEmpty()) return; // prevents adding empty orders

        var order = new Order().setLink(link);
        this.orderRepository.saveAndFlush(order);

        var orderArticles = articleNumbers.stream().map(num -> {
            var orderArticlesToFill = new OrderArticles();
            var article = new Article()
                    .setArticleNumber(num);

            orderArticlesToFill
                    .setOrder(order)
                    .setArticle(article);

            return orderArticlesToFill;
        }).toList();

        this.orderArticlesRepository.saveAllAndFlush(orderArticles);
    }
}
