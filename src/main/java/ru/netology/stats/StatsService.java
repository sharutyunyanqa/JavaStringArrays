package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long salesAmount(long[] sales) {
        long amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }
        return amount;
    }

    public long salesAverage(long[] sales) {
        long amount = salesAmount(sales);
        long average = 0;

        average = amount / sales.length;
        return average;
    }

    public int monthCountMinAvg(long[] sales) {

        long average = salesAverage(sales);

        int monthCount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (average < sales[i]) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int monthCountMaxAvg(long[] sales) {

        long average = salesAverage(sales) ;
        int monthCount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (average > sales[i]) {
                monthCount++;
            }
        }
        return monthCount;
    }
}