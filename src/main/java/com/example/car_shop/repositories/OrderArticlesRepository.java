package com.example.car_shop.repositories;

import com.example.car_shop.model.OrderArticles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderArticlesRepository extends JpaRepository<OrderArticles, Long> {
    @Query("select o from OrderArticles o where o.order.id = ?1")
    List<OrderArticles> findByOrder_Id(long id);
}
