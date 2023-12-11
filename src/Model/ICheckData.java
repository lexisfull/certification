package Model;

import Exceptions.*;

public interface ICheckData {
    String[] checkData(String[] string) throws NoFormatDataException, NumbersDataException, YearBirthdayFormatException, PhoneException, SexFormatException;
}
