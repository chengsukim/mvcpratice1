package org.example.wiseSaying.controller;


import org.example.wiseSaying.entity.WiseSaying;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class WiseSayingController {

    private final Scanner sc;
    List<WiseSaying> wiseSayingList = new ArrayList<>();
    long id = 1;

   public WiseSayingController(Scanner sc) {
        this.sc = sc;
    }

    public void write() {
        System.out.printf("명언 : ");
        String content = sc.nextLine().trim();
        System.out.printf("작가 : ");
        String author = sc.nextLine().trim();
        WiseSaying wiseSaying = new WiseSaying(id, author, content);
        wiseSayingList.add(wiseSaying);
        System.out.println(id + "번 명언이 등록되었습니다");
        id++;
    }

    public void list() {
        System.out.println("번호 / 작가 / 명언");
        for (WiseSaying wiseSaying : wiseSayingList) {
            System.out.printf("%d / %s / %s\n", wiseSaying.getId(), wiseSaying.getAuthor(), wiseSaying.getContent());
        }
    }

    public void remove() {
        System.out.println("삭제할 번호를 선택하세요");
        long removeId = Long.parseLong(sc.nextLine().trim());
        for (WiseSaying wiseSaying : wiseSayingList) {
            if (wiseSaying.getId() == removeId) {
                wiseSayingList.remove(wiseSaying);
            }

        }
        System.out.println(removeId + "번 명언이 삭제되었습니다");
    }

    public void modify() {
        System.out.println("수정할 번호를 선택하세요");
        long modifyId = Long.parseLong(sc.nextLine().trim());
        for (WiseSaying wiseSaying : wiseSayingList) {
            if (wiseSaying.getId() == modifyId) {
                System.out.printf("기존명언 : %s\n", wiseSaying.getContent());
                String content = sc.nextLine().trim();
                wiseSaying.setContent(content);
                System.out.printf("기존작가 : %s\n", wiseSaying.getAuthor());
                String author = sc.nextLine().trim();
                wiseSaying.setAuthor(author);
            }

        }
        System.out.println(modifyId + "번 명언이 수정되었습니다.");
    }
}