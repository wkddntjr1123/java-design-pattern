package FactoryMethod.Dialog;

import FactoryMethod.Button.Button;
import FactoryMethod.Button.MobileButton;

public class MobileDialog extends Dialog {
  @Override
  public Button createButton() {
      return new MobileButton();
  }
}