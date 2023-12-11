package Exceptions;

public class NoFormatDataException extends Exception{
    int size;
    public NoFormatDataException(){
    }

    public NoFormatDataException(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
