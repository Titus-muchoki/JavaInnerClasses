package org.example;

//public class Main {
    class outterClass {
        int x = 12;
    class innerClass {
        int y = 10;
    }
    public static void main(String[] args) {
        outterClass myObj = new outterClass();
        outterClass.innerClass myObj1 =myObj.new innerClass();
        System.out.println(myObj1.y + myObj.x);
        System.out.println(myObj.x);
    }
}