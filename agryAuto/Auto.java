package by.htp.less.agryAuto;

import java.util.Arrays;

public class Auto {

	private Enums.CarBrand brand;
    private Wheel wheels[];
    private boolean isCharged;
    private Engine engine;

    public Auto(Enums.CarBrand brand,Enums.EngineType engineType) {
        this.brand = brand;
        this.isCharged = false;
        this.engine = new Engine();
        this.engine.engineType = engineType;
    }

    private class Engine {

        private Enums.EngineType engineType;

    }

    public void move() {System.out.println("Auto is moving!");}

    public void charge(){
        this.isCharged = true;
    }


    public void setWheels (Wheel [] wheels){

        this.wheels = wheels;
    }

    /**
     * Changes the wheel by index
     */
    public void changeWheel(Enums.WheelPosition pos, Wheel wheel){
        int index =0;

        switch (pos) {

            case FRONT_LEFT:
                index = 0;
                break;
            case FRONT_RIGHT:
                index = 1;
                break;
            case REAR_LEFT:
                index = 2;
                break;
            case REAR_RIGHT:
                index = 3;
                break;

        }

        this.wheels[index] = wheel;
    }

    private void printBrand(){
        StringBuilder sb = new StringBuilder("Car brand is: ");
        sb.append(this.brand);

        System.out.println(sb.toString());

    }

    @Override
    public String toString() {
        return "you Auto {" +
                "brand=" + brand +
                ", engine = "+ engine.engineType +
                ", wheels=" + Arrays.toString(wheels) +
                ", isCharged=" + isCharged +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Auto that = (Auto) o;

        if (isCharged != that.isCharged) return false;
        if (brand != that.brand) return false;
        if (engine.engineType != that.engine.engineType) return false;
        if (!Arrays.equals(wheels, that.wheels)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = brand.name().hashCode();
        result = 31 * result + engine.engineType.name().hashCode();
        result = 31 * result + HashUtils.hashWheelArray(wheels);
        result = 31 * result + (isCharged ? 1 : 0);
        return result;
    }

}
