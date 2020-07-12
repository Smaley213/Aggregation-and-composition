package by.htp.less.agryAuto;

public class Wheel {

	private Enums.TyreBrand brand;
    private int wide;
    private int height;
    private int radius;

    public Wheel(Enums.TyreBrand brand, int wide, int height, int radius) {
        this.brand = brand;
        this.height = height;
        this.wide = wide;
        this.radius = radius;
    }


    @Override
    public String toString() {
        return  brand +
                " " + wide +
                "/" + height +
                "R" + radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wheel wheel = (Wheel) o;

        if (height != wheel.height) return false;
        if (radius != wheel.radius) return false;
        if (wide != wheel.wide) return false;
        if (brand != wheel.brand) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = brand.name().hashCode();
        result = 31 * result + wide;
        result = 31 * result + height;
        result = 31 * result + radius;
        return result;
    }

}
