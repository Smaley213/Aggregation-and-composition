package by.htp.less.Travel;

import by.htp.less.Travel.Voucher.Cruise;
import by.htp.less.Travel.Voucher.Shopping;
import by.htp.less.Travel.Voucher.Excursion;

public class Start {

public static void main(String[] args) {
	
	
	    View view = new View();    // ����� ��������� ����������� ����������
	    view.x();		
	
	   // System.out.println("---����� ���������� � �����������----");
		// System.out.println("  ������ ������� ����������� >>>>  ");
		
		Logic logic = new Logic();   //  �������� ������ (�������)
		
		
		System.out.println();              // ������� ������
		
		logic.findByTransport("�����");
		
		System.out.println();               // ������� ������
		
		logic.findByFood("��� ��������");
		
		System.out.println();              // ������� ������
		
		logic.findByDays(14);
		
		System.out.println();            // ������� ������
		
		logic.sortVoucher(Shopping.values());
		
		System.out.println();                 // ������� ������
		
		logic.sortVoucher(Cruise.values());
		
		System.out.println();                     // ������� ������
		
		logic.choi�eTypeOfVaucher(Excursion.values());
		
	

	}


}
