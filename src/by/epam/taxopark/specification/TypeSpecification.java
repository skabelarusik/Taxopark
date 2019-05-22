package by.epam.taxopark.specification;

import by.epam.taxopark.entity.Transport;
import by.epam.taxopark.entity.TypeTransport;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class TypeSpecification implements Specification {
    private TypeTransport typeTransport;

    public TypeSpecification(TypeTransport typeTransport){
        this.typeTransport = typeTransport;
    }

    @Override
    public boolean specify(Transport transport) {
        return typeTransport == transport.getTypeTransport();
    }
}
