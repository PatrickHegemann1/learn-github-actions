import kotlin.test.Test
import kotlin.test.assertEquals

class SampleTest {
    private val testSample = Sample();

    @Test
    fun testSquare() {
        assertEquals(64, testSample.square(8));
    }

    @Test
    fun testSquareFails() {
        assertEquals(65, testSample.square(8));
    }
}
