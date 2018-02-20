package fi.kajstrom.EFP.E14;

import fi.kajstrom.EFP.Console;

public class TaxCalculatorApp {
    private Console console;

    public TaxCalculatorApp(Console console) {
        this.console = console;
    }

    public void run() {
        double amount = promptOrderAmount();
        String state = promptState();

        printResult(new Order(amount, state));
    }

    private double promptOrderAmount() {
        return Double.parseDouble(console.readLine("What is the order amount?"));
    }

    private String promptState() {
        return console.readLine("What is the state?");
    }

    private void printResult(Order order) {
        if (order.isTaxApplicable()) {
            console.println(String.format("The subtotal is $%1.2f.", order.amount()));
            console.println(String.format("The tax is $%1.2f", order.tax()));
        }

        console.println(String.format("The total is $%1.2f", order.total()));
    }
}
