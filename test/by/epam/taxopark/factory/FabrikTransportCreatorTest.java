package by.epam.taxopark.factory;

import by.epam.taxopark.entity.Transport;
import by.epam.taxopark.entity.TypeFuel;
import by.epam.taxopark.entity.TypeTransport;
import by.epam.taxopark.entity.bus.Ikarus;
import by.epam.taxopark.entity.car.Toyota;
import by.epam.taxopark.entity.microbus.Gazel;
import by.epam.taxopark.exception.CustomException;
import by.epam.taxopark.resourses.ParametresTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 10.05.2019
 */

public class FabrikTransportCreatorTest {

    @Test
    public void testCreateCar() throws Exception {
        Transport expected = new Toyota(TypeTransport.CAR, "TOYOTA", 5000, 4.5, TypeFuel.GAZ,
                14, 4, "Green");
        Assert.assertEquals(FabrikTransportCreator.createCar(ParametresTest.CORRECT_MASSIVE_VAR), expected);
    }

    @Test(expectedExceptions = CustomException.class)
    public void testCreateCarNullParam() throws Exception {
        FabrikTransportCreator.createCar(ParametresTest.NULL_MASSIVE_VAR);
    }

    @Test (expectedExceptions = CustomException.class)
    public void testCreateCarWrongParam() throws Exception {
        FabrikTransportCreator.createCar(ParametresTest.WRONG_MASSIVE_VAR);
    }

    @Test
    public void testCreateBus() throws Exception {
        Transport expected = new Ikarus(TypeTransport.BUS, "IKARUS", 5000, 4.5, TypeFuel.GAZ,
                14, 4, "Green");
        Assert.assertEquals(FabrikTransportCreator.createBus(ParametresTest.CORRECT_MASSIVE_BUS), expected);
    }

    @Test(expectedExceptions = CustomException.class)
    public void testCreateBusNullParam() throws Exception {
        FabrikTransportCreator.createBus(ParametresTest.NULL_MASSIVE_VAR);
    }

    @Test (expectedExceptions = CustomException.class)
    public void testCreateBusWrongParam() throws Exception {
        FabrikTransportCreator.createBus(ParametresTest.WRONG_MASSIVE_VAR);
    }

    @Test
    public void testCreateMicrobus() throws Exception {
        Transport expected = new Gazel(TypeTransport.MICROBUS, "GAZEL", 5000, 4.5, TypeFuel.GAZ,
                14, 4, "Green");
        Assert.assertEquals(FabrikTransportCreator.createMicrobus(ParametresTest.CORRECT_MASSIVE_MICROBUS), expected);
    }

    @Test(expectedExceptions = CustomException.class)
    public void testCreateMicrobusNullParam() throws Exception {
        FabrikTransportCreator.createMicrobus(ParametresTest.NULL_MASSIVE_VAR);
    }

    @Test (expectedExceptions = CustomException.class)
    public void testCreateMicrobusWrongParam() throws Exception {
        FabrikTransportCreator.createMicrobus(ParametresTest.WRONG_MASSIVE_VAR);
    }

}
