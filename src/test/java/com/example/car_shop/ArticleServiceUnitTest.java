package com.example.car_shop;

import com.example.car_shop.model.Article;
import com.example.car_shop.services.ArticleService;
import org.junit.Assert;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Optional;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ArticleServiceUnitTest {

    @Autowired
    private ArticleService articleService;

    @Test
    public void testHibernateCreatesInitialRecords() {
        List<Article> articles = articleService.list();

        Assert.assertEquals(articles.size(), 3);
    }

    @Test
    public void testArticleServiceGetArticlebyNumber() {
        Optional<Article> articleOpt = articleService.byArticleNumber(0);
        var article = articleOpt.get();

        Assert.assertEquals(article.getArticleNumber(), 0);
    }
}
