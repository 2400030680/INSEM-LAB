package com.example.customerorder.controller;

import com.example.customerorder.dto.CustomerOrderDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/customer-orders")
public class CustomerOrderController {

    @PostMapping
    public ResponseEntity<Map<String, Object>> placeOrder(@Valid @RequestBody CustomerOrderDTO order) {
        double totalAmount = order.getQuantity() * order.getPrice();

        Map<String, Object> response = new HashMap<>();
        response.put("status", "SUCCESS");
        response.put("message", "Customer order validated and placed successfully!");
        response.put("customerName", order.getCustomerName());
        response.put("productName", order.getProductName());
        response.put("quantity", order.getQuantity());
        response.put("price", order.getPrice());
        response.put("totalAmount", totalAmount);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
