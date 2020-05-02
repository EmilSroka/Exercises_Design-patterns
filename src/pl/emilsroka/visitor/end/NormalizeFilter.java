package pl.emilsroka.visitor.end;

public class NormalizeFilter implements Filter {
    @Override
    public void apply(Segment segment) {
        System.out.println("Normalize");
    }
}
