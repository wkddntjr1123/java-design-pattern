package products.windows;

import factories.LaptopDetailsFactory;
import products.Laptop;

public class DellXPS extends Laptop {
    public DellXPS(LaptopDetailsFactory detailsFactory) {
        display = detailsFactory.createDisplay();
        graphicCard = detailsFactory.createGraphicCard();
        processor = detailsFactory.createProcessor();
        ssd = detailsFactory.createSSD();
    }

    @Override
    public String getDescription() {
        return "This is a Dell XPS 9370\n" + super.toString();
    }
}
