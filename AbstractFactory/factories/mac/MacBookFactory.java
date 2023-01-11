package factories.mac;

import factories.LaptopDetailsFactory;
import factories.LaptopFactory;
import products.Laptop;
import products.mac.MacBook;

public class MacBookFactory implements LaptopFactory {
    @Override
    public Laptop createComputer() {
        LaptopDetailsFactory detailsFactory = new MacBookDetailsFactory();
        return new MacBook(detailsFactory);
    }
}
