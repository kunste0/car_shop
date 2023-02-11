package com.example.car_shop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Accessors(chain = true)
@Table(name = "article_types")
public class ArticleType {
    @Id
    private long id;
}
