package by.epam.taxopark.factory;

import by.epam.taxopark.dataread.EnumTypeSelector;
import by.epam.taxopark.entity.car.Geely;
import by.epam.taxopark.entity.car.Hyundai;
import by.epam.taxopark.entity.car.Lada;
import by.epam.taxopark.entity.car.Toyota;
import by.epam.taxopark.entity.bus.Ikarus;
import by.epam.taxopark.entity.bus.Maz;
import by.epam.taxopark.entity.bus.MersedesBus;
import by.epam.taxopark.entity.microbus.Gazel;
import by.epam.taxopark.entity.microbus.Mersedes;
import by.epam.taxopark.entity.microbus.Peugeot;
import by.epam.taxopark.entity.Transport;
import by.epam.taxopark.entity.TypeFuel;
import by.epam.taxopark.entity.TypeTransport;
import by.epam.taxopark.exception.CustomException;
import by.epam.taxopark.exception.WrongEnumTypeException;
import by.epam.taxopark.validator.ValidatorVar;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class FabrikTransportCreator {
    private static String name;
    private static int cost;
    private static double fuel_flow;
    private static TypeFuel typeFuel;
    private static int age;
    private static int passengerCount;
    private static String color;

    private static void addVar (String [] masParam) throws WrongEnumTypeException, CustomException {
        cost = Integer.parseInt(masParam[2]);
        fuel_flow = Double.parseDouble(masParam[3]);
        typeFuel = EnumTypeSelector.selectTypeFuel(masParam[4].toUpperCase().trim());
        age = Integer.parseInt(masParam[5]);
        passengerCount = Integer.parseInt(masParam[6]);
        color = masParam[7];

    }

    public static Transport createCar(String [] masParam) throws Exception {
        if(masParam == null || !ValidatorVar.isValidateVar(masParam)){
            throw new CustomException("Massiv parametrs is null or wrong");
        }

        name = masParam[1].trim().toUpperCase();

        switch (name){
            case "TOYOTA":
                addVar(masParam);
                return new Toyota(TypeTransport.CAR, name, cost, fuel_flow, typeFuel,
                    age, passengerCount, color);
            case "GEELY":
                addVar(masParam);
                return new Geely(TypeTransport.CAR, name, cost, fuel_flow, typeFuel,
                    age, passengerCount, color);
            case "HYUNDAY":
                addVar(masParam);
                return new Hyundai(TypeTransport.CAR, name, cost, fuel_flow, typeFuel,
                    age, passengerCount, color);
            case "LADA" :
                addVar(masParam);
                return new Lada(TypeTransport.CAR, name, cost, fuel_flow, typeFuel,
                    age, passengerCount, color);
            default: throw new CustomException("Wrong name transport");
        }
    }

    public static Transport createBus(String [] masParam) throws Exception {
        if(masParam == null || !ValidatorVar.isValidateVar(masParam)){
            throw new CustomException("Massiv parametrs is null or wrong");
        }

        name = masParam[1].trim().toUpperCase();

        switch (name){
            case "IKARUS":
                addVar(masParam);
                return new Ikarus(TypeTransport.BUS, name, cost, fuel_flow, typeFuel,
                        age, passengerCount, color);
            case "MAZ":
                addVar(masParam);
                return new Maz(TypeTransport.BUS, name, cost, fuel_flow, typeFuel,
                        age, passengerCount, color);
            case "MERSEDES": addVar(masParam);
                return new MersedesBus(TypeTransport.BUS, name, cost, fuel_flow, typeFuel,
                        age, passengerCount, color);
            default: throw new CustomException("Wrong name transport");
        }
    }

    public static Transport createMicrobus (String [] masParam) throws Exception {
        if(masParam == null || !ValidatorVar.isValidateVar(masParam)){
            throw new CustomException("Massiv parametrs is null or wrong");
        }

        name = masParam[1].toUpperCase().trim();

        switch (name){
            case "PEUGEOT" :
                addVar(masParam);
                return new Peugeot(TypeTransport.MICROBUS, name, cost, fuel_flow, typeFuel,
                        age, passengerCount, color);
            case "GAZEL" :
                addVar(masParam);
                return new Gazel(TypeTransport.MICROBUS, name, cost, fuel_flow, typeFuel,
                        age, passengerCount, color);
            case "MERSEDES": addVar(masParam);
               return new Mersedes(TypeTransport.MICROBUS, name, cost, fuel_flow, typeFuel,
                       age, passengerCount, color);
            default: throw new CustomException("Wrong name transport");
        }
    }
}
