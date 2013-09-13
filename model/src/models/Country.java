package models;

import java.util.ArrayList;
import java.util.List;

public class Country extends MObject{

	private List<Province> provinces;
	
	public Country(String name) {
		super(name);
		this.provinces = new ArrayList<Province>();
	}

	public void addProvince(Province p) {
		this.provinces.add(p);
	}

	@Override
	public String toString() {
		String result = this.name +":\n";
		
		result += this.provinces.get(0);
		for (int i=1; i<this.provinces.size(); i++) {
			result += "\n"+ this.provinces.get(i);
		}
		
		return result;
	}

	public int readInt(String string, int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Province[] getProvinces() {
		return this.provinces.toArray(new Province[]{});
	}
}
