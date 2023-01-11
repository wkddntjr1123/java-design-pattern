import factories.LaptopFactory;
import factories.mac.MacBookFactory;
import factories.windows.DellXPSFactory;
import products.Laptop;

public class main {
    public static void main(String[] args) {
        Laptop laptop;

        LaptopFactory dellFactory = new DellXPSFactory();
        LaptopFactory macBookFactory = new MacBookFactory();

        laptop = dellFactory.createComputer();
        System.out.println(laptop.getDescription());

        laptop = macBookFactory.createComputer();
        System.out.println(laptop.getDescription());
    }
}
