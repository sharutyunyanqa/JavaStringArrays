package ru.netology.stats;


import org.junit.Test;

import org.junit.jupiter.api.Assertions;


public class StatsServiceTest {
    public StatsServiceTest() {

    }


    @Test
    public void shouldCalcMinMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldCalcMaxMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void shouldCalcSalesAmout() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmount = 180;
        long actualAmount = service.salesAmount(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldCalcAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageSales = 15;
        long actualAverageSales = service.salesAverage(sales);
        Assertions.assertEquals(expectedAverageSales, actualAverageSales);

    }

    @Test
    public void shouldCalcMonthMinAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonthAverage = 5;
        int actualMinMonthAverage = service.monthCountMinAvg(sales);
        Assertions.assertEquals(expectedMinMonthAverage, actualMinMonthAverage);
    }

    @Test
    public void shouldCalcMonthMaxAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxAverage = 5;
        int actualMaxAverage = service.monthCountMaxAvg(sales);
        Assertions.assertEquals(expectedMaxAverage, actualMaxAverage);
    }
}


