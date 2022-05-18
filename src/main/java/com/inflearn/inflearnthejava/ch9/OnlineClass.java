package com.inflearn.inflearnthejava.ch9;

public class OnlineClass {

    private int id;
    private String title;
    private Boolean closed;

    public OnlineClass() {
    }

    public OnlineClass(int id, String title, Boolean closed) {
        this.id = id;
        this.title = title;
        this.closed = closed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }
}
