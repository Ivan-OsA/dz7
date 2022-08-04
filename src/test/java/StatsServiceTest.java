import static org.junit.jupiter.api.Assertions.*;

import org.example.dz7.stats.StatsService;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void test() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};
        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        assertEquals(expected, actual);
    }

    @Test
    public void testAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};
        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14+ 14 + 18) / 12;

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};
        long actual = service.maxSales(sales);
        long expected =8;

        assertEquals(expected, actual);
    }
    @Test
    public void testMinSales(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};
        long actual = service.minSales(sales);
        long expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    public  void testcCountBelouwAvg(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};
        long actual = service.countBelouwAvg(sales);
        long expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    public void testCountAboveAvg(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};
        long actual = service.countAboveAvg(sales);
        long expected = 5;

        assertEquals(actual, expected);
    }

}
