import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class SampleTest {
    @Test public void test() {
        int from[] = {0,0,1};
        int to[] = {1,2,3};
        int from1[] = {0,1};
        int to1[] = {2,3};
        assertEquals(3, Graph.fastestRoute(from, to, 2, 3));
        assertEquals(-1, Graph.fastestRoute(from1, to1, 0, 1));

    }
}
