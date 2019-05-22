package by.epam.taxopark.entity.microbus;

import by.epam.taxopark.entity.Transport;
import by.epam.taxopark.entity.TypeFuel;
import by.epam.taxopark.entity.TypeTransport;

import java.util.Objects;

public abstract class Microbus extends Transport {
    private boolean tv;
    private boolean conditioner;

    public Microbus() {
        super();
    }

    public Microbus(TypeTransport typeTransport, String name, int cost, double fuel_flow,
                    TypeFuel typeFuel, int age, int passengerCount, String color) throws Exception {
        super(typeTransport, name, cost, fuel_flow, typeFuel, age, passengerCount, color);

        tv = false;
        conditioner = false;
    }

    public Microbus(Microbus microbus) {
        super(microbus);
        this.tv = microbus.tv;
        this.conditioner = microbus.conditioner;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public void setConditioner(boolean conditioner) {
        this.conditioner = conditioner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Microbus microbus = (Microbus) o;
        return tv == microbus.tv &&
                conditioner == microbus.conditioner;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tv, conditioner);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(", tv=");
        stringBuilder.append(tv);
        stringBuilder.append(" ,conditoiner=");
        stringBuilder.append(conditioner);
        return super.toString() + stringBuilder;
    }
}