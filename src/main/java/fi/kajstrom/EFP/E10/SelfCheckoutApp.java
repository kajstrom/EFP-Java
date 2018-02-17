package fi.kajstrom.EFP.E10;

import fi.kajstrom.EFP.Console;

/**
 * Created by Kaitsu on 9.5.2016.
 */
public class SelfCheckoutApp {
    private Console console;

    public SelfCheckoutApp(Console console) {
        this.console = console;
    }

    public void run() {
        Checkout checkout = new Checkout();

        checkout.add(promptForItem(1));
        checkout.add(promptForItem(2));
        checkout.add(promptForItem(3));

        outputTotal(checkout);
    }

    public Item promptForItem(int itemNo) {
        console.print(String.format("Enter the price of item %s: ", itemNo));
        String price = console.readLine();

        console.print(String.format("Enter the quantity of item %s: ", itemNo));
        String quantity = console.readLine();

        try {
            return new Item(Integer.parseInt(quantity), Integer.parseInt(price));
        } catch (NumberFormatException nfe) {
            console.println("Price or quantity was not a valid number, please re-enter");
            return promptForItem(itemNo);
        }
    }

    public void outputTotal(Checkout checkout) {
        console.println(String.format("Subtotal: $%s", checkout.taxFreeSum()));
        console.println(String.format("Tax: $%s", checkout.tax()));
        console.println(String.format("Total: $%s", checkout.taxIncludedSum()));
    }
}
