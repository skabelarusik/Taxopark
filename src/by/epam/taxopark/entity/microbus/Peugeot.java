package by.epam.taxopark.entity.microbus;

import by.epam.taxopark.entity.TypeFuel;
import by.epam.taxopark.entity.TypeTransport;

public class Peugeot extends Microbus {
    public Peugeot(){
        super();
    }

    public Peugeot(TypeTransport typeTransport, String name, int cost, double fuel_flow,
                   TypeFuel typeFuel, int age, int passengerCount, String color) throws Exception {
        super(typeTransport, name, cost, fuel_flow, typeFuel, age, passengerCount, color);
        setTv(false);
        setConditioner(true);
    }


    public Peugeot (Peugeot peugeot) {
        super(peugeot);
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
        return "Microbus {"+super.toString()+"}";
    }
}