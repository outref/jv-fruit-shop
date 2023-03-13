package com.mate.fruitshop.service;

import com.mate.fruitshop.model.Transaction;
import java.util.List;

public interface TransactionParserService {
    List<Transaction> read(List<String> lines);
}