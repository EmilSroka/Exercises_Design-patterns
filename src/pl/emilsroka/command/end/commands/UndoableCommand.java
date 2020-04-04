package pl.emilsroka.command.end.commands;

public interface UndoableCommand extends Command {
    void undo();
}
