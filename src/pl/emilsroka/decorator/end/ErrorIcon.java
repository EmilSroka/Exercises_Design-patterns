package pl.emilsroka.decorator.end;

public class ErrorIcon implements Decorator {
    Decorator previous;

    public ErrorIcon(Decorator item){
        previous = item;
    }

    @Override
    public String render() {
        return previous.render() + " [Error]";
    }
}
