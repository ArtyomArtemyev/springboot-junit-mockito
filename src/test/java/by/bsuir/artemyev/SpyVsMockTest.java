package by.bsuir.artemyev;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

public class SpyVsMockTest {

    @Test
    public void testSpyMock() {
        List mockList = mock(ArrayList.class);
        Mockito.when(mockList.get(0)).thenReturn("NC");
        Assert.assertEquals(mockList.get(0), "NC");

        List list  = new ArrayList();
        List spyList = spy(list);
        spyList.add("NC");
        Assert.assertEquals(spyList.get(0), "NC");
    }
}
