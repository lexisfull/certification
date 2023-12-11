package Model;

public class CheckData {
    private String[] data;

    public String[] checkData(String[] data) {
        if(data == null && data.length < 6){
            for (int i = 0; i < 2; i++) {
                if(Character.isDigit(data[i].charAt(i))){
                    System.out.println("ФИО не может содержать цифр");
                }
        }
        return null;
    }
}
