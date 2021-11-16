package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void countSquares() {
        int left = 200;
        int right = 300;
        SQRService sQRService = new SQRService();
        int expected = 3;
        int fact = sQRService.countSquares(left, right);
        assertEquals(expected, fact);

    }

}