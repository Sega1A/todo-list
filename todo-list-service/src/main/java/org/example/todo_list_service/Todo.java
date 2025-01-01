package org.example.todo_list_service;

public class Todo {

    private String id;
    private String title;

    public Todo(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
