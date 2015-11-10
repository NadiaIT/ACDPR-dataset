class Poodle implements Dog
{
  public void speak()
  {
    System.out.println("The poodle says \"arf\"");
  }
  
  public void eat (Food food){
	  System.out.println("The poodle is eating "  + food.name);
  }
}