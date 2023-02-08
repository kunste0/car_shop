package com.example.car_shop.services;

import com.example.car_shop.model.Article;
import com.example.car_shop.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> list() {
        return articleRepository.findAll();
    }

    public Optional<Article> byArticleNumber(long articleNumber) {
        return articleRepository.findById(articleNumber);
    }
}
