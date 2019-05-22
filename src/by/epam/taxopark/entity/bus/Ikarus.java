package by.epam.taxopark.entity.bus;

import by.epam.taxopark.entity.TypeFuel;
import by.epam.taxopark.entity.TypeTransport;

public class Ikarus extends Bus {
    public Ikarus(){
        super();
    }

    public Ikarus(TypeTransport typeTransport, String name, int cost, double fuel_flow,
                  TypeFuel typeFuel, int age, int passengerCount, String color) throws Exception {
        super(typeTransport, name, cost, fuel_flow, typeFuel, age, passengerCount, color);
        setTv(false);
        setCofe(false);
        setBaggage(40);
    }

    public Ikarus (Ikarus ikarus) {
        super(ikarus);
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