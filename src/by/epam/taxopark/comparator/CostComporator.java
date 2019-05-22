package by.epam.taxopark.comparator;

import by.epam.taxopark.entity.Transport;

import java.util.Comparator;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class CostComporator implements Comparator<Transport> {
    @Override
    public int compare(Transport o1, Transport o2) {
        return Comparator.comparing(Transport::getCost).thenComparing(Transport::getFuel_flow).
                thenComparing(Transport::getAge).thenComparing(Transport::getTypeTransport).compare(o1, o2);
    }
}
