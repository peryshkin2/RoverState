
public class Direction {
	// value 0-North; 1-East; 2-South; 3 - West;
	private int value;
	
	Direction(){value =0;}
	Direction(int d){ value=d;}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value%4;
	}
	public void setNextRight() {
		int d=value;
		this.value = (d+1)%4;
	}
	
	public void setNextLeft() {
		int d=value;
		this.value = (d-1<0)?d+3:(d-1)%4;
	}
	
	public String toString() {
		switch(value) {
		case 0: return "N";
		case 1: return "E";
		case 2: return "S";
		case 3: return "W";
		}
		return " ";
	}
}
