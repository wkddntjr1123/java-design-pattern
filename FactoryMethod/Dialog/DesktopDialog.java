package FactoryMethod.Dialog;

import FactoryMethod.Button.Button;
import FactoryMethod.Button.DesktopButton;

public class DesktopDialog extends Dialog {
  @Override
  public Button createButton() {
      return new DesktopButton();
  }
}