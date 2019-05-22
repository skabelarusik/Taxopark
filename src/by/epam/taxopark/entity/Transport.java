package by.epam.taxopark.entity;

import java.io.Serializable;
import java.util.Objects;

public abstract class Transport  {

    /**
     * @author Andrey Krupin
     * was created between 01.05.2019 and 10.05.2019
     */

    private TypeTransport typeTransport;
    private String name;
    private int cost;
    private double fuel_flow;
    private TypeFuel typeFuel;
    private int age;
    private int passengerCount;
    private String color;

    public Transport(){

    }

    public Transport(TypeTransport typeTransport, String name, int cost, double fuel_flow,
                     TypeFuel typeFuel, int age, int passengerCount, String color) {
        this.typeTransport = typeTransport;
        this.name = name;
        this.cost = cost;
        this.fuel_flow = fuel_flow;
        this.typeFuel = typeFuel;
        this.age = age;
        this.passengerCount = passengerCount;
        this.color = color;
    }

    public Transport(Transport transport){
        this.typeTransport = transport.typeTransport;
        this.name = transport.name;
        this.color = transport.color;
        this.passengerCount = transport.passengerCount;
        this.fuel_flow = transport.fuel_flow;
        this.cost = transport.cost;
        this.typeFuel = transport.typeFuel;
        this.age = transport.age;
    }

    public TypeTransport getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(TypeTransport typeTransport) {
        this.typeTransport = typeTransport;
    }

    public Serializable getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getFuel_flow() {
        return fuel_flow;
    }

    public void setFuel_flow(double fuel_flow) {
        this.fuel_flow = fuel_flow;
    }

    public TypeFuel getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(TypeFuel typeFuel) {
        this.typeFuel = typeFuel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return cost == transport.cost &&
                Double.compare(transport.fuel_flow, fuel_flow) == 0 &&
                age == transport.age &&
                passengerCount == transport.passengerCount &&
                typeTransport == transport.typeTransport &&
                Objects.equals(name, transport.name) &&
                typeFuel == transport.typeFuel &&
                Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeTransport, name, cost, fuel_flow, typeFuel, age, passengerCount, color);
    }

    @Override
    public String toString() {
        return "TypeTransport=" + typeTransport + ", name='" + name + '\'' +
                ", cost=" + cost + ", fuel_flow=" + fuel_flow +
                ", typeFuel=" + typeFuel + ", age=" + age + ", passengerCount=" + passengerCount +
                ", color='" + color;
    }
}

