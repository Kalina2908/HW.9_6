import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class LaptopFilter {

    
    private String brand;
    private Integer minRam;
    private Integer minHdd;
    private String system;
    private String color;


    public LaptopFilter setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public LaptopFilter setMinRam(Integer minRam) {
        this.minRam = minRam;
        return this;
    }

    public LaptopFilter setMinHdd(Integer minHdd) {
        this.minHdd = minHdd;
        return this;
    }

    public LaptopFilter setSystem(String system) {
        this.system = system;
        return this;
    }

    public LaptopFilter setColor(String color) {
        this.color = color;
        return this;
    }
    
    public List<Laptop> filter(Collection<Laptop> laptops) {
        return laptops.stream()
                .filter(laptop->brand == null || laptop.getBrand().equals(brand))
                .filter(laptop->rangeOf(laptop.getRam(), minRam))
                .filter(laptop->rangeOf(laptop.getHdd(), minHdd))
                .filter(laptop->system == null || laptop.getSystem().equals(system))
                .filter(laptop->color == null || laptop.getColor().equals(color))
                .collect(Collectors.toList());
    }

    private boolean rangeOf(Integer value, Integer min) {
        if (min==null) return true;
        if (min!=null && min<=value) return true;
        return false;
    }
    
}