package factories;

import products.Display;
import products.GraphicCard;
import products.Processor;
import products.SSD;

public interface LaptopDetailsFactory {
    Display createDisplay();
    GraphicCard createGraphicCard();
    Processor createProcessor();
    SSD createSSD();
}
