package Model;
/* Класс принимает полученные данные из RequestData и
и рспарсивает их в массив строк
 */
public class Parser implements IParser{
    private String[] data;
    @Override
    public String[] data(IRequestData requestData) {
        data = requestData.prompt().trim().split(" ");
        return data;
    }


}
