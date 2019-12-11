package com.company;

public class Airplane {
    private int ID;
    private String name;
    private int year;
    private int maxDistance;
    private int row;//123..n
    private int column;// ABC DEF
    private int seats[][];
    private float maxFuelCapacity;
    private float currentFuelLevel;

    public Airplane() {

    }

    public Airplane(int ID, String name, int year, int maxDistance, int row, int column, float maxFuelCapacity) {
        this.ID = ID;
        this.name = name;
        this.year = year;
        this.maxDistance = maxDistance;
        this.row = row;
        this.column = column;
        this.maxFuelCapacity = maxFuelCapacity;
        this.currentFuelLevel= maxFuelCapacity;
        this.seats= new int[row][column];
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int[][] getSeats() {
        return seats;
    }

    public float getMaxFuelCapacity() {
        return maxFuelCapacity;
    }

    public float getCurrentFuelLevel() {
        return currentFuelLevel;
    }
}
