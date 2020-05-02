package pl.emilsroka.visitor.end;

public class AddReverbFilter implements Filter {
    @Override
    public void apply(Segment segment) {
        System.out.println("Add reverb");
    }
}
