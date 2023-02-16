package com.example.car_shop;

import com.example.car_shop.model.Order;
import com.example.car_shop.services.OrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

@ExtendWith(SpringExtension.class)
public class OrderServiceTests {
    @MockBean
    private OrderService orderService;

    @Test
    public void testOrderServiceGetAllOrders() {
        final var expected = 1;
        Mockito.when(this.orderService.list()).thenReturn(List.of(new Order()));
        List<Order> orders = this.orderService.list();

        Assertions.assertEquals(orders.size(), expected);
    }

    @Test
    public void testOrderServiceGetOrderById() {
        final var expected = 1;
        Mockito.when(this.orderService.getOrderById(expected)).thenReturn(Optional.of(new Order().setId(expected)));
        Order order = this.orderService.getOrderById(expected).get();

        Assertions.assertEquals(order.getId(), expected);
    }
}
