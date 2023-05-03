public class Laptop {

    private final int id;
    private final String brand;
    private final int ram;
    private final int hdd;
    private final String system;
    private final String color;

    public Laptop(int id, String brand, int ram, int hdd, String system, String color) {
        this.id = id;
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.system = system;
        this.color = color;
    }


    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getSystem() {
        return system;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Laptop{" + "id" + id + ", brand=" + brand + ", other properties:" + ram + "," + hdd + "," + system + "," + color + "}";
    }

}

    