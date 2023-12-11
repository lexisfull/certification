import Controller.Controller;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        try{
            controller.getiView();
        } catch (NullPointerException e){
            System.out.println("Пример вводимых данных: Иванов Иван Иваныч 28.03.1975 79892420235 m");
        }
    }
}