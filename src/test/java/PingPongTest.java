//import junit library
import org.junit.*;

//import junit assertion library
import static org.junit.Assert.*;

public class PingPongTest {

  //create a test
  @Test
  public void isPingPong_forNumberDivisibleByFifteen_pingpong() {
    PingPong pingPong = new PingPong();
    assertEquals("pingpong", pingPong.isPingPong(15));
  }

  //create a test
  @Test
  public void isPingPong_forNumberDivisibleByFive_pong() {
    PingPong pingPong = new PingPong();
    assertEquals("pong", pingPong.isPingPong(5));
  }

  @Test
  public void isPingPong_forNumberDivisibleByThree_ping() {
    PingPong pingPong = new PingPong();
    assertEquals("ping", pingPong.isPingPong(3));
  }

}
