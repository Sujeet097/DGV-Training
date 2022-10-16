package First;

import java.util.Scanner;

public class Square implements Shape {
      Scanner scanner = new Scanner(System.in);
      int side;
      
	public void getSide()
	{
		System.out.println("Enter Side");
		side = scanner.nextInt();
		
	}
	public int area() {
		return side*side;
	}

}
