package abstractionn;

public abstract class MobileUser {
  abstract void sendMessage();
  
  //non abstract method
  void call(){
      System.out.println("I am non abstract method");
  }
}
