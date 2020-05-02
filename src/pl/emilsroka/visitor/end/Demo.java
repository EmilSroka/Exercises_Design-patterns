package pl.emilsroka.visitor.end;

public class Demo {
    public static void main(String [] args) {
        show();
    }

    public static void show() {
        var wavFile = WavFile.read("myfile.wav");
        wavFile.applyFilter(new ReduceNoiseFilter());
        wavFile.applyFilter(new AddReverbFilter());
        wavFile.applyFilter(new NormalizeFilter());
    }
}
