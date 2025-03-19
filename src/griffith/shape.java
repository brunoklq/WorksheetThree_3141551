package griffith;



//Student: Bruno Kennedy Lisboa de queiroz
//Student Number: 3141551

abstract class shape { // abstract class 

	private String name; // attributes


	public shape(String name) { // constructor to set the name

		this.name = name;
	}


	public void setname(String name) { // setters

		this.name = name;

	}



	public abstract double area(); // method to be created



	public abstract double perimeter(); // method to be created



	public String getName() { // getters and setters to be implemented

		return name;
	}



	public String toString() { // to string overrinde


		return "The Shape: " + name;
	}



}
