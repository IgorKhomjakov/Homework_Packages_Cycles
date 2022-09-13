package ru.netology.sqr.packages.cycles.services;

public class SQRService {

    public int calcSQR(int minRange, int maxRange) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minRange & i * i <= maxRange) {
                count++;
            }
        }
        return count;
    }
}
