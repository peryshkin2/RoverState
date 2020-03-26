import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FailingTest {
   @Test
   public void testThatFails() {
	   
	   RoverState rs = new RoverState(1, 2, new Direction(0));
	   Rover r = new Rover(rs);
	   RoverState expectedS = new RoverState(1,3,new Direction(0));
	   r.processComandString("LMLMLMLMM");
	   
	   System.out.println(rs.toString());
	   
       assertEquals("Verifying move X", expectedS.getPositionX(), rs.getPositionX());
       assertEquals("Verifying move Y", expectedS.getPositionY(), rs.getPositionY());
       assertEquals("Verifying move Direction", expectedS.getDirection().getValue(), rs.getDirection().getValue());
   
   }
}

