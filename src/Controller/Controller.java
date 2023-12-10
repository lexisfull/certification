package Controller;

import Model.IParser;
import Model.IRequestData;
import Model.Parser;
import Model.RequestData;

import java.util.Arrays;

public class Controller {
   IRequestData iRequestData = new RequestData();
   IParser iParser = new Parser();
   String[] data = iParser.data(iRequestData);

   @Override
   public String toString() {
      return "Controller{" +
              "data=" + Arrays.toString(data) +
              '}';
   }
}
