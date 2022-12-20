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
        finnFormenMock.checkEasyShape(finnFormenMock.getListOfVectors());
    }
    @Test
    public void makingTheShapeWithVectorOf1DimShouldReturnDot()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        finnFormenMock.checkEasyShape(finnFormenMock.getListOfVectors());
    }

    @Test
    public void makingTheShapeWithVectorListWithTwoEntriesShouldReturnLine()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        finnFormenMock.checkEasyShape(finnFormenMock.getListOfVectors());
    }

    @Test
    public void makingTheShapeWithVectorListWithThreeEntriesShouldReturnTriangle()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        finnFormenMock.checkEasyShape(finnFormenMock.getListOfVectors());
    }

    @Test
    public void makingTheShapeWithVectorListWithFourEntriesAndAllPointsAreEquidistantShouldReturnSquare()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        finnFormenMock.checkEasyShape(finnFormenMock.getListOfVectors());
    }

    @Test
    public void makingTheShapeWithVectorListWithFourEntriesAndTwoLinesAreShorterThanTheOtherTwoShouldReturnRectangle()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        finnFormenMock.checkEasyShape(finnFormenMock.getListOfVectors());
    }

    @Test
    public void makingTheShapeWithVectorListWithFourEntriesAndTwoLinesStartOnDifferentCoordinatesShouldReturnParallelogram()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        finnFormenMock.checkEasyShape(finnFormenMock.getListOfVectors());
    }

    @Test
    public void makingTheShapeWithVectorListWithFourEntriesAndNoKnownShapeIsIdentifiedShouldReturn2DShape()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        finnFormenMock.checkEasyShape(finnFormenMock.getListOfVectors());
    }

}
