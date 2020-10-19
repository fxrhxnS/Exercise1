public class Shark extends Fish{
	private int sharpTeeth = 50;

	public void Eat() {
		System.out.println("Eat with " + sharpTeeth + " number of teeth");
	}

	public void SetSharpTeeth(int teeth){
		sharpTeeth=teeth;
	}
	public void Swim (){

		System.out.println(color + " fish swim with mouth open with " + sharpTeeth);//implemntation
	}
	//overloading
	public void Swim (int fin){

		System.out.println(color + " fish swim " + fin);//implemntation
	}

	public void Swim (double x,double y){

		System.out.println(color + " shark consumes about " + x + " and " + y + " percent of their body weight each meal since most space their dinners out to every two or three days.");//implemntation
	}




}