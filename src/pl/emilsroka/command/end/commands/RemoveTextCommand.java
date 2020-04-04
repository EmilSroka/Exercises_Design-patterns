package pl.emilsroka.command.end.commands;

import pl.emilsroka.command.end.History;
import pl.emilsroka.command.end.VideoEditor;

public class RemoveTextCommand implements UndoableCommand{
    private SetTextCommand remove;

    public RemoveTextCommand(VideoEditor receiver, History history){
        remove = new SetTextCommand("", receiver,  history);
    }

    @Override
    public void execute() {
        remove.execute();
    }

    @Override
    public void undo() {
        remove.undo();
    }
}
