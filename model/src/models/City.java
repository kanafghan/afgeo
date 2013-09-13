package models;

public class City extends MObject {

	private String description;
	
	public City (String name){
		super(name);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return this.getName();
	}
	
}
