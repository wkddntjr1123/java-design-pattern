package Singleton;

public class Main {

  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstant();
    System.out.println("I+J = "+singleton.getsum(10, 20)); // return : 30
    Singleton singleton2 = Singleton.getInstant();
    System.out.println("-------------------------------");
    System.out.println(singleton==singleton2); // true
    SingletonUtility singletonUtility = SingletonUtility.getInstance(10,10); //return : 20
    System.out.println(singletonUtility.getSum());

    singletonUtility = SingletonUtility.getInstance(10,20); //return : 20
    System.out.println(singletonUtility.getSum());

  }

}
