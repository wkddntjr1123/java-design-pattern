package FactoryMethod.Button;

public class DesktopButton extends Button {
  @Override
  public void onClick() {
      System.out.println("PC 버튼 클릭!");
  }
}