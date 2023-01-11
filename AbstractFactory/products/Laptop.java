package products;

public abstract class Laptop {
    protected Display display;
    protected GraphicCard graphicCard;
    protected Processor processor;
    protected SSD ssd;

    public abstract String getDescription();

    @Override
    public String toString() {
        return "Display: " + display.toString() + "\n"
                + "GraphicCard: " + graphicCard.toString() + "\n"
                + "Processor: " + processor.toString() + "\n"
                + "SSD: " + ssd.toString();
    }
}
