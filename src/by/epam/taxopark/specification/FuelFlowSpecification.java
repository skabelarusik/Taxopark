package by.epam.taxopark.specification;

import by.epam.taxopark.entity.Transport;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class FuelFlowSpecification implements Specification {
    private double minFuelFlow;
    private double maxFuelFlow;

    public FuelFlowSpecification(double min, double max){
        this.minFuelFlow = min;
        this.maxFuelFlow = max;
    }
    @Override
    public boolean specify(Transport transport) {
        double currentFuelFlow = transport.getFuel_flow();
        return minFuelFlow <= currentFuelFlow && currentFuelFlow <= maxFuelFlow;
    }
}
