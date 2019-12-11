package com.company;

public class Main {

    public static void main(String[] args) {
        AirplaneManager airplaneManager = new AirplaneManager();
        Airplane boeing787 = airplaneManager.createAirplane("Boeing787", 1999, 5000, 18, 6, 1000);
        Airplane boeing733 = airplaneManager.createAirplane("Boeing733", 1996, 5000, 18, 6, 1000);
        Airplane boeing777 = airplaneManager.createAirplane("Boeing777", 1989, 5000, 18, 6, 1000);
        Airplane boeingBBJ = airplaneManager.createAirplane("Boeing7BBJ", 1997, 5000, 18, 6, 1000);

        airplaneManager.reserveSeats(boeing787, "B 1",1);
        airplaneManager.reserveSeats(boeing787, "B 1",1);
        airplaneManager.reserveSeats(boeing787, "C 2",2);

        airplaneManager.reserveSeats(boeing777, "B 1",1);

    }
}
