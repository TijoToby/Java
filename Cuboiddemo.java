import java.util.Scanner;
public class CuboidDemo {
	public static void main(String[] args)
	{
				System.out.println("Please enter the length,breadth,height of the cuboid:");
				Scanner in = new Scanner(System.in);
				double length = in.nextDouble();
				double breadth= in.nextDouble();
				double height = in.nextDouble();
				Cuboid mybox = new Cuboid();
				mybox.setDimension(length,breadth,height);
				double volume =mybox.calculateVolume();
				System.out.println("Volume of the cuboid with dimensions: "+length+"* "
				+breadth+" *"+height+" is :"+volume);
				double surfaceArea = mybox.calculateSurfaceArea();
		        System.out.println("Surface Area of the box is: " + surfaceArea);
			}
	}
	 class Cuboid {
	double length;
	double breadth;
	double height;
void setDimension(double l, double b, double h) {
	length =l;
	breadth =b;
	height = h;
}
	double calculateVolume() {
		 return(height*length*breadth);
 
	}
	double calculateSurfaceArea() {
        return (2 * (length * breadth + height * breadth + length * height));
    }

}
