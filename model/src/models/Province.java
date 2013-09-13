package models;



public class Province extends MObject {

	private String description;
	private City capital;
	private String map;

	public Province(String name) {
		super(name);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
	public String  toString() {
		return this.getName() +" ("+ this.capital +")"; 

	
	}
	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public void setMap(String map) {
		this.map = map;
	}
	
	public String getMap() {
		return this.map;
	}
	
	
}


