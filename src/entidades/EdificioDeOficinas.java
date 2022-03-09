package entidades;

import java.util.Scanner;

public final class EdificioDeOficinas extends Edificio {

    private String name;
    private double peoplePerOffice;
    private double numberOfOffices;
    private double numberOfFloors;

    public EdificioDeOficinas(String name, double peoplePerOffice, double numberOfOffices, double numberOfFloors, double high, double wide, double l0ng) {
        super(high, wide, l0ng);
        this.name = name;
        this.peoplePerOffice = peoplePerOffice;
        this.numberOfOffices = numberOfOffices;
        this.numberOfFloors = numberOfFloors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getPeoplePerOffice() {
        return peoplePerOffice;
    }

    public void setPeoplePerOffice(double peoplePerOffice) {
        this.peoplePerOffice = peoplePerOffice;
    }

    public double getNumberOfOffices() {
        return numberOfOffices;
    }

    public void setNumberOfOffices(double numberOfOffices) {
        this.numberOfOffices = numberOfOffices;
    }

    public double getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(double numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public double calcularSuperficie() {
        double area = super.wide * super.l0ng;
        return area;
    }

    @Override
    public double calcularVolumen() {
        double volume = super.wide * super.l0ng * super.high;
        return volume;
    }

    public void cantPersonas() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("The number of people fit in a floor is: " + (peoplePerOffice * numberOfOffices));
        System.out.println("The number of people fit in the building is " + (peoplePerOffice * numberOfOffices) * numberOfFloors);
    }

}