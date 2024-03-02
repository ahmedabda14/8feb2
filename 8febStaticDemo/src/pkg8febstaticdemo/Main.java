/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8febstaticdemo;

/**
 *
 * @author ahmed
 */
class person {
int age;
String name;

public person(){
  System.out.println("jalsjdjfnsdjnalsjkna");  
    
}
    public person(int a, String n) {
        this(); //looks for default constructor
        age = a;
        name = n;
        //if param are the same use this.
    }
void display(){
    System.out.println(age+"  "+name);
}
}
public class Main {

    int newvalue = 324;
    static{
        System.out.println("sdasjasfl");
    }
    static int cube(int a){
        return a*a*a;
    }
    void display(){
        System.out.println(newvalue);
    }
    public static void main(String[] args) {
System.out.println("the cube of 10 is: "+Main.cube(10));
System.out.println();

person p = new person(19,"df");
p.display();
        }
    
}
