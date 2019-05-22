package by.epam.taxopark.entity.bus;

import by.epam.taxopark.entity.TypeFuel;
import by.epam.taxopark.entity.TypeTransport;

public class Maz extends Bus {
    public Maz(){
        super();
    }

    public Maz(TypeTransport typeTransport, String name, int cost, double fuel_flow,
               TypeFuel typeFuel, int age, int passengerCount, String color) throws Exception {
        super(typeTransport, name, cost, fuel_flow, typeFuel, age, passengerCount, color);
        setTv(true);
        setCofe(false);
        setBaggage(45);
    }


    public Maz (Maz maz) {
        super(maz);
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
        return "Bus {"+super.toString()+"}";
    }
}