package Model;

import Exceptions.NoFormatDataException;

public interface ICheckData {
    String[] checkData(String[] string) throws NoFormatDataException;
}
