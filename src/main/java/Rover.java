
import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Rover {
	private RoverState roverState;
	
	public Rover(RoverState rs) {
		roverState= rs;
	}
	
	public void move(char c) {
		// move takes current Rover State and Command and generate next RoverState
		
		switch (this.charToCommand(c)) {
		case M:{
			roverState.setMove();
			break;
		}
		case R:{
			roverState.getDirection().setNextRight();
			break;
		}
		case L:{
			roverState.getDirection().setNextLeft();
			break;
		}
		}
//		System.out.println(roverState.toString());
	}
	
	public void processComandString(String s) {
		s.chars().mapToObj(c -> (char) c).forEach(c->this.move(c));
	}

	private Command charToCommand(char c) {
		String s = Character.toString(c);
		return Command.valueOf(s);
	}
	
}
