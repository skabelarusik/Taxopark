package by.epam.taxopark.resourses;

import by.epam.taxopark.entity.Transport;
import by.epam.taxopark.entity.TypeFuel;
import by.epam.taxopark.entity.Transport;
import by.epam.taxopark.entity.TypeTransport;
import by.epam.taxopark.entity.car.Toyota;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class ParametresTest {

    public static final String WRONG_FILE_PUTH = "wrong.txt";
    public static final String NULL = null;
    public static final String WRONG_STRING_VAR = "Wrong";

    public static final String STRING_VAR_BEFORE_SPLIT = "Car  TOYOta 4500 ";
    public static final String [] STRING_VAR_AFTER_SPLIT = {"Car","TOYOta","4500"};
    public static final String TYPE = "CAR";
    public static final String NAME = "TOYOTA";
    public static final String NAME_MICROBUS = "GAZEL";
    public static final String NAME_BUS = "MAZ";
    public static final String FUEL = "GAZ";

    public static final String CORRECT_INTEGER = "1";
    public static final String WRONG_INT = "999999";
    public static final String NEGATIVE_INT = "-55";


    public static final String CORRECT_TRANSP_PARAM = "CAR TOYOtA  5000 4.5 GaZ 14 4 Green";
    public static final String [] CORRECT_MASSIVE_VAR = {"CAR", "TOYOTA", "5000", "4.5",
            "GAZ", "14", "4", "Green"};
    public static final String [] CORRECT_MASSIVE_BUS = {"Bus", "Ikarus", "5000", "4.5",
            "GAZ", "14", "4", "Green"};
    public static final String [] CORRECT_MASSIVE_MICROBUS = {"Microbus", "GAzel", "5000", "4.5",
            "GAZ", "14", "4", "Green"};
    public static final String [] WRONG_MASSIVE_VAR = {"CAR", "123", "7"};
    public static final String [] WRONG_STRING_MASSIVE_VAR = {"CAR", "TOY12OTA", "5000", "4.5",
            "GAZ", "14", "4", "Green"};
    public static final String [] WRONG_INTEGER_MASSIVE_VAR = {"CAR", "TOYOTA", "5000.5", "4.5",
            "GAZ", "14", "4", "Green"};
    public static final String [] WRONG_DOUBLE_MASSIVE_VAR = {"CAR", "TOYOTA", "5000", "a4",
            "GAZ", "14", "4", "Green"};
    public static final String [] NULL_MASSIVE_VAR = null;

    public static final List<String> LIST_AFTER_READING = new ArrayList<>();
    public static final String FIRST_PARAM_LIST = "123";
    public static final String SECOND_PARAM_LIST = "name";
    public static final String PUTH_FILE = "test/by/epam/taxopark/resourses/test.txt";





}
