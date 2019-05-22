package by.epam.taxopark.entity.bus;

import by.epam.taxopark.entity.TypeFuel;
import by.epam.taxopark.entity.TypeTransport;

public class MersedesBus extends Bus {
    public MersedesBus(){
        super();
    }

    public MersedesBus(TypeTransport typeTransport, String name, int cost, double fuel_flow,
                       TypeFuel typeFuel, int age, int passengerCount, String color) throws Exception {
        super(typeTransport, name, cost, fuel_flow, typeFuel, age, passengerCount, color);
        setTv(true);
        setCofe(true);
        setBaggage(45);
    }


    public MersedesBus (MersedesBus mersedesBus) {
        super(mersedesBus);
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