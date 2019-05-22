package by.epam.taxopark.comparator;

import by.epam.taxopark.entity.Transport;

import java.util.Comparator;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class TypeComparator implements Comparator<Transport> {

    @Override
    public int compare(Transport o1, Transport o2) {
        return Comparator.comparing(Transport::getTypeTransport).thenComparing(Transport::getCost).
                thenComparing(Transport::getAge).thenComparing(Transport::getFuel_flow).compare(o1,o2);
    }

}
