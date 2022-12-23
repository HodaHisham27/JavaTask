package myonlineshop2;

import java.util.Scanner;

public class MyOnlineShop2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product[] arr = new Product[5];

        double p,total=0;
        System.out.println("Please, Enter prices: ");
        for (int i=0; i<5; i++) {
            p = input.nextDouble();
            arr[i]=new Carton();
            arr[i].setPrice(p);
            total+=arr[i].getPrice();
        }
        System.out.println("Totla Price is: "+total);
    }
    
}
    interface Product {
    public abstract void setPrice(double p);
    public abstract double getPrice();
}
class Book implements Product {
    double price;
       @Override
    public void setPrice(double p) {
        price=p;
    }
    @Override
    public double getPrice() {
       return price; 
    } 
}
class Carton extends Book {
    String type;
}
class Childrenbook extends Book {

}
