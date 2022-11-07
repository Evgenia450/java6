package ru.netology.sqr;
public class SqrtService {
    public int SqrtService(int rangeFrom, int rangeTo) {
        int amount = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= rangeFrom && i * i <= rangeTo) {
                amount++;
                System.out.println("Число "+ i + " попадает в диапазон [" + rangeFrom + "-" + rangeTo+"]");
            }
        }
        System.out.println("Всего "+ amount);
        return amount;
    }
}