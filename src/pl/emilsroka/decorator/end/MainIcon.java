package pl.emilsroka.decorator.end;

public class MainIcon implements Decorator {
    Decorator previous;

    public MainIcon(Decorator item){
        previous = item;
    }

    @Override
    public String render() {
        return previous.render() + " [Main]";
    }
}
