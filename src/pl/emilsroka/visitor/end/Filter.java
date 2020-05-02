package pl.emilsroka.visitor.end;

public interface Filter {
    void apply(FormatSegment segment);
    void apply(FactSegment segment);
}
