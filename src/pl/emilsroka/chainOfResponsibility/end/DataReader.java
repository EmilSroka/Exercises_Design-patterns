package pl.emilsroka.chainOfResponsibility.end;

public abstract class DataReader {
    DataReader next;

    public void setNext (DataReader next) {
        this.next = next;
    }

    public void read(String fileName) {
        if(doRead(fileName))
            return;

        if (next != null)
            next.read(fileName);
        else
            throw new UnsupportedOperationException("File format not supported.");
    }

    protected abstract boolean doRead (String fileName);
}
