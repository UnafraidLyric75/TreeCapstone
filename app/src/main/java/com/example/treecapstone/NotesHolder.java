package com.example.treecapstone;

public class NotesHolder {
    private String title;
    private String content;

    public NotesHolder(){

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public NotesHolder(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
