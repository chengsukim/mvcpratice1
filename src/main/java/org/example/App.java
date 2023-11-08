package org.example;

import org.example.system.controller.SystemController;
import org.example.wiseSaying.controller.WiseSayingController;
import org.example.wiseSaying.entity.WiseSaying;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {

    private final Scanner sc;

    App(Scanner sc) {
        this.sc = sc;
    }

    void run() {
        SystemController systemController = new SystemController();
        WiseSayingController wiseSayingController = new WiseSayingController(sc);

        System.out.println("== 명언앱 ==");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf("명령 : ");
            String command = sc.nextLine().trim();
            if (command.equals("종료")) {
                systemController.exit();
                break;
            } else if (command.equals("등록")) {
                wiseSayingController.write();

            } else if (command.equals("목록")) {
                wiseSayingController.list();

            } else if (command.equals("삭제")) {
                wiseSayingController.remove();
            } else if (command.equals("수정")) {
                wiseSayingController.modify();
            }


        }
    }
}

