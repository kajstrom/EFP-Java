package tests.E07;

import EFP.E07.RoomArea;
import org.junit.Assert;
import org.junit.Test;

public class RoomAreaTest {
    @Test
    public void Area_WhenDimensionsAre15By20InFeet_ReturnsCorrectAreaInSquareFeet()
    {
        RoomArea roomArea = new RoomArea(15, 20);

        Assert.assertEquals(300.0, roomArea.squareFeet(), 0.0);
    }

    @Test
    public void Area_WhenDimensionsAre15By20InFeet_ReturnsCorrectAreaInSquareMeter()
    {
        RoomArea roomArea = new RoomArea(15, 20);

        Assert.assertEquals(27.870912, roomArea.squareMeters(), 0.0);
    }
}
