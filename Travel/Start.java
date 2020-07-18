package by.htp.less.Travel;

import by.htp.less.Travel.Voucher.Cruise;
import by.htp.less.Travel.Voucher.Shopping;
import by.htp.less.Travel.Voucher.Excursion;

public class Start {

public static void main(String[] args) {
	
	
	    View view = new View();    // вывод просмотра приветствия приложения
	    view.x();		
	
	   // System.out.println("---Добро пожаловать в Путешествия----");
		// System.out.println("  Сейчас имеются путешествия >>>>  ");
		
		Logic logic = new Logic();   //  включаем логику (СОздаем)
		
		
		System.out.println();              // пропуск строки
		
		logic.findByTransport("Поезд");
		
		System.out.println();               // пропуск строки
		
		logic.findByFood("Все включено");
		
		System.out.println();              // пропуск строки
		
		logic.findByDays(14);
		
		System.out.println();            // пропуск строки
		
		logic.sortVoucher(Shopping.values());
		
		System.out.println();                 // пропуск строки
		
		logic.sortVoucher(Cruise.values());
		
		System.out.println();                     // пропуск строки
		
		logic.choiсeTypeOfVaucher(Excursion.values());
		
	

	}


}
