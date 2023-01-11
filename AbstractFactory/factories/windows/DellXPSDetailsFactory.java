package factories.windows;

import factories.LaptopDetailsFactory;
import products.Display;
import products.GraphicCard;
import products.Processor;
import products.SSD;
import products.windows.DellXPSDisplay;
import products.windows.DellXPSGraphicCard;
import products.windows.DellXPSProcessor;
import products.windows.DellXPSSSD;

public class DellXPSDetailsFactory implements LaptopDetailsFactory {
    @Override
    public Display createDisplay() {
        return new DellXPSDisplay();
    }

    @Override
    public GraphicCard createGraphicCard() {
        return new DellXPSGraphicCard();
    }

    @Override
    public Processor createProcessor() {
        return new DellXPSProcessor();
    }

    @Override
    public SSD createSSD() {
        return new DellXPSSSD();
    }
}
