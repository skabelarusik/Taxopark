package by.epam.taxopark.repository;

import by.epam.taxopark.entity.Transport;
import by.epam.taxopark.specification.Specification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author Andrey Krupin
 * was created between 01.05.2019 and 14.05.2019
 */

public class TransportRepository implements Repository {

    private List<Transport> listTransports;

    private static final Logger LOGGER = LogManager.getLogger();

    public TransportRepository(){
        listTransports = new ArrayList<>();
    }

    public List<Transport> getListTransports() {
        return listTransports;
    }

    @Override
    public boolean add(Transport transport) {
        boolean status = true;

        if(transport != null){
            listTransports.add(transport);
            LOGGER.debug(transport + " was added");
        }else{
            status = false;
        }

        return status;
    }

    @Override
    public boolean remove(int id)  {
        boolean status = true;

        if(id < listTransports.size() && id >= 0){
            listTransports.remove(id);
            LOGGER.debug(transport + " was removed");
        } else{
            status = false;
        }
        return status;
    }

    @Override
    public List<Transport> sort(Comparator comparator) {
        List<Transport> sortedList= null;
        if(comparator != null){
            sortedList = (List<Transport>) listTransports.stream().sorted(comparator).collect(Collectors.toList());
        }
        return sortedList;
    }

    @Override
    public List<Transport> sort(Specification specification, Comparator comparator) {
        List<Transport> temp = null;
        List<Transport> sortedList = null;
        if(comparator != null && specification != null){
            temp = new ArrayList<>();
            for(Transport x : listTransports){
                if(specification.specify(x)){
                    temp.add(x);
                }
            }
            sortedList = (List<Transport>) temp.stream().sorted(comparator).collect(Collectors.toList());
        }
        return sortedList;
    }

    @Override
    public int size() {
        return listTransports.size();
    }

    @Override
    public void updateCost(int age, int percent) {
        if(age > 0 && percent < 100 && percent > 0) {
            for (Transport x : listTransports) {
                if (x != null && age > x.getAge()) {
                    x.setCost(x.getCost() * percent / 100);
                    LOGGER.debug(x + "cost was updated");
                }
            }
        }
    }

    @Override
    public List<Transport> query(Specification specification) {
        List<Transport> list = null;

        if(specification != null){
            list = new ArrayList<>();

            for(Transport x : listTransports){
                if(specification.specify(x)){
                    list.add(x);
                }
            }
        }
        return list;
    }

    @Override
    public int summCost(){
        int sum = 0;

        for(Transport x : listTransports){
                sum += x.getCost();
        }

        return sum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransportRepository that = (TransportRepository) o;
        return Objects.equals(listTransports, that.listTransports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listTransports);
    }
}
