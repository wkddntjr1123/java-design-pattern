package FactoryMethod;

public abstract class Dialog {
  public void startClick()
  {
      Button button = createButton();
      button.onClick();
  }

  abstract Button createButton();
}