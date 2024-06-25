package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TextEditor textEditor=new TextEditor();
        Command command=new TypeCommand(textEditor,"Vishwajeet");

        TextEditorInvoker invoker = new TextEditorInvoker();
        invoker.execute(command);
    }
}