 public class Main
{
  public static void main(String[] args)
  {
	int choice=1;
	Dog dog;
    // create a small dog
	if ( choice==1 )
      dog = new Poodle();
    else if ( choice==2 )
      dog = new Rottweiler();
    else if ( choice==3 )
      dog = new SiberianHusky();

    dog.speak();

	Food food = new Food("meat");

	dog.eat(food);
  }
}
