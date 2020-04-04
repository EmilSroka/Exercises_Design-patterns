package pl.emilsroka.command.end;

import pl.emilsroka.command.end.commands.SetContrastCommand;
import pl.emilsroka.command.end.commands.SetTextCommand;
import pl.emilsroka.command.end.commands.UndoCommand;

public class Demo {
    public static void main(String [] args){
        show();
    }

    public static void show() {
        var videoEditor = new VideoEditor();
        var history = new History();

        System.out.println("DEFAULT: " + videoEditor);

        var setTextCommand = new SetTextCommand("Video Title", videoEditor, history);
        setTextCommand.execute();
        System.out.println("TEXT: " + videoEditor);

        var setContrast = new SetContrastCommand(1, videoEditor, history);
        setContrast.execute();
        System.out.println("CONTRAST: " + videoEditor);

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);
    }
}
