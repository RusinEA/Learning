package ru.skillbox.incomeAndExpenses.FinancialOperationsAndRecords;

public enum OperationType {
    INCOME,
    EXPENSE;

    public static OperationType valueOfIgnoreCase(String name) {
        return valueOf(name.toUpperCase());
    }
}
