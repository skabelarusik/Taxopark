package by.epam.taxopark.specification;

import by.epam.taxopark.entity.Transport;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class NameSpecification implements Specification {
    private String name;

    public NameSpecification(String name){
        this.name = name;
    }

    @Override
    public boolean specify(Transport transport) {
        return name.equals(transport.getName());
    }
}
