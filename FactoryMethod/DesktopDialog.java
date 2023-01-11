package FactoryMethod;

public class DesktopDialog extends Dialog {
  @Override
  public Button createButton() {
      return new DesktopButton();
  }
}