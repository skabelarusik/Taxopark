package by.epam.taxopark.validator;
import by.epam.taxopark.entity.TypeFuel;
import by.epam.taxopark.entity.TypeTransport;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class Checker {

    private static final Logger LOGGER = LogManager.getLogger();

    public static boolean checkType(String type){
        boolean status = false;
        if(type != null && (type.equals(TypeTransport.MICROBUS.name()) || type.equals(TypeTransport.BUS.name()) ||
                type.equals(TypeTransport.CAR.name()))){
            status = true;
        }else{
            LOGGER.debug("wrong type");
        }

        return status;
    }

    public static boolean checkName (String type, String name) {
        boolean status = false;

        if(type != null && name != null) {
            name = name.toUpperCase();
            if (type.equals(TypeTransport.MICROBUS.name())) {
                if (name.equals(TypeTransport.TypeMicrobus.GAZEL.name()) || name.equals(TypeTransport.TypeMicrobus.MERSEDES.name()) ||
                        name.equals(TypeTransport.TypeMicrobus.PEUGEOT.name())) {
                    status = true;
                }
            } else {
                if (type.equals(TypeTransport.CAR.name())) {
                    if (name.equals(TypeTransport.TypeCar.TOYOTA.name()) || name.equals(TypeTransport.TypeCar.LADA.name()) ||
                            name.equals(TypeTransport.TypeCar.GEELY.name()) || name.equals(TypeTransport.TypeCar.HYUNDAY.name())) {
                        status = true;
                    }
                } else {
                    if (name.equals(TypeTransport.TypeBus.MERSEDES.name()) || name.equals(TypeTransport.TypeBus.MAZ.name()) ||
                            name.equals(TypeTransport.TypeBus.IKARUS.name())) {
                        status = true;
                    }
                }
            }
        }

        return status;
    }

    public static boolean checkAge(String age) {
        boolean status = false;

        if (age != null) {
            int temp = Integer.parseInt(age);

            if (temp >= 0 && temp <= 20) {
                status = true;
            }
        }

        return status;
    }

    public static boolean checkTypeFuel(String typeFuel) {
        boolean status = false;

        if(typeFuel != null){
            String temp = typeFuel.toUpperCase();

            if(temp.equals(TypeFuel.DIESEL.name()) || temp.equals(TypeFuel.GAZ.name()) || temp.equals(TypeFuel.PETROL.name())){
                status = true;
            }
        }

        return status;
    }

    public static boolean checkFuelFlow(String fuelFlow) {
        boolean status = false;

        if(fuelFlow != null) {
            double temp = Double.parseDouble(fuelFlow);
            if (temp > 0 && temp <= 25) {
                status = true;
            }
        }

        return status;
    }

    public static boolean checkPassangerCount (String passCount) {
        boolean status = false;

        if(passCount != null) {
            int temp = Integer.parseInt(passCount);
            if (temp > 0 && temp <= 60) {
                status = true;
            }
        }

        return status;
    }

    public static boolean checkCost (String cost) {
        boolean status = false;

        if(cost != null){
            int temp = Integer.parseInt(cost);
            if(temp > 0 && temp <= 300000) {
                status = true;
            }
        }

        return status;
    }
}
