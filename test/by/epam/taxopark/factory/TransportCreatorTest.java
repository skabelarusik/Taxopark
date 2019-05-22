package by.epam.taxopark.factory;

import by.epam.taxopark.entity.TypeFuel;
import by.epam.taxopark.entity.TypeTransport;
import by.epam.taxopark.entity.car.Toyota;
import by.epam.taxopark.exception.CustomException;
import by.epam.taxopark.resourses.ParametresTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import by.epam.taxopark.entity.Transport;
import by.epam.taxopark.entity.car.Toyota;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 10.05.2019
 */

public class TransportCreatorTest {

    @Test
    public void testCreateFabrik() throws Exception {
        Transport expected = new Toyota(TypeTransport.CAR, "TOYOTA", 5000, 4.5, TypeFuel.GAZ,
                14, 4, "Green");
        Assert.assertEquals(TransportCreator.createFabrik(ParametresTest.CORRECT_TRANSP_PARAM), expected);
    }

    @Test(expectedExceptions = CustomException.class)
    public void testCreateFabrikNullParam() throws Exception {
        TransportCreator.createFabrik(ParametresTest.NULL);
    }

    @Test(expectedExceptions = CustomException.class)
    public void testCreateFabrikWrongParam() throws Exception {
        TransportCreator.createFabrik(ParametresTest.WRONG_STRING_VAR);
    }
}
