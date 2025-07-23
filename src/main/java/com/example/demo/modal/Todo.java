package com.example.demo.modal;

public class Todo {
    private String title;
    private boolean done;

    public Todo(){}
    public Todo(String title, boolean done) {
        this.title = title;
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
