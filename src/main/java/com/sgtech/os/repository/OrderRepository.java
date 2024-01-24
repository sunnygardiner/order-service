package com.sgtech.os.repository;

import com.sgtech.os.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order,Integer> {
}
