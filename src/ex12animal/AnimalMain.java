package ex12animal;

public class AnimalMain 
{
	public static void main(String[] args)
	{
	
	AnimalDog dog = new AnimalDog("포유류" , 2 , "수컷" , "포매라니안" , "뽀미");
	
	dog.showAnimal();
	System.out.println("=====================================");
	
	dog.bark();
	System.out.println("==============================");
	dog.showDog();
	}
}
