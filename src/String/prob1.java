package String;


public class prob1
{
   public class A
{
  void show()
  {
   System.out.println("parent");
  }   
}
public class B extends A
{
   @Override
   void show()
   {
      System.out.print("child");
   }
}

   public static void main(String[] args) {
        B b = new B();
        b.show();
   }


}