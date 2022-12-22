package com.tddslutprojektviktorvallmark;


import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class FinnFormen {

    private Vector[] listOfVectors;

    public FinnFormen(Vector @NotNull...vectors)
    {
        this.listOfVectors = new Vector[vectors.length];

        for (int i = 0; i < vectors.length; i++)
        {
            listOfVectors[i] = vectors[i];
        }
        if(vectors.length == 0)
        {
            this.listOfVectors = new Vector[0];
        }
    }

    public Vector[] getListOfVectors()
    {
        return listOfVectors;
    }

    public String checkEasyShape(Vector[] vectorList)
    {
        String answer = "";

        switch (vectorList.length) {
            case 0 ->
                answer += "None";

            case 1 ->
                answer += "Dot";

            case 2 ->
                answer += "Line";

            case 3 ->
                answer += "Triangle";

            case 4 ->
               answer += check2DShape(vectorList);

            case 5 -> {
                if(check2DShape(vectorList).equals("Square") || check2DShape(vectorList).equals("Rectangle"))
                {
                    if(vectorList[0].getCoords()[2] == vectorList[1].getCoords()[2] && vectorList[0].getCoords()[2] == vectorList[2].getCoords()[2]
                    && vectorList[0].getCoords()[2] == vectorList[3].getCoords()[2] && !(vectorList[0].getCoords()[2] == vectorList[4].getCoords()[2]))
                    {
                        answer += "Pyramid";
                    }
                }
            }
            default ->
                answer += "Something went wrong please run the program again! You might have entered more than 5 vectors in the vectorlist."+
                " For identification of vectorlist of > 5 entries, please use the method check3DShape()";

        }
        return answer;
    }

    private String check2DShape(Vector[] vectors)
    {
        String answer = "";

        if(vectors[0].getCoords()[0] - vectors[1].getCoords()[0] == vectors[0].getCoords()[1] - vectors[1].getCoords()[1]
        && vectors[0].getCoords()[0] - vectors[2].getCoords()[0] == vectors[0].getCoords()[1] - vectors[2].getCoords()[1]
        && vectors[0].getCoords()[0] - vectors[3].getCoords()[0] == vectors[0].getCoords()[1] - vectors[3].getCoords()[1])
        {
            answer += "Square";
        }else if (vectors[0].getCoords()[0] - vectors[1].getCoords()[0] > vectors[0].getCoords()[1] - vectors[1].getCoords()[1]
        && vectors[0].getCoords()[0] - vectors[2].getCoords()[0] > vectors[0].getCoords()[1] - vectors[2].getCoords()[1]
        && vectors[0].getCoords()[0] - vectors[3].getCoords()[0] > vectors[0].getCoords()[1] - vectors[3].getCoords()[1])
        {
            answer += "Rectangle";
        }else if (vectors[0].getCoords()[0] - vectors[1].getCoords()[0] > vectors[0].getCoords()[1] - vectors[1].getCoords()[1]
        && vectors[0].getCoords()[0] < vectors[3].getCoords()[0])
        {
            answer += "Parallelogram";
        }else
        {
            answer += "2-d shape";
        }

        return answer;
    }

    public String check3DShape(Vector[] vectors)
    {
        String answer = "";
        double[] z_coord = new double[vectors.length];
        boolean argument = z_coord[0] == z_coord[1] && z_coord[0] == z_coord[2] && z_coord[0] == z_coord[3] && z_coord[0] != z_coord[4];
        Vector[] subArray1 = Arrays.copyOfRange(vectors, 0, 4);
        Vector[] subArray2 = Arrays.copyOfRange(vectors, 5, 8);
        String answerArray1 = check2DShape(subArray1);
        String answerArray2 = check2DShape(subArray2);

        if(vectors[0].getCoords()[0] - vectors[1].getCoords()[0] == vectors[0].getCoords()[1] - vectors[1].getCoords()[1]
                && vectors[0].getCoords()[0] - vectors[2].getCoords()[0] == vectors[0].getCoords()[1] - vectors[2].getCoords()[1]
                && vectors[0].getCoords()[0] - vectors[3].getCoords()[0] == vectors[0].getCoords()[1] - vectors[3].getCoords()[1])
        {
            for(int i = 0; i < vectors.length; i++)
            {
                z_coord[i] = vectors[i].getCoords()[2];
            }
            if(argument)
        {
            answer += "Pyramid";
        }
        }else if (vectors[0].getCoords()[0] - vectors[1].getCoords()[0] > vectors[0].getCoords()[1] - vectors[1].getCoords()[1]
                && vectors[0].getCoords()[0] - vectors[2].getCoords()[0] > vectors[0].getCoords()[1] - vectors[2].getCoords()[1]
                && vectors[0].getCoords()[0] - vectors[3].getCoords()[0] > vectors[0].getCoords()[1] - vectors[3].getCoords()[1])
        {
            for(int i = 0; i < vectors.length; i++)
            {
                z_coord[i] = vectors[i].getCoords()[2];
            }
            if(argument)
            {
                answer += "Pyramid from a Rectangle";
            }
        }else if(vectors.length == 8)
        {
            if(vectors[0].getCoords()[0] - vectors[1].getCoords()[0] == vectors[0].getCoords()[1] - vectors[1].getCoords()[1]
                    && vectors[0].getCoords()[0] - vectors[2].getCoords()[0] == vectors[0].getCoords()[1] - vectors[2].getCoords()[1]
                    && vectors[0].getCoords()[0] - vectors[3].getCoords()[0] == vectors[0].getCoords()[1] - vectors[3].getCoords()[1])
            {
                if(vectors[5].getCoords()[1] - vectors[6].getCoords()[1] == vectors[0].getCoords()[0] - vectors[1].getCoords()[0])
                {
                    //Check for another square in this if-loop.
                    if(vectors[4].getCoords()[0] - vectors[5].getCoords()[0] == vectors[4].getCoords()[1] - vectors[5].getCoords()[1]
                    && vectors[4].getCoords()[0] - vectors[6].getCoords()[0] == vectors[4].getCoords()[1] - vectors[6].getCoords()[1]
                    && vectors[4].getCoords()[0] - vectors[7].getCoords()[0] == vectors[4].getCoords()[1] - vectors[7].getCoords()[1])
                    {
                        answer += "Cube";
                    }
                }
            }
            if(answerArray1.equals("Rectangle") || answerArray2.equals("Rectangle"))
            {
                if(subArray1[3].getCoords()[2] > subArray1[0].getCoords()[2] || subArray1[3].getCoords()[2] > subArray1[1].getCoords()[2]
                || subArray1[3].getCoords()[2] > subArray1[2].getCoords()[2] || subArray1[7].getCoords()[2] > subArray1[4].getCoords()[2]
                || subArray1[7].getCoords()[2] > subArray1[5].getCoords()[2] || subArray1[7].getCoords()[2] > subArray1[6].getCoords()[2])
                {
                    answer += "Rectangular Parallelepiped";
                }
            }
        }else
            answer += "3-D Shape";



        return answer;
    }
}
