package pl.emilsroka.command.end.commands;

import pl.emilsroka.command.end.History;
import pl.emilsroka.command.end.VideoEditor;

public class SetContrastCommand implements UndoableCommand {
    private float previousContrast = Float.NaN;
    private float contrast;
    private VideoEditor receiver;
    private History history;

    public SetContrastCommand(float contrast, VideoEditor receiver, History history){
        this.receiver = receiver;
        this.contrast = contrast;
        this.history = history;
    }

    @Override
    public void execute() {
        previousContrast = receiver.getContrast();
        receiver.setContrast(contrast);
        history.push(this);
    }

    @Override
    public void undo() {
        if(previousContrast != Float.NaN){
            receiver.setContrast(previousContrast);
            previousContrast = Float.NaN;
        }
    }
}
