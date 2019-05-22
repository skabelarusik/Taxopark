package by.epam.taxopark.creator;

import by.epam.taxopark.exception.CustomException;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class CreatorMassivVar {

    private static final Logger LOGGER = LogManager.getLogger();

    public static String [] createParametresFromTextString (String stringTransports) throws CustomException {
        if(stringTransports == null){
            throw new CustomException("String is null");
        }

        String [] strParametres = stringTransports.split(" +");
        logger.debug("Massiv var was created");

        return strParametres;
    }
}
