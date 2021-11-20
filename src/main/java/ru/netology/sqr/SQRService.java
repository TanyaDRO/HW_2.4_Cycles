package ru.netology.sqr;

public class SQRService {
    public int beginCounter = 10;
    public int endCounter = 99;

    public int countSquares(int left, int right) {
        int quantity = 0;
        for (int i = beginCounter; i <= endCounter; i++) {
            int square = i * i;
            if (square >= left && square <= right) {
                System.out.println("Число: " + i + ", квадрат числа: " + square);
                quantity++;
            }
        }
        System.out.println("Найдено чисел: " + quantity);
        return quantity;
    }

}
