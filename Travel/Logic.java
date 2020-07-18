package by.htp.less.Travel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.htp.less.Travel.Voucher.Cruise;
import by.htp.less.Travel.Voucher.Shopping;
import by.htp.less.Travel.Voucher.Recreation;
import by.htp.less.Travel.Voucher.Excursion;
import by.htp.less.Travel.Voucher.Treatment;



public class Logic {

public void findByTransport(String transport) {
		
		System.out.println();
		
		for(Shopping c : Shopping.values()) {
			if(c.getTypeOfTransport() == transport) {
				System.out.println(c);
			}
		}
		
		for(Recreation c : Recreation.values()) {
			if(c.getTypeOfTransport() == transport) {
				System.out.println(c);
			}
		}
		
		for(Treatment c : Treatment.values()) {
			if(c.getTypeOfTransport() == transport) {
				System.out.println(c);
			}
		}
		
		for(Cruise c : Cruise.values()) {
			if(c.getTypeOfTransport() == transport) {
				System.out.println(c);
			}
		}
		
		for(Excursion c : Excursion.values()) {
			if(c.getTypeOfTransport() == transport) {
				System.out.println(c);
			}
		}
	}
	
	public void findByFood(String food) {
		
		System.out.println();
		
		for(Shopping c : Shopping.values()) {
			if(c.getFood() == food) {
				System.out.println(c);
			}
		}
		
		for(Recreation c : Recreation.values()) {
			if(c.getFood() == food) {
				System.out.println(c);
			}
		}
		
		for(Treatment c : Treatment.values()) {
			if(c.getFood() == food) {
				System.out.println(c);
			}
		}
		
		for(Cruise c : Cruise.values()) {
			if(c.getFood() == food) {
				System.out.println(c);
			}
		}
		
		for(Excursion c : Excursion.values()) {
			if(c.getFood() == food) {
				System.out.println(c);
			}
		}
	}
	
	public void findByDays(int a) {
		
		System.out.println();
		
		for(Shopping c : Shopping.values()) {
			if(c.getNumberOfDays() == a) {
				System.out.println(c);
			}
		}
		
		for(Recreation c : Recreation.values()) {
			if(c.getNumberOfDays() == a) {
				System.out.println(c);
			}
		}
		
		for(Treatment c : Treatment.values()) {
			if(c.getNumberOfDays() == a) {
				System.out.println(c);
			}
		}
		
		for(Cruise c : Cruise.values()) {
			if(c.getNumberOfDays() == a) {
				System.out.println(c);
			}
		}
		
		for(Excursion c : Excursion.values()) {
			if(c.getNumberOfDays() == a) {
				System.out.println(c);
			}
		}
	}
	
	public <T> void sortVoucher(T[] elem) {
		
		List<T> list = new ArrayList<>();
		
		for(T c : elem) {
			list.add(c);
		}
		
		Collections.sort(list, new Comparator<T>() {
			public int compare(T o1, T o2) {
				return o1.toString().compareTo(o2.toString());}
			});
		
		for(T c : list) {
			System.out.println(c);
		}
		
	}
	
	public <T> void choiñeTypeOfVaucher(T[] elem) {
		
		for(T c : elem) {
			System.out.println(c);
		}
	}	

}
