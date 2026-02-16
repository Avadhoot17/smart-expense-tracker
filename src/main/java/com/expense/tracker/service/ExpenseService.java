package com.expense.tracker.service;

import com.expense.tracker.model.Expense;
import com.expense.tracker.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository repo;

    public ExpenseService(ExpenseRepository repo) {
        this.repo = repo;
    }

    public Expense save(Expense expense) {
        return repo.save(expense);
    }

    public List<Expense> getAll() {
        return repo.findAll();
    }
}
