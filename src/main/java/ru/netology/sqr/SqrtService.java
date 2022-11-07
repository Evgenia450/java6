package ru.netology.sqr;
public class SqrtService {
    public int SqrtAmountService(int rangeFrom, int rangeTo) {
        int amount = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= rangeFrom && i * i <= rangeTo) {
                amount++;
            }
        }
        return amount;
    }
}