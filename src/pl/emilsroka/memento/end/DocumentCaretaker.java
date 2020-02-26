package pl.emilsroka.memento.end;

import java.util.Stack;

public class DocumentCaretaker {
    private Stack<DocumentMemento> history = new Stack<>();
    //Document originator = new Document();

    public void push(DocumentMemento memo){
        history.push(memo);
    }

    public DocumentMemento pop(){
        return history.pop();
    }
}
