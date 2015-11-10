class Rottweiler implements Dog
{
  public void speak()
  {
    System.out.println("The Rottweiler says (in a very deep voice) \"WOOF!\"");
  }
  
  public void eat (Food food){
	  System.out.println("The Rottweiler is eating "  + food.name);
  }
}