package FactoryMethod;

import FactoryMethod.Dialog.Dialog;
import FactoryMethod.Dialog.MobileDialog;

public class Main {
  public static void main(String[] args) {
      Dialog myDialog = new MobileDialog();
      myDialog.startClick();
  }
}