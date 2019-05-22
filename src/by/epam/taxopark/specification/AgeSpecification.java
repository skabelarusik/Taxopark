package by.epam.taxopark.specification;

import by.epam.taxopark.entity.Transport;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class AgeSpecification implements Specification{
    private int minAge;
    private int maxAge;

    public AgeSpecification(int minAge, int maxAge){
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    @Override
    public boolean specify(Transport transport) {
        int currentAge = transport.getAge();
        return minAge <= currentAge && currentAge <= maxAge;
    }
}
