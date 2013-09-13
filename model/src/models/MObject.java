package models;

public abstract class MObject {
	
	protected String name;
	
	public MObject(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
