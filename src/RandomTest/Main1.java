package RandomTest;

public class Main1 {

		int rollno;  
		String name;  
		float fee; 
		
		Main1(){  
			System.out.println("Default Constructor");  
		} 
		
		Main1(int r,String n,float f){  
			this();
			System.out.println("Parameterized Constructor");
		}  
		void display(){System.out.println(rollno+" "+name+" "+fee);}  
}
