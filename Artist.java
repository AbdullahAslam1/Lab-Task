public class Artist{
	
	private String name;

	Artist(String name){
		this.setName(name);
	}
	
	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void display(){
		System.out.println("Artist's name : "+name);
	}

}