package readers;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import models.City;
import models.Country;
import models.Province;

public class DataReader {
	
	public Country getAfghanistan() {
		Country af = new Country("Afghanisan");

		try {
			// Open the file that is the first
			// command line parameter
			FileInputStream fstream = new FileInputStream("data.csv");
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;

			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				// Split the line into province, capital, description and map
				String[] parts = strLine.split(";");
				if (parts.length != 4) {
					throw new Error(
							"Each line should consist of 4 parts: Province, Capital, Description and Map. "
									+ strLine);
				}

				// Create a city
				City c = new City(parts[1]);

				// Create a province
				Province p = new Province(parts[0]);
				p.setCapital(c);
				p.setDescription(parts[2]);
				p.setMap(parts[3]);

				af.addProvince(p);

			}
			// System.out.println(af.toString());
			// Close the input stream
			in.close();
			br.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		
		return af;
	}
}
