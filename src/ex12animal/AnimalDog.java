package ex12animal;

public class AnimalDog extends Animal 
{
	String dogKind;
	
	String name;
	
	void bark()
	{
		System.out.printf("\n 이름이 %s 이고 , 종(포유류) 이 %s 인 강아지가 짖는다." , name , getSpecies());
	}
	void showDog()
	{
		super.showAnimal();
		
		System.out.println("종류 : " + dogKind);
		System.out.println("이름 : " + name);
	}
	
	public AnimalDog(String species , int age , String gender , String dogKind , String name )
	{
		super(species , age , gender);
		
		this.dogKind = dogKind;
		this.name = name;
	}
}
