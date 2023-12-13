package Model;

import java.util.Scanner;

public class RequestData implements IRequestData {
    private String value;

    public String prompt(){
        System.out.println("Введите через пробел: \nФамилия Имя Отчество,\n" +
                "при отстутствии отчества введите - нет\n" +
                "дата рождения, формата - (dd.mm.yyyy),\n" +
                "номер телефона без префикса \"+\",\n" +
                "пол: f - женский, m - мужской. \n");
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextLine();
        return value;
    }
}
