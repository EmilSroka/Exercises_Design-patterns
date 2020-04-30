package pl.emilsroka.chainOfResponsibility.end;

public class ExcelReader extends DataReader {
    static final String extension = ".xls";

    @Override
    protected boolean doRead(String fileName) {
        if(!fileName.endsWith(extension))
            return false;

        System.out.println("Reading data from an Excel spreadsheet.");
        return true;
    }
}
