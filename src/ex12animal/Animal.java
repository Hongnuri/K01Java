package ex12animal;

public class Animal
{
	private String species;
	int age;
	String name;
	
	public void showAnimal()
	{
		System.out.println("종 : " + species);
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);
	}
	
	public Animal(String species , int age , String name)
	{
		this.species = species;
		this.age = age;
		this.name = name;
	}
	
	public String getSpecies()
	{
		return species;
	}
}