package by.epam.taxopark.entity.car;

import by.epam.taxopark.entity.TypeFuel;
import by.epam.taxopark.entity.TypeTransport;

public class Geely extends Car {

    public Geely(){
        super();
    }

    public Geely(TypeTransport typeTransport, String name, int cost, double fuel_flow,
                 TypeFuel typeFuel, int age, int passengerCount, String color) throws Exception {
        super(typeTransport, name, cost, fuel_flow, typeFuel, age, passengerCount, color);
        setChildCarSeat(false);
        setConditioner(true);
    }

    public Geely (Geely transport){
        super(transport);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Taxi {"+super.toString()+"}";
    }

}
