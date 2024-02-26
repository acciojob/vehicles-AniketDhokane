package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

     private String name;




    public Car(String name,boolean isManual) {


        super(name);
        this.name=name;
        this.isManual=isManual;


        //Hint: Car extends Vehicle

    }

    public void changeGear(int newGear){

        System.out.println("changeGear method called - The gear is changed to: " + newGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
