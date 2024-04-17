package com.example.expensehandler.service.impl;

import com.example.expensehandler.domain.Expense;
import com.example.expensehandler.repository.ExpenseRepository;
import com.example.expensehandler.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ExpenseServiceImpl implements ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;
    @Override
    public void save(List<Map<String, Object>> expenseList) {
        List<Expense> expenses = new ArrayList<>();

        for (Map<String, Object> stringObjectMap : expenseList) {
            Expense expense = new Expense();
            expense.setDescription(stringObjectMap.get("description").toString());
            expense.setTotalSpent(Long.valueOf(stringObjectMap.get("totalSpent").toString()));

            expenses.add(expense);

        }

        expenseRepository.saveAll(expenses);

    }
}
