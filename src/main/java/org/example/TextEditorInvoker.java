package org.example;

import java.util.Stack;

public class TextEditorInvoker {
    private Stack<Command> commandHistory = new Stack<>();

    public void execute(Command command){
        command.execute();
        commandHistory.push(command);
    }
    public void undo(){
        if(!commandHistory.isEmpty()){
            Command command=commandHistory.pop();
            command.undo();
        }
        else {
            System.out.println("No Command to execute");
        }
    }
}
