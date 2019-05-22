package by.epam.taxopark.dataread;

import by.epam.taxopark.exception.FileNotFoundException;
import by.epam.taxopark.resourses.ParametresTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class FileReaderTest {


    @Test(expectedExceptions = FileNotFoundException.class)
    public void testFillingListWrongPuth() throws FileNotFoundException {
        FileReader.fillingList(ParametresTest.WRONG_FILE_PUTH);
    }

    @Test(expectedExceptions = FileNotFoundException.class)
    public void testFillingListNullPuth() throws FileNotFoundException {
        FileReader.fillingList(ParametresTest.NULL);
    }

    @Test
    public void testFillingList() throws FileNotFoundException {
        List<String> expected = ParametresTest.LIST_AFTER_READING;
        expected.add(ParametresTest.FIRST_PARAM_LIST);
        expected.add(ParametresTest.SECOND_PARAM_LIST);

        Assert.assertEquals(FileReader.fillingList(ParametresTest.PUTH_FILE), expected);
    }
}
