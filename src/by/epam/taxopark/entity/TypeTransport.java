package by.epam.taxopark.entity;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 10.05.2019
 */


public enum TypeTransport {

    BUS, CAR, MICROBUS;

    public enum TypeBus{

        IKARUS, MAZ, MERSEDES;

    }

    public enum TypeCar{

        GEELY, HYUNDAY, LADA, TOYOTA;

    }

    public enum  TypeMicrobus {

        GAZEL, MERSEDES, PEUGEOT;

    }

}
