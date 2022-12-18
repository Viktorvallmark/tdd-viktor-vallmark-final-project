package com.tddslutprojektviktorvallmark;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class FinnFormenTest {

    @Test
    public void checkIfTestIsWorkingShouldReturnTrue()
    {
        assertTrue(true);
    }

    @Test
    public void makingShapeWithoutAnyVectorsInTheListShouldReturnNone()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        //finnFormenMock.checkShape(finnFormenMock.getListOfVectors());
    }
    @Test
    public void makingTheShapeWithVectorOf1DimShouldReturnDot()
    {
        FinnFormen finnFormen = new FinnFormen(new Vector(1));

    }

}
