package com.example.car_shop.controller.request;

import java.util.List;

public record OrderRequest(List<Long> articleNumbers) {
}
