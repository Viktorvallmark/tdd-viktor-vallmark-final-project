package com.tddslutprojektviktorvallmark;


public class Vector {
    //Fields
    private double[] vec;
    //Constructor
    public Vector(double ...coord)
    {
        this.vec = new double[coord.length];

        for (int i = 0; i < vec.length; i++)
        {
            this.vec[i] = coord[i];
        }
    }

    public double[] getCoords() {
        return vec;
    }

    @Override
    public String toString() {
        String str = "[";
        String sep = ",\n ";

        for (int i = 0; i < this.vec.length; i++) {
            str += this.vec[i];

            if (i < (this.vec.length - 1)) {
                str += sep;
            }
        }

        return str + "]";
    }

}

