package ru.netology.sqr;

public class SQRService {
    public int calculateSQR(int lowBorder, int topBorder) {
        int i;
        int counter = 0;
        for (i = 10; i <= 99; i++) {
            if (i * i >= lowBorder && i * i <= topBorder) {
                counter++;
            }
        }
        return counter;
    }
}
