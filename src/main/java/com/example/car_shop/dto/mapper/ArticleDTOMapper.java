package com.example.car_shop.dto.mapper;

import com.example.car_shop.dto.ArticleDTO;
import com.example.car_shop.model.Article;

public class ArticleDTOMapper {
    public ArticleDTO mapModelToDto(Article article) {
        return new ArticleDTO(article.getArticleNumber(), article.getName(), article.getPrice(), article.getArticleType().getId());
    }
}
