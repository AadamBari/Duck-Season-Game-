package ie.dit;


public class Main{
	

	public static void main(String[] args){
		
		Frame f = new Frame();
		Duck d = new Duck();
		f.add(d);
		f.addMouseListener(d);
		
	}

}//end class Main()
