package Singleton;

public class Singleton {
  private static Singleton  singleton = null;
  private Singleton(){

  }
  public static Singleton getInstant(){
    if(singleton ==  null){
      singleton = new Singleton();
      return singleton;
    }else{
      return singleton;
    }
  }
  public static int getsum(int i , int j){
    return i + j;
  }

}