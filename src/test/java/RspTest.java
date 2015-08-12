import org.junit.*;
import static org.junit.Assert.*;

public class RspTest {

  @Test
  public void checkWinner_rockBeatsScissors_true() {
    Rsp testApp = new Rsp();
  assertEquals(true, testApp.isplayer1Wins("R", "S"));

  }
  @Test
  public void checkWinner_ScissorsBeatsRock_true() {
    Rsp testApp = new Rsp();
  assertEquals(false, testApp.isplayer1Wins("S", "R"));

  }
  @Test
  public void checkWinner_PaperBeatsPaper_true() {
    Rsp testApp = new Rsp();
  assertEquals(false, testApp.isplayer1Wins("P", "P"));

  }



}
