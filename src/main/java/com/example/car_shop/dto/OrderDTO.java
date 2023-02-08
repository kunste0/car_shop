package com.example.car_shop.dto;

import java.util.List;

public record OrderDTO(long orderNumber, List<ArticleDTO> articles) {
}
