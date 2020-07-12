package by.htp.less.agryAuto;

public class HashUtils {

	 private HashUtils(){}

	    public static int hashWheelArray(Wheel wheels []){
	        int result = 0;
	        for(int i=1;i<wheels.length;i++) {
	            result = result + i * wheels[i-1].hashCode();
	        }

	        return result;

	    }

}
