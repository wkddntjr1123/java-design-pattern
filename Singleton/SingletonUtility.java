package Singleton;

public class SingletonUtility {
  private static SingletonUtility singleton = null;
  private static int i;
  private static int j;

  private SingletonUtility(int x, int y) {
    i = x;
    j = y;
  }

  public static SingletonUtility getInstance(int x, int y) {
    if (singleton == null) {
      singleton = new SingletonUtility(x, y);
      return singleton;
    } else {
      return singleton;
    }
  }

  public static int getSum() {
    return i + j;
  }
}