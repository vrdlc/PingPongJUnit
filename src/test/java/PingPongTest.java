//import junit library
import org.junit.*;

//import junit assertion library
import static org.junit.Assert.*;

public class PingPongTest {

  //create a test
  @Test
  public void isPingPong_forNumberDivisibleByFifteen_true() {
    PingPong pingPong = new PingPong();
    assertEquals(true, pingPong.isPingPong(15));
  }
}
