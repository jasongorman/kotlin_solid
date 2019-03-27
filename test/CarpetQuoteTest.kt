import junit.framework.TestCase.assertEquals
import org.junit.Test

class CarpetQuoteTest {
    @Test
    fun quoteForRectangularRoomWithNoRounding(){
        assertEquals(62.5, quote(room(2.5, 2.5), carpet(10.0, false)));
    }

    @Test
    fun quoteForRectangularRoomWithRounding(){
        assertEquals(70.0, quote(room(2.5, 2.5), carpet(10.0, true)));
    }

    @Test
    fun quoteForCircularRoomWithNoRounding(){
        assertEquals(250.0, quote(circularRoom(2.5), carpet(10.0, false)));
    }
}

