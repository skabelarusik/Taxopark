package by.epam.taxopark.dataread;

import by.epam.taxopark.entity.TypeFuel;
import by.epam.taxopark.entity.TypeTransport;
import by.epam.taxopark.exception.WrongEnumTypeException;
import by.epam.taxopark.resourses.ParametresTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class EnumTypeSelectorTest {

    @Test
    public void testSelectTypeTransport () throws WrongEnumTypeException {
        TypeTransport expected = TypeTransport.CAR;
        Assert.assertEquals(EnumTypeSelector.selectTypeTransport(ParametresTest.TYPE), expected);
    }

    @Test(expectedExceptions = WrongEnumTypeException.class)
    public void testSelectTypeTransportWrongType() throws WrongEnumTypeException {
        EnumTypeSelector.selectTypeTransport(ParametresTest.WRONG_STRING_VAR);
    }

    @Test(expectedExceptions = WrongEnumTypeException.class)
    public void testSelectTypeTransportNullType() throws WrongEnumTypeException {
        EnumTypeSelector.selectTypeTransport(ParametresTest.NULL);
    }

    @Test
    public void testSelectTypeMicrobus () throws WrongEnumTypeException {
        TypeTransport.TypeMicrobus expected = TypeTransport.TypeMicrobus.GAZEL;
        Assert.assertEquals(EnumTypeSelector.selectTypeMicrobus(ParametresTest.NAME_MICROBUS), expected);
    }

    @Test(expectedExceptions = WrongEnumTypeException.class)
    public void testSelectTypeMicrobusWrongType() throws WrongEnumTypeException {
        EnumTypeSelector.selectTypeMicrobus(ParametresTest.WRONG_STRING_VAR);
    }

    @Test(expectedExceptions = WrongEnumTypeException.class)
    public void testSelectTypeMicrobusNullType() throws WrongEnumTypeException {
        EnumTypeSelector.selectTypeMicrobus(ParametresTest.NULL);
    }

    @Test
    public void testSelectTypeBus() throws WrongEnumTypeException {
        TypeTransport.TypeBus expected = TypeTransport.TypeBus.MAZ;
        Assert.assertEquals(EnumTypeSelector.selectTypeBus(ParametresTest.NAME_BUS), expected);
    }

    @Test(expectedExceptions = WrongEnumTypeException.class)
    public void testSelectTypeBusWrongType() throws WrongEnumTypeException {
        EnumTypeSelector.selectTypeBus(ParametresTest.WRONG_STRING_VAR);
    }

    @Test(expectedExceptions = WrongEnumTypeException.class)
    public void testSelectTypeBusNullType() throws WrongEnumTypeException {
        EnumTypeSelector.selectTypeBus(ParametresTest.NULL);
    }

    @Test
    public void testSelectTypeCar() throws WrongEnumTypeException {
        TypeTransport.TypeCar expected = TypeTransport.TypeCar.TOYOTA;
        Assert.assertEquals(EnumTypeSelector.selectTypeCar(ParametresTest.NAME), expected);
    }

    @Test(expectedExceptions = WrongEnumTypeException.class)
    public void testSelectTypeCarWrongType() throws WrongEnumTypeException {
        EnumTypeSelector.selectTypeCar(ParametresTest.WRONG_STRING_VAR);
    }

    @Test(expectedExceptions = WrongEnumTypeException.class)
    public void testSelectTypeCarNullType() throws WrongEnumTypeException {
        EnumTypeSelector.selectTypeCar(ParametresTest.NULL);
    }

    @Test
    public void testSelectTypeFuel() throws WrongEnumTypeException {
        TypeFuel expected = TypeFuel.GAZ;
        Assert.assertEquals(EnumTypeSelector.selectTypeFuel(ParametresTest.FUEL),expected);
    }

    @Test(expectedExceptions = WrongEnumTypeException.class)
    public void testSelectTypeFuelWrongData() throws WrongEnumTypeException {
        EnumTypeSelector.selectTypeFuel(ParametresTest.WRONG_STRING_VAR);
    }

    @Test (expectedExceptions = WrongEnumTypeException.class)
    public void testSelectTypeFuelNullData() throws WrongEnumTypeException {
        EnumTypeSelector.selectTypeFuel(ParametresTest.NULL);
    }




}
