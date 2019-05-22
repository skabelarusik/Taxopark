package by.epam.taxopark.dataread;
import by.epam.taxopark.entity.TypeFuel;
import by.epam.taxopark.entity.TypeTransport;
import by.epam.taxopark.exception.WrongEnumTypeException;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class EnumTypeSelector {

    public static TypeTransport selectTypeTransport (String typeTransport) throws WrongEnumTypeException {
        if(typeTransport == null){
            throw new WrongEnumTypeException("Type transport is null");
        }
        switch (typeTransport){
            case "CAR" : return TypeTransport.CAR;
            case "BUS" : return TypeTransport.BUS;
            case "MICROBUS" : return TypeTransport.MICROBUS;
            default: throw new WrongEnumTypeException("Wrong type");
        }
    }

    public static TypeTransport.TypeMicrobus selectTypeMicrobus (String nameMicrobus) throws WrongEnumTypeException {
        if(nameMicrobus == null){
            throw new WrongEnumTypeException("Name microbus is null");
        }

        switch (nameMicrobus){
            case "GAZEL" : return TypeTransport.TypeMicrobus.GAZEL;
            case "MERSEDES" : return TypeTransport.TypeMicrobus.MERSEDES;
            case "PEUGEOT" : return TypeTransport.TypeMicrobus.PEUGEOT;
            default: throw new WrongEnumTypeException("Wrong name microbus");

        }
    }

    public static TypeTransport.TypeBus selectTypeBus (String nameBus) throws WrongEnumTypeException {
        if(nameBus == null){
            throw new WrongEnumTypeException("Name bus is null");
        }

        switch (nameBus){
            case "IKARUS" : return TypeTransport.TypeBus.IKARUS;
            case "MERSEDESBUS" : return TypeTransport.TypeBus.MERSEDES;
            case "MAZ" : return TypeTransport.TypeBus.MAZ;
            default: throw new WrongEnumTypeException("Wrong name bus");
        }
    }

    public static TypeTransport.TypeCar selectTypeCar (String nameCar) throws WrongEnumTypeException {
        if(nameCar == null){
            throw new WrongEnumTypeException("Name car is null");
        }

        switch (nameCar){
            case "TOYOTA" : return TypeTransport.TypeCar.TOYOTA;
            case "LADA" : return TypeTransport.TypeCar.LADA;
            case "HYUNDAI" : return TypeTransport.TypeCar.HYUNDAY;
            case "GEELY" : return TypeTransport.TypeCar.GEELY;
            default: throw new WrongEnumTypeException("Wrong name car");

        }
    }

    public static TypeFuel selectTypeFuel (String typeFuel) throws WrongEnumTypeException {
        if(typeFuel == null){
            throw new WrongEnumTypeException("Name typeFuel is null");
        }

        switch (typeFuel){
            case "GAZ" : return TypeFuel.GAZ;
            case "PETROL" : return TypeFuel.PETROL;
            case "DIESEL" : return TypeFuel.DIESEL;
            default: throw new WrongEnumTypeException("Wrong type fuel");
        }
    }
}
