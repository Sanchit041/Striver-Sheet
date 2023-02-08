package String;


public class prob1
{
   public class A
{
   A()
   {
   }
  void show()
  {
   System.out.println("parent");
  }   
}
public class B extends A
{
   B()
   {

   }
   @Override
   void show()
   {
      System.out.print("child");
   }
}

   public static void main(String[] args) {
        final B b = new B();
        b.show();
   }


}