class SiberianHusky implements Dog
{
  public void speak()
  {
    System.out.println("The husky says \"Dude, what's up?\"");
  }
  
  public void eat (Food food){
	  System.out.println("The husky is eating "  + food.name);
  }
}