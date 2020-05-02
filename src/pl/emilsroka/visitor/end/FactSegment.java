package pl.emilsroka.visitor.end;

public class FactSegment implements Segment {
    public void accept(Filter filter){
        filter.apply(this);
    }
}
