package Controller;

import Exceptions.*;
import Model.*;
import Views.IView;
import Views.View;


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
        } catch (NumbersDataException e) {
            System.out.println("ФИО не может содержать цифры!");
        } catch (YearBirthdayFormatException e) {
            System.out.println("Дата рождения, формата - (dd.mm.yyyy)");
        } catch (PhoneException e) {
            System.out.println("Неверно введен номер телефона, 11 цифр, без +");
        } catch (SexFormatException e) {
            System.out.println("Пол может быть только: f - женский, m - мужской");
        }
    }
    IView iView = new View();

    public void getiView() {
        iView.fileWrite(check);
    }
}
