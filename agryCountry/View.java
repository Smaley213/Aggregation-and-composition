package by.htp.less.agryCountry;

import java.util.List;

public class View {

	public void printInformation(City city) {

		System.out.println(city);

	}

	public void printInformation(int i) {

		System.out.println(i);
	}

	public void printArea(Country state) {

		System.out.println(state.getArea());
	}

	public void printInformation(List<City> centers) {
		for (City c : centers) {
			System.out.println(c);
		}

	}

}
