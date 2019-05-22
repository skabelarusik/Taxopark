package by.epam.taxopark.entity.car;

import by.epam.taxopark.entity.TypeFuel;
import by.epam.taxopark.entity.TypeTransport;

public class Toyota extends Car {

    public Toyota(){
        super();
    }

    public Toyota(TypeTransport typeTransport, String name, int cost, double fuel_flow,
                  TypeFuel typeFuel, int age, int passengerCount, String color) throws Exception {
        super(typeTransport, name, cost, fuel_flow, typeFuel, age, passengerCount, color);
        setChildCarSeat(true);
        setConditioner(true);
    }

    public Toyota (Toyota toyota)  {
        super(toyota);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "Taxi {"+super.toString()+"}";
    }
}
