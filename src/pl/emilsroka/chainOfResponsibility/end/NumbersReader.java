package pl.emilsroka.chainOfResponsibility.end;

public class NumbersReader extends DataReader {
    static final String extension = ".numbers";

    @Override
    protected boolean doRead(String fileName) {
        if(!fileName.endsWith(extension))
            return false;

        System.out.println("Reading data from a Numbers spreadsheet.");
        return true;
    }
}
