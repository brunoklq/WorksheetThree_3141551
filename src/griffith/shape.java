package griffith;

abstract class shape {

	private String name;
	

	public shape(String name) {
		
		this.name = name;
	}
	
	
	public void setname(String name) {
		
		this.name = name;
		
	}
	

	
	public abstract double area();
	
	
	
	public abstract double perimeter();
	

	
	public String getName() {
		
		return name;
	}
	
	
	
	public String toString() {
		
		
		return "The Shape: " + name;
	}
	
	
	
}
