class box{
	int length;
	int height;
	int width;
	
	int surface(){
        return 2*(length*width+length*height+height*width);
	}
	
} 

public class surfaceBox {
	public static void main(String args[])
	{ 
		box cuboid = new box();
		cuboid.length = 5;
		cuboid.height = 10;
		cuboid.width = 15;
		
		int v = cuboid.surface();	
		System.out.println(v);
		
	}
	
	

}
