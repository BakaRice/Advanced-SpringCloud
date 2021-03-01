package com.ricemarch.ribbon.server;

import com.ricemarch.ribbon.common.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/order")
    public Order getOrderDetail() {
        Order order = new Order();
        order.setId(1L);
        order.setContent("from server");
        return order;
    }
}
