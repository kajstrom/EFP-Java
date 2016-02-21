package EFP.E08;

import EFP.Console;

public class PizzaParty {
    private Console console;

    public PizzaParty(Console console) {
        this.console = console;
    }

    public void run() {
        console.print("How many people? ");
        String strPeople = console.readLine();
        int people = Integer.parseInt(strPeople);

        console.print("How many pizzas do you have? ");
        String strPizzas = console.readLine();
        int pizzas = Integer.parseInt(strPizzas);

        console.print("How many pieces does a pizza have? ");
        String strPieces = console.readLine();
        int pieces = Integer.parseInt(strPieces);

        PizzaDivider pizzaDivider = new PizzaDivider(pizzas, pieces, people);

        console.println(String.format("%s people with %s pizzas", people, pizzas));
        console.println(String.format("Each person gets %s pieces of pizza", pizzaDivider.piecesPerPerson()));
        console.println(String.format("There are %s leftover pieces", pizzaDivider.leftOverPieces()));
    }
}
