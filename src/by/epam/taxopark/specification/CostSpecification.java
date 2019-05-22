package by.epam.taxopark.specification;

import by.epam.taxopark.entity.Transport;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class CostSpecification implements Specification {

    private int minCost;
    private int maxCost;

    public CostSpecification(int minCost, int maxCost) {
        this.minCost = minCost;
        this.maxCost = maxCost;
    }

    @Override
    public boolean specify(Transport transport) {
        int currentCost = transport.getCost();
        return currentCost >= minCost && currentCost <= maxCost;
    }
}
