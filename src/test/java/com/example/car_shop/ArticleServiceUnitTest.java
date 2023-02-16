package com.example.car_shop;

import com.example.car_shop.model.Article;
import com.example.car_shop.services.ArticleService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Optional;

@ExtendWith(SpringExtension.class)
public class ArticleServiceUnitTest {
    @MockBean
    private ArticleService articleService;

    @Test
    public void testArticleServiceGetAllArticles() {
        Mockito.when(this.articleService.list()).thenReturn(List.of(new Article()));
        List<Article> articles = this.articleService.list();

        Assertions.assertEquals(articles.size(), 1);
    }

    @Test
    public void testArticleServiceGetArticleByNumber() {
        final var expected = 1;
        Mockito.when(this.articleService.byArticleNumber(expected)).thenReturn(Optional.of(new Article().setArticleNumber(expected)));
        Optional<Article> articleOpt = this.articleService.byArticleNumber(expected);
        var article = articleOpt.get();

        Assertions.assertEquals(article.getArticleNumber(), expected);
    }
}
