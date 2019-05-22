package by.epam.taxopark.exception;

public class WrongEnumTypeException extends Exception {

    public WrongEnumTypeException(){

    }

    public WrongEnumTypeException(String message){
        super(message);
    }
}
