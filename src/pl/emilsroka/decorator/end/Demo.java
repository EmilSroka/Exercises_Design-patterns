package pl.emilsroka.decorator.end;

public class Demo {
    public static void main (String [] args){
        show();
    }

    public static void show() {
        var editor = new Editor();
        editor.openProject("...");
    }
}
