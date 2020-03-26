import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Failing2Test {


	@Test
    void shouldBeEqualTest() {
		 
		   RoverState rs = new RoverState(3, 3, new Direction(1));
		   Rover r = new Rover(rs);
		   RoverState expectedS = new RoverState(5,1,new Direction(1));
		   r.processComandString("MMRMMRMRRM");
		   
		   System.out.println(expectedS.toString());
		   
	       assertEquals("Verifying move X", expectedS.getPositionX(), rs.getPositionX());
	       assertEquals("Verifying move Y", expectedS.getPositionY(), rs.getPositionY());
	       assertEquals("Verifying move Direction", expectedS.getDirection().getValue(), rs.getDirection().getValue());
	   
    }
}
