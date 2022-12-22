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
        when(finnFormenMock.checkEasyShape(finnFormenMock.getListOfVectors())).thenReturn("None");
    }
    @Test
    public void makingTheShapeWithVectorOf1DimShouldReturnDot()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        when(finnFormenMock.checkEasyShape(finnFormenMock.getListOfVectors())).thenReturn("Dot");
    }

    @Test
    public void makingTheShapeWithVectorListWithTwoEntriesShouldReturnLine()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        when(finnFormenMock.checkEasyShape(finnFormenMock.getListOfVectors())).thenReturn("Line");
    }

    @Test
    public void makingTheShapeWithVectorListWithThreeEntriesShouldReturnTriangle()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        when(finnFormenMock.checkEasyShape(finnFormenMock.getListOfVectors())).thenReturn("Triangle");
    }

    @Test
    public void makingTheShapeWithVectorListWithFourEntriesAndAllPointsAreEquidistantShouldReturnSquare()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);

        when(finnFormenMock.checkEasyShape(finnFormenMock.getListOfVectors())).thenReturn("Square");
    }

    @Test
    public void makingTheShapeWithVectorListWithFourEntriesAndTwoLinesAreShorterThanTheOtherTwoShouldReturnRectangle()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        when(finnFormenMock.checkEasyShape(finnFormenMock.getListOfVectors())).thenReturn("Rectangle");
    }

    @Test
    public void makingTheShapeWithVectorListWithFourEntriesAndTwoLinesStartOnDifferentCoordinatesShouldReturnParallelogram()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        when(finnFormenMock.checkEasyShape(finnFormenMock.getListOfVectors())).thenReturn("Parallelogram");
    }

    @Test
    public void makingTheShapeWithVectorListWithFourEntriesAndNoKnownShapeIsIdentifiedShouldReturn2DShape()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        when(finnFormenMock.checkEasyShape(finnFormenMock.getListOfVectors())).thenReturn("2-d shape");
    }

    @Test
    public void makingTheShapeWithVectorListWithFiveEntriesWhereLastVectorsZCoordinateIsDifferentShouldReturnPyramid()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        when(finnFormenMock.check3DShape(finnFormenMock.getListOfVectors())).thenReturn("Pyramid");
    }

    @Test
    public void makingTheShapeWithVectorListWithFiveEntriesWhereLastVectorsZCoordinateIsDifferentAndMakesRectangleShouldReturnPyramidFromARectangle()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        when(finnFormenMock.check3DShape(finnFormenMock.getListOfVectors())).thenReturn("Pyramid from a Rectangle");
    }

    @Test
    public void makingTheShapeWithVectorListWithEightEntriesAndTwoSquaresAreFoundSpacedLengthOfASquareApartShouldReturnCube()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        when(finnFormenMock.check3DShape(finnFormenMock.getListOfVectors())).thenReturn("Cube");
    }

    @Test
    public void makingTheShapeWithVectorListWithEightEntriesAndARectangleIsFoundThatHasDepthShouldReturnRectangularParallelepiped()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        when(finnFormenMock.check3DShape(finnFormenMock.getListOfVectors())).thenReturn("Rectangular Parallelepiped");
    }

    @Test
    public void makingTheShapeWithVectorListWithEightEntriesAndAndNoKnown3DShapeIsFoundShouldReturn3DShape()
    {
        FinnFormen finnFormenMock = mock(FinnFormen.class);
        when(finnFormenMock.check3DShape(finnFormenMock.getListOfVectors())).thenReturn("3-D Shape");
    }

}
