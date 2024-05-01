package com.spring.first._FirstApllication;

public class BeanClass {
    private int num1;
    private int num2;
    
    public BeanClass() {
        
    }
    
    public BeanClass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int getNum1() {
        return this.num1;
    }
    
    public int getNum2() {
        return this.num2;
    }
    
    public void print() {
        int sum = num1 + num2;
        System.out.println("Sum of num1 and num2: " + sum);
    }
}
