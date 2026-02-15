package com.example.shop;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@CrossOrigin
@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<Product> getProducts() {
        return List.of(
            new Product(1L, "Wireless Headphones", 1999, "https://via.placeholder.com/200"),
            new Product(2L, "Smart Watch", 2499, "https://via.placeholder.com/200"),
            new Product(3L, "Bluetooth Speaker", 1499, "https://via.placeholder.com/200"),
            new Product(4L, "Gaming Mouse", 999, "https://via.placeholder.com/200")
        );
    }
}
