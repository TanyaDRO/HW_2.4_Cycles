package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void countSquaresMiddle() {
        SQRService sQRService = new SQRService();
        int left = 200;
        int right = 300;
        int expected = 3;
        int fact = sQRService.countSquares(left, right);
        assertEquals(expected, fact);

    }

    @Test
    public void countSquaresFullRange() {
        SQRService sQRService = new SQRService();
        int left = sQRService.beginCounter * sQRService.beginCounter;
        int right = sQRService.endCounter * sQRService.endCounter;
        int expected = sQRService.endCounter - sQRService.beginCounter + 1;
        int fact = sQRService.countSquares(left, right);
        assertEquals(expected, fact);
    }

    @Test
    public void countSquaresBoundaryValues() {
        SQRService sQRService = new SQRService();
        int left = sQRService.beginCounter * sQRService.beginCounter + 1;
        int right = sQRService.endCounter * sQRService.endCounter - 1;
        int expected = sQRService.endCounter - sQRService.beginCounter - 1;
        int fact = sQRService.countSquares(left, right);
        assertEquals(expected, fact);
    }
}