package Views;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class View implements IView{
    private String[] res;


    @Override
    public void fileWrite(String[] res){
        String fileName = res[0] + ".txt";
        String text = "";
        for (int i = 0; i < res.length; i++) {
            text += "<" + res[i] + ">";
        }
        try {
            Writer myWriter = new FileWriter(fileName, true);
            myWriter.write(text + "\n");
            myWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
