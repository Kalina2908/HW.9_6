import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Laptop> laptops = new ArrayList<>();
        
        laptops.add(new Laptop(111, "ASUS", 10, 100, "Linux", "black"));
        laptops.add(new Laptop(222, "Aser", 20, 200, "Windows", "white"));
        laptops.add(new Laptop(333, "Lenovo", 30, 300, "Windows", "red"));


        System.out.println("Выберите фильтр:");
        System.out.println("1 - сортировка по бренду");
        System.out.println("2 - сортировка по ОЗУ");
        System.out.println("3 - сортировка по HDD");
        System.out.println("4 - сортировка по OS");
        System.out.println("5 - сортировка по цвету");
        System.out.println("Ваш выбор: ");

        Scanner iScanner = new Scanner(System.in);
        int act = iScanner.nextInt();
        //iScanner.close();
        if (act == 1) {
            System.out.printf("Введите название бренда: ");
            Scanner scan = new Scanner(System.in);
            String findBrand = scan.nextLine();

            List<Laptop> result = new LaptopFilter()
                .setBrand(findBrand)
                .filter(laptops);
            System.out.println(result);
            scan.close();
        }

        if (act == 2) {
            System.out.printf("Введите минимальный параметр ОЗУ: ");
            Scanner scan = new Scanner(System.in);
            int findRam = Integer.parseInt(scan.nextLine());

            List<Laptop> result = new LaptopFilter()
                .setMinRam(findRam)
                .filter(laptops);
            System.out.println(result);
            scan.close();
        }

        if (act == 3) {
            System.out.printf("Введите минимальный параметр hdd: ");
            Scanner scan = new Scanner(System.in);
            int findHdd = Integer.parseInt(scan.nextLine());

            List<Laptop> result = new LaptopFilter()
                .setMinHdd(findHdd)
                .filter(laptops);
            System.out.println(result);
            scan.close();
        }

        if (act == 4) {
            System.out.printf("Введите операционную систему: ");
            Scanner scan = new Scanner(System.in);
            String findOs = scan.nextLine();

            List<Laptop> result = new LaptopFilter()
                .setSystem(findOs)
                .filter(laptops);
            System.out.println(result);
            scan.close();
        }

        if (act == 5) {
            System.out.printf("Введите цвет: ");
            Scanner scan = new Scanner(System.in);
            String findColor = scan.nextLine();

            List<Laptop> result = new LaptopFilter()
                .setColor(findColor)
                .filter(laptops);
            System.out.println(result);
            scan.close();
        }

        else {
            System.out.printf("Ошибка!");
        }
    iScanner.close();
    }

}

