package by.epam.taxopark.factory;

import by.epam.taxopark.creator.CreatorMassivVar;
import by.epam.taxopark.entity.Transport;
import by.epam.taxopark.exception.CustomException;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class TransportCreator {


    public static Transport createFabrik(String  transpParam) throws Exception {
        if(transpParam == null){
            throw new CustomException("Wrong type transport");
        }

        Transport transport;
        String [] masVar = CreatorMassivVar.createParametresFromTextString(transpParam);
        String type = masVar[0].toUpperCase();

        switch (type){
            case "CAR" : transport = FabrikTransportCreator.createCar(masVar); break;
            case "BUS" : transport = FabrikTransportCreator.createBus(masVar); break;
            case "MICROBUS" : transport = FabrikTransportCreator.createMicrobus(masVar); break;
            default  : throw new CustomException("Wrong type transport");
        }

        return transport;
    }

}
