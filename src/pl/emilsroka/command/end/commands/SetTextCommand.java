package pl.emilsroka.command.end.commands;
import pl.emilsroka.command.end.History;
import pl.emilsroka.command.end.VideoEditor;

public class SetTextCommand implements UndoableCommand{
    private String previousText;
    private String text;
    private VideoEditor receiver;
    private History history;

    public SetTextCommand(String text, VideoEditor receiver, History history){
        this.receiver = receiver;
        this.text = text;
        this.history = history;
    }

    @Override
    public void execute() {
        previousText = this.receiver.getText();
        receiver.setText(text);
        history.push(this);
    }

    @Override
    public void undo() {
        if(previousText != null){
            receiver.setText(previousText);
            previousText = null;
        }
    }
}
