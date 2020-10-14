public class Driver{

    
    public static void main(String [] arg){
        //fish actually is a data type
        //guna keword NEW sbb Fish adalah datatype class
        Fish nemo = new Fish(); //nemo adalah object,fish adelah kelas

        nemo.Swim();
        //nemo.color="red";//tukar value
        nemo.SetColor("red"); //change here
        nemo.Swim();
        //nemo.Eat(); //superclass call subclass method

        Shark fiery = new Shark();
        fiery.Eat();
        fiery.Swim();
        fiery.SetSharpTeeth(150);
        fiery.Eat();







        // Fish dory = new Fish(); //another project
        
        // dory.Swim();
        // //dory.color="pink";
        // dory.SetColor("yellow"); //change here
        // dory.Swim();

        //Aquarium fancyaquarium = new Aquarium();
        //fancyaquarium.fillFish();
    }

    

}