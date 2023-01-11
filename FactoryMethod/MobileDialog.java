package FactoryMethod;

public class MobileDialog extends Dialog {
  @Override
  public Button createButton() {
      return new MobileButton();
  }
}