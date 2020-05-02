package pl.emilsroka.visitor.end;

public class FormatSegment implements Segment {
    public void accept(Filter filter){
        filter.apply(this);
    }
}
