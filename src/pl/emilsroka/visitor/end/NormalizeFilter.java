package pl.emilsroka.visitor.end;

public class NormalizeFilter implements Filter {
    @Override
    public void apply(FormatSegment segment) {
        System.out.println("Normalize FormatSegment");
    }

    @Override
    public void apply(FactSegment segment) {
        System.out.println("Normalize FactSegment");
    }
}
