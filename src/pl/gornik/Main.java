package pl.gornik;

import pl.gornik.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        Product product1 = new Product("mleko","nabiał",5.45,1,"l");
        Product product2 = new Product("lays","chipsy",6.99,350,"g");
        Product product3 = new Product("chleb","pieczywo",3.59,1,"szt");
        Product product4 = new Product("kielbasa","mieso",6.98,200,"g");
        Product product5 = new Product("woda","napoj",1.99,1.5,"l");
        Product product6 = new Product("Top Chips","chipsy",4.99,300,"g");
        Product product7 = new Product("ser","nabiał",8.99,200,"g");
        Product product8 = new Product("wedlina","mieso",35.99,1,"kg");
        Product product9 = new Product("tymbark","napoj",3.69,1,"l");

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);


        for(int i = 0;i< products.size();i++){
            System.out.println(products.get(i));
        }

        System.out.println("======================================================================================================");

        for (Product product:products) {
            System.out.println(product);

        }

        System.out.println("======================================================================================================");

        for (Product product: products) {
            if(product.getCategory().equalsIgnoreCase("nabiał")){
                System.out.println(product);
            }

        }
        System.out.println("======================================================================================================");

        System.out.println("Przedmioty zaczynajace sie od A do K");
        for(Product product : products){
            if(product.getName().toUpperCase().charAt(0) > 64 && product.getName().toUpperCase().charAt(0) < 76) {
                System.out.println(product);
            }
        }
        System.out.println("\nProdukty od f do p");
        for(Product product : products){
            if(product.getName().toUpperCase().charAt(0) >= 70 && product.getName().toUpperCase().charAt(0) < 80){
                System.out.println(product);
            }
        }
        System.out.println("======================================================================================================");

        System.out.println(product1.ileZaIle());
        System.out.println(product2.ileZaIle());

        System.out.println("======================================================================================================");
        System.out.println("ceny jednostkowe");


        for(Product product : products){
            System.out.println(product.cenaJednostkowa());
        }


    }
}