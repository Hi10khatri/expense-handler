package com.example.expensehandler.controller;


import com.example.expensehandler.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping(value = "/api/expense")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;
    @PostMapping
    public void saveExpense(@RequestBody List<Map<String, Object>> expenseList) {
        try {
            expenseService.save(expenseList);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
