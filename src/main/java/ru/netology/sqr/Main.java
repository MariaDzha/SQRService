package ru.netology.sqr;

import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int counter = service.calculateSQR(100, 1000);
        System.out.println(counter);
    }
}
