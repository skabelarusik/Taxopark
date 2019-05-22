package by.epam.taxopark.validator;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class ValidatorVar {

    public final static String VALIDATE_TEXT_PARAM = "[a-zA-Z]+";
    public final static String VALIDATE_INT_PARAM = "[-+]?\\d+";
    public final static String VALIDATE_DOUBLE_PARAM = "((-|\\+)?[0-9]+(\\.[0-9]+)?)+";

    private static final Logger LOGGER = LogManager.getLogger();

    public static boolean isValidateVar (String [] strVar) {
        boolean valid = true;

        //is string valid?
        if(strVar != null && strVar.length == 8){
            String type = strVar[0];
            String name = strVar[1];
            String cost = strVar[2];
            String fuelFlow = strVar[3];
            String typeFuel = strVar[4];
            String age = strVar[5];
            String passengerCount = strVar[6];
            String color = strVar[7];

            //check valid each variable on regular expression
            if(isValidateTextParametres(type) && isValidateTextParametres(name) &&
                 isValidateIntegerParametres(cost) && isValidateDoubleNumberParametres(fuelFlow) &&
                 isValidateTextParametres(typeFuel) && isValidateIntegerParametres(age) &&
                 isValidateIntegerParametres(passengerCount) && isValidateTextParametres(color)){
                    type = type.toUpperCase();
                        if(Checker.checkType(type)){
                            //check range variables
                            if(!Checker.checkName(type, name) || !Checker.checkCost(cost) || !Checker.checkFuelFlow(fuelFlow) ||
                                !Checker.checkTypeFuel(typeFuel) || !Checker.checkAge(age) ||
                                    !Checker.checkPassangerCount(passengerCount)){
                                valid = false;
                                LOGGER.debug("wrong range variables");
                            }
                        }else{
                            valid = false;
                            LOGGER.debug("wrong range variables");
                        }
                } else {
                LOGGER.debug("wrong type");
                }
            } else {
            valid = false;
            LOGGER.debug("Not validate variables");
        }

        return valid;
    }

    //Is string?
    private static boolean isValidateTextParametres (String strText) {
        boolean status = false;

        if(strText != null){
            status = strText.matches(VALIDATE_TEXT_PARAM);
        }

        return status;
    }

    //Is integer?
    private static boolean isValidateIntegerParametres (String strInt) {
        boolean status = false;

        if(strInt != null){
            status = strInt.matches(VALIDATE_INT_PARAM);
        }

        return status;
    }

    //is double?
    private static boolean isValidateDoubleNumberParametres (String strDouble) {
        boolean status = false;

        if(strDouble != null){
            status = strDouble.matches(VALIDATE_DOUBLE_PARAM);
        }

        return status;
    }
}
