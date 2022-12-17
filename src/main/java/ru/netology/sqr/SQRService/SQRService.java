package ru.netology.sqr.SQRService;

public class SQRService {
    public int function(int under, int over) {
        int amount = 0;
        for (int i = 1; i <= over; i++) {
            int x = i * i;
            if (i * i >= under && i * i <= over) {
                amount++;
            }
        }
        return amount;
    }
}



