package by.htp.less.agryAuto;

public class Runner {

	 public static void main(String[] args) {

	        Auto auto1 = new Auto(Enums.CarBrand.BMW, Enums.EngineType.DIESEL);

	        Wheel wheel = new Wheel(Enums.TyreBrand.GOODYEAR,215,60,16);
	        Wheel wheels [] = {wheel,wheel,wheel,wheel};

	        auto1.setWheels(wheels);
	        auto1.charge();

	        System.out.println(auto1.toString());
	        System.out.println("auto1 hash =" + auto1.hashCode());
	        auto1.move();
	        
	        Auto auto2 = new Auto(Enums.CarBrand.BMW, Enums.EngineType.DIESEL);

	        Wheel wheel2 = new Wheel(Enums.TyreBrand.GOODYEAR,215,60,16);
	        Wheel wheels2 [] = {wheel2,wheel2,wheel2,wheel2};

	        auto2.setWheels(wheels2);
	        auto2.charge();
	        System.out.println(auto2.toString());
	        System.out.println("auto2 hash =" + auto2.hashCode());

	        System.out.println("auto1 (hash "+auto1.hashCode()+ ") = auto2 (hash "+ auto2.hashCode()+ "):"+auto1.equals(auto2));


	        System.out.println("changing wheels on auto1");
	        Wheel newWheel = new Wheel(Enums.TyreBrand.MICHELEN,215,60,16);

	        auto1.changeWheel(Enums.WheelPosition.FRONT_LEFT,newWheel);
	        auto1.changeWheel(Enums.WheelPosition.FRONT_RIGHT,newWheel);

	        System.out.println("auto1 (hash "+auto1.hashCode()+ ") = auto2 (hash "+ auto2.hashCode()+ "):"+auto1.equals(auto2));


	    }

}
