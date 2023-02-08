package com.example.car_shop.dto.mapper;

import com.example.car_shop.dto.ArticleDTO;
import com.example.car_shop.model.Article;
import com.example.car_shop.model.ArticleType;

public class ArticleDTOMapper {
    public ArticleDTO mapModelToDto(Article article) {
        return new ArticleDTO(article.getArticleNumber(), article.getName(), article.getPrice(), article.getArticleNumber());
    }
}
