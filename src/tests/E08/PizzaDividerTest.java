package tests.E08;

import EFP.E08.PizzaDivider;
import org.junit.Assert;
import org.junit.Test;

public class PizzaDividerTest {
    @Test
    public void PiecesPerPerson_With1PizzaWith4PiecesAnd2People_Returns2() {
        PizzaDivider pizzaDivider = new PizzaDivider(1, 4, 2);
        Assert.assertEquals(2, pizzaDivider.piecesPerPerson());
    }

    @Test
    public void SlicesPerPerson_With1PizzaWith3PiecesAnd2People_Returns1() {
        PizzaDivider pizzaDivider = new PizzaDivider(1, 3, 2);
        Assert.assertEquals(1, pizzaDivider.piecesPerPerson());
    }

    @Test
    public void SlicesPerPerson_With3PizzasWith4PiecesAnd4People_Returns3() {
        PizzaDivider pizzaDivider = new PizzaDivider(3, 4, 4);
        Assert.assertEquals(3, pizzaDivider.piecesPerPerson());
    }

    @Test
    public void LeftOverPieces_With1PizzaWith3PiecesAnd2People_Returns1() {
        PizzaDivider pizzaDivider = new PizzaDivider(1, 3, 2);
        Assert.assertEquals(1, pizzaDivider.leftOverPieces());
    }
}
