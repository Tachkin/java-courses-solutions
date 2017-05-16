package ru.lesson.lessons;

import org.junit.Before;
import org.junit.Test;
import ru.lesson.lessons.impl.patImpl.SimplePatImpl;
import ru.lesson.lessons.utils.exception.ValidationException;

import static org.junit.Assert.*;

/**
 * Created by Tachkin's on 15.05.2017.
 */
public class SimplePatImplTest {
    SimplePatImpl pat;

    @Before
    public void createPat() throws ValidationException {
        pat = new SimplePatImpl("ABC", "def");
    }

    @Test
    public void getName() throws Exception {
        assertEquals("ABC", pat.getName());
    }

    @Test
    public void getBreed() throws Exception {
        assertEquals("def", pat.getBreed());
    }

    @Test
    public void equals() throws Exception {
        assertTrue(pat.equals( new SimplePatImpl("ABC", "def")));
    }

    @Test(expected = ValidationException.class)
    public void nameFromLowCaseException() throws ValidationException {
        pat = new SimplePatImpl("f", "");
    }

}