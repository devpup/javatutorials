package org.devpup.javatutorials.eclipse;

class Calculator{
	static double PI = 3.14;
    int left, right;
      
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
      
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
  
public class CalculatorDemo4 {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();      
    
        Calculator c2 = new Calculator();
        Calculator.PI = 41.1;
        c2.setOprands(20, 40);
        c2.sum();       
        c2.avg();
   
    }
  
}
