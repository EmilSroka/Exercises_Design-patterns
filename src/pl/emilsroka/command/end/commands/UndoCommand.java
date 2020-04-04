package pl.emilsroka.command.end.commands;

import pl.emilsroka.command.end.History;

public class UndoCommand implements Command {
    History history;

    public  UndoCommand(History history){
        this.history = history;
    }

    @Override
    public void execute() {
        if(!history.isEmpty()) {
            var command = history.pop();
            command.undo();
        }
    }
}
