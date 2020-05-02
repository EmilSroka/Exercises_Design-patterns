package pl.emilsroka.visitor.end;

public class AddReverbFilter implements Filter {

    @Override
    public void apply(FormatSegment segment) {
        System.out.println("Add reverb to FormatSegment");
    }

    @Override
    public void apply(FactSegment segment) {
        System.out.println("Add reverb to FactSegment");
    }
}
