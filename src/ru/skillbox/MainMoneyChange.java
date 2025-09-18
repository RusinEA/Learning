package ru.skillbox;

public class MainMoneyChange {
    public static void main(String[] args) {
        int change = 2335;

        int[] denominations = {5000, 1000, 500, 100, 50, 10, 5, 2, 1};

        for (int denomination : denominations) {
            int totalBanknotes = change/denomination;
            if (totalBanknotes == 0) {
                continue;
            }

            String banknoteType = switch (denomination){
                case 10, 5, 2, 1 -> "Монеты";
                default -> "Купюры";
            };

            System.out.println(banknoteType + " номиналом " + denomination + ": " + totalBanknotes);
            change -= totalBanknotes * denomination;
        }

    }

}
