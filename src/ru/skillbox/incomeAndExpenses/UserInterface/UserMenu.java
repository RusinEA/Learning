package ru.skillbox.incomeAndExpenses.UserInterface;

import ru.skillbox.incomeAndExpenses.FinancialOperationsAndRecords.FinancialAccounting;
import ru.skillbox.incomeAndExpenses.FinancialOperationsAndRecords.OperationType;
import ru.skillbox.incomeAndExpenses.FinancialOperationsAndRecords.Transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserMenu {

    private static final String dash = "-------------------------------------------------------------------";
    private static int indexOfTransaction = 0;
    private static Transaction[] transactions = new Transaction[5];
    private static FinancialAccounting financialAccounting = new FinancialAccounting();
    private static DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private static int cursor = -1;
    private static int endOfTransactionIndex = -1;

    public static void welcome() {
        System.out.println("Welcome to Income and Expenses");
        System.out.println("Your interface commands: HELP, REPORT, EXIT");
        System.out.println();
    }

    public static void help() {
        System.out.println("You can input new financial operation:");
        System.out.println("Example: ");
        System.out.println("Product; Cost; Type of operation - INCOME or EXPENSE; Date of operation dd.MM.yyyy");
        System.out.println("Or use command of your interface: HELP, REPORT, EXIT");
        System.out.println();
    }

    public static void inputNext() {
        System.out.println(dash);
        System.out.println("Please enter your next command: ");
    }

    public static void addTransaction(Transaction transaction) {

        transactions[indexOfTransaction] = transaction;

        if (OperationType.valueOfIgnoreCase(
                String.valueOf(transactions[indexOfTransaction].operationType())) == OperationType.INCOME) {
            financialAccounting.addSumIncome(transactions[indexOfTransaction].transactionAmount());
        } else {
            financialAccounting.addSumExpenses(transactions[indexOfTransaction].transactionAmount());
        }

        if (indexOfTransaction < 4) {
            indexOfTransaction++;
            if (cursor >= 0 && cursor < 4) {
                cursor++;
            }
        } else {
            indexOfTransaction = 0;
            cursor = 0;
        }
    }

    public static Transaction transactionParcer(String input) {

        String[] financialStringArray = input.split(";\\s");
        //Transaction transaction = null;

        Transaction transaction = new Transaction(
                financialStringArray[0],
                new BigDecimal(financialStringArray[1]),
                OperationType.valueOfIgnoreCase(financialStringArray[2]),
                LocalDate.parse(financialStringArray[3], datePattern)
        );
        return transaction;
    }

    public static void showReport() {

        System.out.println("Financial statements");
        System.out.println("Total revenue:  " + String.format("%,.2f", financialAccounting.getSumIncome()));
        System.out.println("Total expenses: " + String.format("%,.2f", financialAccounting.getSumExpenses()));
        System.out.println("Balance:        " + String.format("%,.2f", financialAccounting.getIncomeMinusexpenses()));

        String header = String.format("%-12s %-11s %-10s %-10s", "Дата", "Сумма", "Тип", "Описание");
        System.out.println(dash);
        System.out.println(header);
        System.out.println(dash);
        StringBuilder stringBuilder = new StringBuilder();

        if (endOfTransactionIndex != -1) {
            if (cursor < 0) {
                for (int i = 0; i <= endOfTransactionIndex; i++) {
                    stringBuilder.append(datePattern.format(transactions[i].date()) + ("|" + "\t\s"));
                    stringBuilder.append(String.format("%,.2f \t", transactions[i].transactionAmount()) + "|");
                    stringBuilder.append(String.format("%-10s", (transactions[i].operationType())) + "|");
                    stringBuilder.append(String.format("%-30s", transactions[i].operationDescription()) + "|");
                    System.out.println(stringBuilder.toString());
                    stringBuilder.setLength(0);
                }
            } else {
                for (int i = cursor; i <= endOfTransactionIndex; i++) {
                    stringBuilder.append(datePattern.format(transactions[i].date()) + ("|" + "\t\s"));
                    stringBuilder.append(String.format("%,.2f \t", transactions[i].transactionAmount()) + "|");
                    stringBuilder.append(String.format("%-10s", (transactions[i].operationType())) + "|");
                    stringBuilder.append(String.format("%-30s", transactions[i].operationDescription()) + "|");
                    System.out.println(stringBuilder.toString());
                    stringBuilder.setLength(0);
                }
                for (int i = 0; i < cursor; i++) {
                    stringBuilder.append(datePattern.format(transactions[i].date()) + ("|" + "\t\s"));
                    stringBuilder.append(String.format("%,.2f \t", transactions[i].transactionAmount()) + "|");
                    stringBuilder.append(String.format("%-10s", (transactions[i].operationType())) + "|");
                    stringBuilder.append(String.format("%-30s", transactions[i].operationDescription()) + "|");
                    System.out.println(stringBuilder.toString());
                    stringBuilder.setLength(0);
                }
            }

            System.out.println(dash);
        }
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        String input;
        do {
            inputNext();
            input = scanner.nextLine();

            switch (Commands.valueOfIgnoreCase(input)) {
                case HELP:
                    help();
                    break;

                case REPORT:
                    showReport();
                    break;

                case EXIT:
                    showReport();
                    System.out.println("Goodbye!");
                    break;

                case PARCER:
                    String regex = "[а-яА-Я\\s]+;\\s[0-9.]+;\\s[EXPNSICOM]+;\\s[0-9]{2}.[0-9]{2}.[0-9]{4}";
                    if (input.matches(regex)) {
                        addTransaction(transactionParcer(input));
                        System.out.println("Transaction added");
                        if (endOfTransactionIndex < 4) {
                            endOfTransactionIndex++;
                        }

                        break;
                    }

                default:
                    System.out.println("Invalid command");
                    break;
            }
        } while (Commands.valueOfIgnoreCase(input) != Commands.EXIT);
    }
}

