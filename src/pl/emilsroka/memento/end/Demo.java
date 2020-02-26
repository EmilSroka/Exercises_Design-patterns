package pl.emilsroka.memento.end;

public class Demo {
  public static void main(String [] args){
    show();
  }

  public static void show() {
    var document = new Document();
    var history = new DocumentCaretaker();

    document.setContent("Hello");
    history.push(document.createMemento());

    document.setFontName("Font 1");
    history.push(document.createMemento());

    document.setFontSize(10);

    System.out.println(document);

    document.restore(history.pop());
    System.out.println(document);

    document.restore(history.pop());
    System.out.println(document);
  }
}
