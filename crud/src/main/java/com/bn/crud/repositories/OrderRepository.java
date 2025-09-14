package com.bn.crud.repositories;

import com.bn.crud.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository< Order, Long> {
}
