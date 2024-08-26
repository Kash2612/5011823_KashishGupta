package com.bookstore.controller;

import com.bookstore.service.MetricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private MetricsService metricsService;

    @GetMapping
    public String getAllBooks() {
        metricsService.incrementCustomMetric();
        return "Books fetched";
    }
}
