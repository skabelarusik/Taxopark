package by.epam.taxopark.entity.microbus;

import by.epam.taxopark.entity.TypeFuel;
import by.epam.taxopark.entity.TypeTransport;

public class Gazel extends Microbus {
    public Gazel() {
        super();
    }

    public Gazel(TypeTransport typeTransport, String name, int cost, double fuel_flow,
                 TypeFuel typeFuel, int age, int passengerCount, String color) throws Exception {
        super(typeTransport, name, cost, fuel_flow, typeFuel, age, passengerCount, color);
        setTv(false);
        setConditioner(false);
    }


    public Gazel(Gazel gazel) throws Exception {
        super(gazel);
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
        return "Microbus {" + super.toString() + "}";
    }
}