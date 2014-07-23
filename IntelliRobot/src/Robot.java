
public class Robot {
	
	private int x;
	private int y;
	
	private int xVelocity;
	private int yVelocity;
	
	public void update() {
		x = x + xVelocity;
		y = y + yVelocity;
	}

}
