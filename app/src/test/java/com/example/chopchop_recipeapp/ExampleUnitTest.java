package com.example.chopchop_recipeapp;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    /*
        IT19958620
        T.L.Wickramasinghe
     */
   @Test
    public void testDayDifference() throws ParseException {
        String d1 = "2021/09/08";
        String d2 = "2020/09/08";
        long expected = 365;


        Date date1;
        Date date2;
        SimpleDateFormat dates = new SimpleDateFormat("yyyy/MM/dd");
        date1 = dates.parse(d1);
        date2 = dates.parse(d2);


        long  difference =  Math.abs(date1.getTime() - date2.getTime());


        long output = difference / (24 * 60 * 60 * 1000);

        assertEquals(expected,output);

    }
}