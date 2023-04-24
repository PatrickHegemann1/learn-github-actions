import kotlin.test.Test
import kotlin.test.assertEquals

class SampleTest {
    private val testSample = Sample();

    @Test
    fun testSquare() {
        assertEquals(64, testSample.square(8));
    }

    @Test
    fun testSquareTwo() {
        assertEquals(49, testSample.square(7));
    }
}
