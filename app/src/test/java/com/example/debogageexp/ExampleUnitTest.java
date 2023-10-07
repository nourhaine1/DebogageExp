package com.example.debogageexp;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {

        assertEquals(4, 2 + 2);
        assertEquals (12,Utils.Calcul(7.0,5.0,'+'));
        assertEquals (12,Utils.Calcul(7.0,7.0,'/'));
        assertEquals (35,Utils.Calcul(7.0,5.0,'+'));
        assertEquals (2,Utils.Calcul(7.0,5.0,'-'));
    }
    //assertEquals
}