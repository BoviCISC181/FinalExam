package QuestionC;

public class IllegalRectangle extends Exception{
	public int x;
	public int y;
	
	public IllegalRectangle(int x, int y){
		this.x=x;
		this.y=y;
		System.out.println("illegal rectangle");
	}
}
