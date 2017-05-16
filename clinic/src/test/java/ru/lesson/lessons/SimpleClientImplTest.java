package ru.lesson.lessons;

import org.junit.Before;
import org.junit.Test;
import ru.lesson.lessons.impl.clientImpl.SimpleClientImpl;
import ru.lesson.lessons.interf.Pat;
import ru.lesson.lessons.utils.exception.ValidationException;

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

    @Test(expected = ValidationException.class)
    public void nameFromLowCaseException() throws ValidationException {
        client = new SimpleClientImpl("f", new Pat[]{});
    }

    @Test(expected = ValidationException.class)
    public void nameLangthLZ2() throws ValidationException {
        client = new SimpleClientImpl("A", new Pat[]{});
    }

}