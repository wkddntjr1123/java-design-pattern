package factories.windows;

import factories.LaptopDetailsFactory;
import factories.LaptopFactory;
import products.Laptop;
import products.windows.DellXPS;

public class DellXPSFactory implements LaptopFactory {
    @Override
    public Laptop createComputer() {
        LaptopDetailsFactory detailsFactory = new DellXPSDetailsFactory();
        return new DellXPS(detailsFactory);
    }
}
