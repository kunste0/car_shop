package com.example.car_shop.controller.api;

import com.example.car_shop.dto.ArticleDTO;
import com.example.car_shop.dto.mapper.ArticleDTOMapper;
import com.example.car_shop.model.Article;
import com.example.car_shop.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

import static com.example.car_shop.Constants.API_PATH;
import static com.example.car_shop.Constants.ARTICLE_PATH;

@RestController
@RequestMapping(API_PATH)
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping(value = ARTICLE_PATH + "/{articleNumber}", produces = "application/json")
    public ArticleDTO getArticleByNumber(@PathVariable("articleNumber") long articleNumber) {
        Optional<Article> res = this.articleService.byArticleNumber(articleNumber);
        if (res.isEmpty()) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Article with number " + articleNumber + " not found");
        }
        var article = res.get();
        return new ArticleDTOMapper().mapModelToDto(article);
    }

    @GetMapping(value = ARTICLE_PATH, produces = "application/json")
    public List<ArticleDTO> getArticles() {
        List<Article> result = this.articleService.list();
        var mapper = new ArticleDTOMapper();
        var articles = result.stream()
                .map(article -> mapper.mapModelToDto(article))
                .toList();
        return articles;
    }
}
