package com.LTI.Demo;

public class ThrowsUnchecked {
    
    public static void main(String[] args)  {
        
        
        
        System.out.println("welcome");
        
        ThrowsUnchecked obj1=new ThrowsUnchecked();
        
        
        try
        {
         obj1.f1();
        }
        catch( ArithmeticException rr)
        {
            System.out.println(rr.getMessage());
            
        }
        
                
        System.out.println("this is last logic");
    
        
    }
    
    
    void f1()
    {
        
        f2();
        
        
    }
    void f2()
    {
        
        
        f3();
    }
    void f3()
    {
        
  int z=20/0;        

   }

}
