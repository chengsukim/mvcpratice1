package org.example.wiseSaying.entity;


import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class WiseSaying {
    long id;

    String author;

    String content;

   public WiseSaying(long id , String author , String content){
        this.id = id;
        this.author = author;
        this.content = content;

    }

    public long getId() {
        return this.id;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getContent() {
        return this.content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
