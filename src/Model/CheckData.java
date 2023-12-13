package Model;

import Exceptions.*;

import java.util.Arrays;

public class CheckData implements ICheckData{
    String[] data;
    @Override
    public String[] checkData(String[] data) throws NoFormatDataException, NumbersDataException, YearBirthdayFormatException, PhoneException, SexFormatException {
        boolean hasDigit = false;
        boolean onlyDigit = true;
        boolean phone = true;
//        Проверка длины массива на количество введенных данных
        if(data.length != 6) throw new NoFormatDataException(data.length);
        for (int i = 0; i < data.length; i++) {
//            Проверка ФИО на цифры
            if(i <= 2) {
                for (int j = 0; j < data[i].length() && !hasDigit; j++) {
                    if (Character.isDigit(data[i].charAt(j))) {
                        hasDigit = true;
                    }

                }
            }
            // Проверка верности введения даты рождения
            if(i == 3){
                // Распарсиваем дату рождения          если вместо точки запятая меняем на точку    переписываем точку на пробел
                String[] yearBirthday = data[i].replace(",", ".").replace(".", " ").split(" ");
                for (int j = 0; j < yearBirthday.length; j++) {
                    for (int k = 0; k < yearBirthday[j].length() && onlyDigit; k++) {
                        if(!Character.isDigit(yearBirthday[j].charAt(k)) || yearBirthday.length < 3
                                || yearBirthday[0].length() != 2 || yearBirthday[1].length() != 2
                                || yearBirthday[2].length() != 4){
                            onlyDigit = false;
                        }
                    }
                }
            }
            // Проверяем телефон на цифры и длину
            if(i == 4){
                for (int j = 0; j < data[4].length(); j++) {
                    for (int k = 0; k < data[4].length() && phone; k++) {
                        if(!Character.isDigit(data[4].charAt(k)) || data[4].length() != 11){
                            phone = false;
                        }

                    }
                }
            }
            // Проверяем правильно ли указан пол
            if(i == 5){
                if(data[5].charAt(0) != 'm' && data[5].charAt(0) != 'f') throw new SexFormatException();
            }
        }
        if(hasDigit) throw new NumbersDataException();
        if(!onlyDigit) throw new YearBirthdayFormatException();
        if(!phone) throw new PhoneException();

        return data;
    }
}
