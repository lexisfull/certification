package Model;

import Exceptions.NoFormatDataException;

public class CheckData implements ICheckData{
    String[] data;
    @Override
    public String[] checkData(String[] data) throws NoFormatDataException{
        if(data.length != 6) throw new NoFormatDataException(data.length);

        return data;
    }
}
