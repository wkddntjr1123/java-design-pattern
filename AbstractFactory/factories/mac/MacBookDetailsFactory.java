package factories.mac;

import factories.LaptopDetailsFactory;
import products.Display;
import products.GraphicCard;
import products.Processor;
import products.SSD;
import products.mac.MacBookDisplay;
import products.mac.MacBookGraphicCard;
import products.mac.MacBookProcessor;
import products.mac.MacBookSSD;

public class MacBookDetailsFactory implements LaptopDetailsFactory {
    @Override
    public Display createDisplay() {
        return new MacBookDisplay();
    }

    @Override
    public GraphicCard createGraphicCard() {
        return new MacBookGraphicCard();
    }

    @Override
    public Processor createProcessor() {
        return new MacBookProcessor();
    }

    @Override
    public SSD createSSD() {
        return new MacBookSSD();
    }
}
