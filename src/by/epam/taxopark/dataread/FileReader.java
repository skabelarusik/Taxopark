package by.epam.taxopark.dataread;

import by.epam.taxopark.exception.FileNotFoundException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class FileReader {

    private static final Logger LOGGER = LogManager.getLogger();

    private static List<String> listTransports;

    public static List<String> fillingList (String pathFile) throws FileNotFoundException {

        if(pathFile == null){
            throw new FileNotFoundException("path is null");
        }

         listTransports = new ArrayList<>();

        try (Stream<String> lineStream = Files.lines(Paths.get(pathFile))) {
            LOGGER.debug("File was readed : " + pathFile);
            listTransports = lineStream.collect(Collectors.toList());
        } catch (IOException e) {
            throw new FileNotFoundException("Wrong path");
        }

        return listTransports;
    }

}
