package pl.emilsroka.visitor.end;

public class ReduceNoiseFilter implements Filter {
    @Override
    public void apply(Segment segment) {
        System.out.println("Reduce noise");
    }
}
