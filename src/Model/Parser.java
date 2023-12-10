package Model;

public class Parser implements IParser{
    private String[] data;
    @Override
    public String[] data(IRequestData requestData) {
        data = requestData.prompt().trim().split(" ");
        return data;
    }


}
