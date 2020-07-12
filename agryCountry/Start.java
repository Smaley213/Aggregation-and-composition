package by.htp.less.agryCountry;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {

		Logic logic = new Logic();
		View info = new View();

		City c1 = new City("Minsk", 1000);
		City c2 = new City("Braslov", 5);
		City c3 = new City("Gomel", 6);
		City c4 = new City("Rakov", 7);

		City c5 = new City("Borisov", 150);
		City c6 = new City("Loshnicha", 9);
		City c7 = new City("Glivin", 5);
		City c8 = new City("Zembin", 8);

		List<City> minskiy = new ArrayList<City>();
		List<City> borisovskiy = new ArrayList<City>();

		minskiy.add(c1);
		minskiy.add(c2);
		minskiy.add(c3);
		minskiy.add(c4);

		borisovskiy.add(c5);
		borisovskiy.add(c6);
		borisovskiy.add(c7);
		borisovskiy.add(c8);

		District minskiy1 = new District("Minskiy", minskiy);
		District borisovskiy1 = new District("Borisovskiy", borisovskiy);

		List<District> minskaya = new ArrayList<District>();

		minskaya.add(minskiy1);
		minskaya.add(borisovskiy1);

		Region minskaya1 = new Region("Minskaya", minskaya);

		List<Region> state = new ArrayList<Region>();

		state.add(minskaya1);

		Country belarus = new Country("Belarus", 100000, state);

		System.out.println("Столица: ");

		info.printInformation(logic.findСapital(belarus));

		System.out.println("Количество областей ");

		info.printInformation(logic.numberOfRegion(belarus));

		System.out.println("Площадь страны ");

		info.printArea(belarus);

		System.out.println("Областные центры ");

		info.printInformation(logic.findRegionalCenter(belarus));

	}
}
