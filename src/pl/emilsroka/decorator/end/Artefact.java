package pl.emilsroka.decorator.end;

public class Artefact implements Decorator{
    private String name;
    private boolean hasError;
    private boolean isMain;

    public Artefact(String name) {
        this.name = name;
    }

    public String render() {
        return name;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public void setMain(boolean main) {
        isMain = main;
    }
}
