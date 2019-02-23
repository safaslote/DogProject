public class Dog {
	private String color;
	private int weight;
	private String breed;
	private String name;
	
	public Dog(String color, int weight, String breed, String name) {
		this.color = color;
		this.weight = weight;
		this.breed = breed;
		this.name = name;
	}

	public void bark() {
		System.out.println("Bark bark, my name is " + name);
	}

  public String getColor() {
    return this.color;
  }
}