package fr.uha.gl.td2.jamtest;

public class Test
{
	
	private String name;
	

	public Test() 
	{
		name = "Nouveau test";
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Test [name=" + name + "]";
	}
	
	public static void main(String[] args)
	{
		Test test=new Test();
		System.out.println(test);
		test.setName("Allumer la lampe");
		System.out.println(test);	
	}



}
