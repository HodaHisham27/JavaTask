
package myonlineshop;

import java.util.Scanner;

public class MyOnlineShop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product[] arr = new Product[5];

        double p,total=0;
        System.out.println("Please, Enter prices: ");
        for (int i=0; i<5; i++) {
            p = input.nextDouble();
            arr[i]=new Childrenbook();
            arr[i].setPrice(p);
            total+=arr[i].getPrice();
        }
        System.out.println("Totla Price is: "+total);
    }
}
abstract class Product {
    public double price;
    public abstract void setPrice(double p);
    public abstract double getPrice();
}
abstract class Book extends Product {

}
class Childrenbook extends Book {
       @Override
    public void setPrice(double p) {
        price=p;
    }
    @Override
    public double getPrice() {
       return price; 
    } 
}
    
