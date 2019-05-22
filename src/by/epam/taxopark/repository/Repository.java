package by.epam.taxopark.repository;

import by.epam.taxopark.entity.Transport;
import by.epam.taxopark.specification.Specification;

import java.util.Comparator;
import java.util.List;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public interface Repository {

    boolean add (Transport transport);
    boolean remove (int id) ;
    void updateCost(int age, int percent);
    int summCost();
    List<Transport> sort(Comparator comparator);
    List<Transport> sort(Specification specification, Comparator comparator);
    int size();
    List<Transport> query (Specification specification);

}
