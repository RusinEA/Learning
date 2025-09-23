package ru.skillbox.IncomeAndExpenses.FinancialOperationsAndRecords;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Transaction(String operationDescription,
                          BigDecimal transactionAmount,
                          OperationType operationType,
                          LocalDate date) {
}
