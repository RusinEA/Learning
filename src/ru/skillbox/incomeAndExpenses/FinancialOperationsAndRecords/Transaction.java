package ru.skillbox.incomeAndExpenses.FinancialOperationsAndRecords;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Transaction(String operationDescription,
                          BigDecimal transactionAmount,
                          OperationType operationType,
                          LocalDate date) {
}
