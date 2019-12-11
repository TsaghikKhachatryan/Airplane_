package com.company;

import java.util.ArrayList;

public class AirplaneManager {
    private ArrayList<Airplane> airplanes;

    public AirplaneManager() {
        this.airplanes = new ArrayList<>();
    }

    public Airplane createAirplane(String name, int year, int maxDistance, int rowCount, int columnCount, float maxFuelCapacity) {
        int ID = airplanes.size();
        Airplane airplane = new Airplane(ID, name, year, maxDistance, rowCount, columnCount, maxFuelCapacity);
        airplanes.add(airplane);
        return airplane;
    }

    private boolean isAvailableSeat(Airplane airplane, int setsCount, int row, int column) {
        if (airplane.getSeats()[row][column] == 0) {
            return true;
        }
        return false;
    }

    public void reserveSeats(Airplane airplane, String seatNumber, int seatsCount) {
        String[] splitSeatNumbers = seatNumber.split(" ");
        int rowNum = Integer.valueOf(splitSeatNumbers[1]);
        int colNum = seatNumber.charAt(0) - 'A';
        if (seatsCount == 1) {
            if (isAvailableSeat(airplane, seatsCount, rowNum, colNum)) {
                airplane.getSeats()[rowNum][colNum] = 1;
                System.out.println("Reserved seat in " + airplane.getName() + ", seat number: " + seatNumber);
            } else {
                System.out.println("Sorry seat is not available");
            }
        } else if (seatsCount == 2) {
            if (reserveTwoSeats(airplane, rowNum, colNum)) {
                System.out.println("Reserved seatsfor two");
            } else {
                System.out.println("Sorry seats for two are not available in this airplane");
            }
        }
    }

    public boolean reserveTwoSeats(Airplane airplane, int rowNum, int colNum) {
        if (colNum == 1 || colNum == 4) {
            if (airplane.getSeats()[rowNum][colNum] == 1) {
                return false;
            } else {
                if (airplane.getSeats()[rowNum][colNum + 1] == 0 || airplane.getSeats()[rowNum][colNum - 1] == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        } else if (colNum == 0 || colNum == 3) {
            if (airplane.getSeats()[rowNum][colNum + 1] == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (airplane.getSeats()[rowNum][colNum - 1] == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}