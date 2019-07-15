
public class Animation2D extends Animation implements Drawable {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing");
	}
	@Override
	public Integer getFramerate() {
		return 24;
		
	}
	public static void main(String[] args) {
		
		Animation2D ani = new Animation2D() ;
		ani.draw();
		ani.getFramerate();
	}

}