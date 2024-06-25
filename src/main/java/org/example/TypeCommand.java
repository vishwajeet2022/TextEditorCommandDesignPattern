package org.example;

public class TypeCommand implements Command{
    TextEditor textEditor;
    String text;

    TypeCommand(TextEditor textEditor, String text){
        this.textEditor=textEditor;
        this.text=text;
    }
    @Override
    public void execute() {
        textEditor.typeText(text);
    }

    @Override
    public void undo() {
        textEditor.deleteText(text);
    }
}
