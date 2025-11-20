package ru.skillbox.incomeAndExpenses.FinancialOperationsAndRecords;

import java.math.BigDecimal;

public class FinancialAccounting {
    private BigDecimal sumIncome = BigDecimal.ZERO;
    private BigDecimal sumExpenses = BigDecimal.ZERO;
    private BigDecimal incomeMinusexpenses = BigDecimal.ZERO;

    public void addSumIncome(BigDecimal sumIncome) {
        this.sumIncome = this.sumIncome.add(sumIncome);
    }

    public void addSumExpenses(BigDecimal sumExpenses) {
        this.sumExpenses = this.sumExpenses.add(sumExpenses);
    }

    public BigDecimal getSumIncome() {
        return this.sumIncome;
    }

    public BigDecimal getSumExpenses() {
        return this.sumExpenses;
    }

    public BigDecimal getIncomeMinusexpenses() {
        return this.incomeMinusexpenses.add(this.sumIncome.subtract(this.sumExpenses));
    }
}
