public class Fish{

	//attribute or data member or fields
	public String color = "blue";//default value

	//method
	public void Swim (){

		System.out.println(color + " fish swim");//implemntation
	}

	public void SetColor(String warna){
		color=warna;

	}

	public String GetColor() {
		return color;
	}

}