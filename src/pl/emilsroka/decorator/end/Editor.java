package pl.emilsroka.decorator.end;

public class Editor {
    public void openProject(String path) {
        Decorator[] artefacts = {
                new Artefact("Main"),
                new Artefact("Demo"),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
        };

        artefacts[0] = new MainIcon(artefacts[0]);
        artefacts[2] = new ErrorIcon(artefacts[2]);

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
