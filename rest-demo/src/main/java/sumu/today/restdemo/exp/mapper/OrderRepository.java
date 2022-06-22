package sumu.today.restdemo.exp.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import sumu.today.restdemo.exp.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
