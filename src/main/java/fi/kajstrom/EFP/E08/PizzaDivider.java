package fi.kajstrom.EFP.E08;


public class PizzaDivider {
    private final int pizzas;
    private final int piecesPerPizza;
    private final int people;

    public PizzaDivider(int pizzas, int piecesPerPizza, int people) {
        this.pizzas = pizzas;
        this.piecesPerPizza = piecesPerPizza;
        this.people = people;
    }

    public int piecesPerPerson() {
        int totalPieces = getTotalPieces();
        int availablePieces = totalPieces - leftOverPieces();
        return availablePieces / people;
    }

    public int leftOverPieces() {
        return getTotalPieces() % people;
    }

    private int getTotalPieces() {
        return pizzas * piecesPerPizza;
    }
}
