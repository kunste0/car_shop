package com.example.car_shop.dto.mapper;

import com.example.car_shop.dto.ArticleDTO;
import com.example.car_shop.model.Article;

public class ArticleDTOMapper {
    /**
     * Maps an Article model to an ArticleDTO
     *
     * @param article the object coming from the model
     * @return a new object with values mapped from the incoming model object
     */
    public ArticleDTO mapModelToDto(Article article) {
        return new ArticleDTO(article.getArticleNumber(), article.getName(), article.getPrice(), article.getArticleType().getId());
    }
}
