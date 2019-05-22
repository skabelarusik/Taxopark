package by.epam.taxopark.creator;

import by.epam.taxopark.exception.CustomException;
import by.epam.taxopark.resourses.ParametresTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class CreatorMassivVarTest {

    @Test
    public void testCreateParametresFromTextString() throws CustomException {
        String [] expected = ParametresTest.STRING_VAR_AFTER_SPLIT;
        Assert.assertEquals(CreatorMassivVar.createParametresFromTextString(ParametresTest.STRING_VAR_BEFORE_SPLIT), expected);
    }

    @Test(expectedExceptions = CustomException.class)
    public void testCreateParametresFromTextStringNullTest() throws CustomException {
        CreatorMassivVar.createParametresFromTextString(ParametresTest.NULL);
    }
}
