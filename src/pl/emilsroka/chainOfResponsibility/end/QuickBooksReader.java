package pl.emilsroka.chainOfResponsibility.end;

public class QuickBooksReader extends DataReader {
    static final String extension = ".qbw";

    @Override
    protected boolean doRead(String fileName) {
        if(!fileName.endsWith(extension))
            return false;

        System.out.println("Reading data from a QuickBooks file.");
        return true;
    }
}
