package by.bsuir.artemyev;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;

public class SpyTest {

    @Test
    public void whenSpyingList() {
        List testList = new ArrayList();
        testList.add("one");
        testList.add("two");

        List spy = spy(testList);
        spy.add("three");

        assertEquals(spy.size(),3);
    }

    @Test
    public void whenSpyingOnList_thenCorrect() {
        List<String> list = new ArrayList<String>();
        List<String> spyList = spy(list);

        spyList.add("one");
        spyList.add("two");

        Mockito.verify(spyList).add("one");
        Mockito.verify(spyList).add("two");

        assertEquals(2, spyList.size());
    }

}
