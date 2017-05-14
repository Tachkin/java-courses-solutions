package ru.lesson.lessons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tachkin's on 15.05.2017.
 */
public class SimpleClientImplTest {
    SimpleClientImpl client;

    @Before
    public void setUp() throws Exception {
        client = new SimpleClientImpl("ABC", new Pat[]{});
    }

    @Test
    public void getName() throws Exception {
        assertEquals(client.getName(), "ABC");
    }

}