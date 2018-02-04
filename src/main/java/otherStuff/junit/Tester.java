package otherStuff.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Tester {

    List<String> _teams;

    @Before
    public void setUp(){
        _teams = new ArrayList<>();
        _teams.add("FC Basel");
        _teams.add("BSC YoungBoys");
        _teams.add("FC Zürich");
        _teams.add("FC Luzern");
        assertNotNull(_teams);
    }

    @Test
    public void test1(){
        assertTrue(Boolean.TRUE);
        assertFalse(Boolean.FALSE);
        assertEquals("FC Basel", _teams.get(0));
        assertNotEquals("FC Zürich", _teams.get(1));
    }

    @After
    public void cleanUp(){
        _teams.clear();
    }
}
