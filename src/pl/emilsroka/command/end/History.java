package pl.emilsroka.command.end;
import pl.emilsroka.command.end.commands.UndoableCommand;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    Deque<UndoableCommand> commands = new ArrayDeque<>();

    public int push(UndoableCommand command){
        commands.push(command);
        return commands.size();
    }

    public UndoableCommand pop(){
        return commands.pop();
    }

    public boolean isEmpty(){
        return commands.size() == 0;
    }

}
