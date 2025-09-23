package ru.skillbox.IncomeAndExpenses.UserInterface;

public enum Commands {
    HELP,
    REPORT,
    EXIT,
    PARCER;

    public static Commands valueOfIgnoreCase(String name) {
        if (name.equalsIgnoreCase("help")) {
            return Commands.HELP;
        } else if (name.equalsIgnoreCase("report")) {
            return Commands.REPORT;
        } else if (name.equalsIgnoreCase("exit")) {
            return Commands.EXIT;
        } else return PARCER;
    }

}
