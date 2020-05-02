package pl.emilsroka.visitor.end;

public class ReduceNoiseFilter implements Filter {
    @Override
    public void apply(FormatSegment segment) {
        System.out.println("Reduce noise in FormatSegment");
    }

    @Override
    public void apply(FactSegment segment) {
        System.out.println("Reduce noise in FactSegment");
    }
}
