package Controller;

import Exceptions.NoFormatDataException;
import Model.*;

import java.util.Arrays;

public class Controller {
   IRequestData iRequestData = new RequestData();
   IParser iParser = new Parser();
    ICheckData iCheckData = new CheckData();
   String[] check;

    {
        try {
            check = iCheckData.checkData(iParser.data(iRequestData));
        } catch (NoFormatDataException e) {
            System.out.println("Неправильный формат ввода, всего " + e.getSize() + " значений, должно быть 6!");;
        }
    }

}
