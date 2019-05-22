package by.epam.taxopark.specification;

import by.epam.taxopark.entity.Transport;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public interface Specification {

    boolean specify(Transport transport);
}
