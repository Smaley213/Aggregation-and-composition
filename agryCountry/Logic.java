package by.htp.less.agryCountry;

import java.util.ArrayList;
import java.util.List;


public class Logic {

	public City findÑapital(Country state) {

		City capital = new City();

		int max = 0;

		for (Region r : state.getListRegion()) {
			for (District d : r.getListDistrict()) {
				for (City c : d.getListCity()) {
					if (c.getAreaCity() > max) {
						max = c.getAreaCity();
						capital = c;
					}
				}
			}
		}

		return capital;

	}

	public int numberOfRegion(Country state) {
		int quantity;

		quantity = state.getListRegion().size();

		return quantity;
	}
	
	public List<City> findRegionalCenter(Country state) {
		int max = 0;
		City central = new City();
		List<City> regionalCenters = new ArrayList<City>();
		
		for(Region r : state.getListRegion()) {
			for(District d: r.getListDistrict()) {
				for(City c : d.getListCity()) {
					if(c.getAreaCity() > max) {
						max = c.getAreaCity();
						central = c;
					}
				}
				
			}
		regionalCenters.add(central);
		}
		
	return regionalCenters;	
	}


}
