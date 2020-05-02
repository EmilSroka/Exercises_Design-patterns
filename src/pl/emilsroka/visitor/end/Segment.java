package pl.emilsroka.visitor.end;

interface Segment {
    void accept(Filter filter);
}
