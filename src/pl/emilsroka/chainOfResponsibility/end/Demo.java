package pl.emilsroka.chainOfResponsibility.end;

public class Demo {
    public static void main(String [] args){
        show();
    }

    public static void show() {
        var excel = new ExcelReader();
        var numbers = new NumbersReader();
        var quickBooks = new QuickBooksReader();

        excel.setNext(numbers);
        numbers.setNext(quickBooks);

        var reader = excel;
        reader.read("data.xls");
        reader.read("data.numbers");
        reader.read("data.qbw");
        reader.read("data.jpg");
    }
}
