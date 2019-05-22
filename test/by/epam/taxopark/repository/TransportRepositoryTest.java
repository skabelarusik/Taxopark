package by.epam.taxopark.repository;

import by.epam.taxopark.comparator.CostComporator;
import by.epam.taxopark.entity.Transport;
import by.epam.taxopark.entity.TypeFuel;
import by.epam.taxopark.entity.TypeTransport;
import by.epam.taxopark.entity.bus.Ikarus;
import by.epam.taxopark.entity.car.Geely;
import by.epam.taxopark.entity.car.Toyota;
import by.epam.taxopark.resourses.ParametresTest;
import by.epam.taxopark.specification.Specification;
import by.epam.taxopark.specification.TypeSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class TransportRepositoryTest {

    private Repository transportRepository = new TransportRepository();
    private Transport car1 = new Toyota(TypeTransport.CAR, "TOYOTA", 5000, 6.5 , TypeFuel.PETROL,
            10, 4, "Green");
    private Transport car2 = new Geely(TypeTransport.CAR, "GEELY", 3000, 7.0, TypeFuel.DIESEL, 14,
            4, "Red");
    private Transport bus = new Ikarus(TypeTransport.BUS, "IKARUS", 12000, 12.5, TypeFuel.DIESEL, 18,
            45, "Grey");
    private final Transport nullTransport = null;

    private final Comparator<Transport> costComparator = new CostComporator();
    private final Comparator<Transport> nullCostComparator = null;
    private final Specification typeSpecification = new TypeSpecification(TypeTransport.CAR);
    private final Specification nullSpecification = null;

    private final int UpdateCostPercent = 20;
    private final int age = 12;
    private final int expectedCost = 2400;

    private final int summ = 20000;

    {
        transportRepository.add(car1);
        transportRepository.add(car2);
        transportRepository.add(bus);
    }
    public TransportRepositoryTest() throws Exception {
    }

    @Test
    public void testAdd(){
        Assert.assertTrue(transportRepository.add(car1));
    }

    @Test
    public void testAddNullTransport(){
        Assert.assertFalse(transportRepository.add(nullTransport));
    }

    @Test
    public void testRemove(){
        Assert.assertTrue(transportRepository.remove(0));
    }

    @Test
    public void testRemoveIdMoreSize(){
        transportRepository.add(car1);
        Assert.assertFalse(transportRepository.remove(4));
    }

    @Test
    public void testSort(){
        List<Transport> expected = new ArrayList<>();
        expected.add(car2);
        expected.add(car1);
        expected.add(bus);

        Assert.assertEquals(transportRepository.sort(costComparator), expected);
    }

    @Test
    public void testSortNullComparator(){
        Repository expected = null;
        Assert.assertEquals(transportRepository.sort(nullCostComparator), expected);
    }

    @Test
    public void testSortSpecAndComporator(){
        List<Transport> expected = new ArrayList<>();
        expected.add(car2);
        expected.add(car1);

        Assert.assertEquals(transportRepository.sort(typeSpecification, costComparator), expected);
    }

    @Test
    public void testSortNullSpecif(){
        Repository expected = null;
        Assert.assertEquals(transportRepository.sort(nullSpecification, costComparator), expected);
    }

    @Test
    public void testSummCost(){
        int expected = summ;
        Assert.assertEquals(transportRepository.summCost(), expected);
    }

    @Test
    public void testQuery(){
        List<Transport> expected = new ArrayList<>();
        expected.add(car1);
        expected.add(car2);

        Assert.assertEquals(transportRepository.query(typeSpecification), expected);
    }

    @Test
    public void testQueryNullSpecific(){
        List<Transport> expected = null;
        Assert.assertEquals(transportRepository.query(nullSpecification), expected);
    }
}
