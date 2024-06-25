package org.example;

public class TextEditor {
    private StringBuilder textEditor = new StringBuilder();

    public void typeText(String text){
        textEditor.append(text);
        System.out.println(textEditor.toString());
    }
    public void deleteText(String text){
        int idx=textEditor.indexOf(text);
        if(idx!=-1){
            textEditor.delete(idx,idx+text.length());
            System.out.println("Text Deleted");
        }
        else{
            System.out.println("Nothing to delete");
        }
        System.out.println("Final text after deletion "+textEditor.toString());
    }
}
