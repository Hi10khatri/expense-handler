package com.example.expensehandler.service;

import java.util.List;
import java.util.Map;

public interface ExpenseService {
    void save(List<Map<String, Object>> expenseList);

}
