

public class RoverState {

	private int positionX;
	private int positionY;
	Direction direction;
	
	
	private void init(int x, int y, Direction d){
		positionX =x;
		positionY =y;
		direction = d;
	}
	RoverState(){
		init(0,0, new Direction());
	}
	RoverState(int x, int y, Direction d) {
		init(x,y,d);
	}
	RoverState(RoverState s){
		init(s.getPositionX(), s.getPositionY(), s.getDirection());
	}
	
	public int getPositionX() {
		return positionX;
	}
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	public int getPositionY() {
		return positionY;
	}
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public void setMove() {
		switch(direction.getValue()) {
		case 0: 
		{
			positionY++;
			break;
		}
		case 1:
		{
			 positionX++;
			 break;
		}
		case 2:
		{
			positionY--;
			break;
		}
		case 3:
		{
			positionX--;
			break;
		}
		}
	}
	
	public String toString() {
		return("X="+positionX+" Y="+positionY+" direction="+direction);
	}
	
}
