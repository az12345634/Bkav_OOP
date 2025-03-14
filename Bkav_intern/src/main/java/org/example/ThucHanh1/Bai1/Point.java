package org.example.ThucHanh1.Bai1;

import java.util.Scanner;

public class Point {
    private double hoanhDo;
    private double tungDo;
    private double caoDO;

    public Point() {
    }

    public Point(double hoanhDo, double tungDo, double caoDO) {
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
        this.caoDO = caoDO;
    }

    public double getHoanhDo() {
        return hoanhDo;
    }

    public Point(Point point) {
        this.caoDO= point.caoDO;
        this.tungDo= point.tungDo;
        this.hoanhDo= point.hoanhDo;
    }

    public void setHoanhDo(double hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    public double getTungDo() {
        return tungDo;
    }

    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    }

    public double getCaoDO() {
        return caoDO;
    }

    public void setCaoDO(double caoDO) {
        this.caoDO = caoDO;
    }


    public void display() {
        System.out.println("Point(" + hoanhDo + ", " + tungDo + ", " + caoDO + ")");
    }

}
