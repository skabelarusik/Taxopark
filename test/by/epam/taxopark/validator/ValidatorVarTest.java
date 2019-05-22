package by.epam.taxopark.validator;

import by.epam.taxopark.resourses.ParametresTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class ValidatorVarTest {

    @Test
    public void testIsValidateVar() {
        Assert.assertTrue(ValidatorVar.isValidateVar(ParametresTest.CORRECT_MASSIVE_VAR));
    }

    @Test
    public void testIsValidateVarWrongType() {
        Assert.assertFalse(ValidatorVar.isValidateVar(ParametresTest.WRONG_MASSIVE_VAR));
    }

    @Test
    public void testIsValidateVarWrongStringParam(){
        Assert.assertFalse(ValidatorVar.isValidateVar(ParametresTest.WRONG_STRING_MASSIVE_VAR));
    }

    @Test
    public void testIsValidateVarWrongIntegerParam(){
        Assert.assertFalse(ValidatorVar.isValidateVar(ParametresTest.WRONG_INTEGER_MASSIVE_VAR));
    }

    @Test
    public void testIsValidateVarWrongDoubleParam(){
        Assert.assertFalse(ValidatorVar.isValidateVar(ParametresTest.WRONG_DOUBLE_MASSIVE_VAR));
    }

    @Test
    public void testIsValidateVarMassiveIsNull() {
        Assert.assertFalse(ValidatorVar.isValidateVar(ParametresTest.NULL_MASSIVE_VAR));
    }

}
