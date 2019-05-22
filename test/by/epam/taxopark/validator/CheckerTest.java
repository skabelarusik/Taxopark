package by.epam.taxopark.validator;

import by.epam.taxopark.resourses.ParametresTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class CheckerTest {

    @Test
    public void testCheckType(){
        Assert.assertTrue(Checker.checkType(ParametresTest.TYPE));
    }

    @Test
    public void testCheckTypeTestIfWrongVar(){
        Assert.assertFalse(Checker.checkType(ParametresTest.WRONG_STRING_VAR));
    }

    @Test
    public void testCheckTypeTestIfVarIsNull(){
        Assert.assertFalse(Checker.checkType(ParametresTest.NULL));
    }

    @Test
    public void testCheckNameTest (){
        Assert.assertTrue(Checker.checkName(ParametresTest.TYPE, ParametresTest.NAME));
    }

    @Test
    public void testCheckNameTestIfWrongVar() {
        Assert.assertFalse(Checker.checkName(ParametresTest.TYPE, ParametresTest.WRONG_STRING_VAR));
    }

    @Test
    public void testCheckNameTestIfVarIsNull() {
        Assert.assertFalse(Checker.checkName(ParametresTest.TYPE, ParametresTest.NULL));
    }

    @Test
    public void testCheckTypeFuelTest() {
        Assert.assertTrue(Checker.checkTypeFuel(ParametresTest.FUEL));
    }

    @Test
    public void testCheckTypeFuelTestIfWrongFuel() {
        Assert.assertFalse(Checker.checkTypeFuel(ParametresTest.WRONG_STRING_VAR));
    }

    @Test
    public void testCheckTypeFuelTestIfVarIsNull() {
        Assert.assertFalse(Checker.checkTypeFuel(ParametresTest.NULL));
    }

    @Test
    public void testCheckAgeTest() {
        Assert.assertTrue(Checker.checkAge(ParametresTest.CORRECT_INTEGER));
    }

    @Test
    public void testCheckAgeTestIfWrongVar() {
        Assert.assertFalse(Checker.checkAge(ParametresTest.WRONG_INT));
    }

    @Test
    public void testCheckAgeTestIfNegativeVar() {
        Assert.assertFalse(Checker.checkAge(ParametresTest.NEGATIVE_INT));
    }

    @Test
    public void testCheckFuelFlowTest() {
        Assert.assertTrue(Checker.checkFuelFlow(ParametresTest.CORRECT_INTEGER));
    }

    @Test
    public void testCheckFuelFlowIfWrongVar() {
        Assert.assertFalse(Checker.checkFuelFlow(ParametresTest.WRONG_INT));
    }

    @Test
    public void testCheckFuelFlowIfNegativeVar() {
        Assert.assertFalse(Checker.checkFuelFlow(ParametresTest.NEGATIVE_INT));
    }

    @Test
    public void testCheckPassangerCountTest() {
        Assert.assertTrue(Checker.checkPassangerCount(ParametresTest.CORRECT_INTEGER));
    }

    @Test
    public void testCheckPassangerCountTestIfWrongVar() {
        Assert.assertFalse(Checker.checkPassangerCount(ParametresTest.WRONG_INT));
    }

    @Test
    public void testCheckPassangerCountTestIfNegativeVar() {
        Assert.assertFalse(Checker.checkPassangerCount(ParametresTest.NEGATIVE_INT));
    }

    @Test
    public void testCheckCostTest() {
        Assert.assertTrue(Checker.checkCost(ParametresTest.CORRECT_INTEGER));
    }

    @Test
    public void testCheckCostTestIfWrongVar() {
        Assert.assertFalse(Checker.checkCost(ParametresTest.WRONG_INT));
    }

    @Test
    public void testCheckCostTestIfNegativeVar() {
        Assert.assertFalse(Checker.checkCost(ParametresTest.NEGATIVE_INT));
    }
}
