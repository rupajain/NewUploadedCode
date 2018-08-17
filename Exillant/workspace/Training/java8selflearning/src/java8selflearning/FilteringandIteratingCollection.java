package java8selflearning;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;  
public class FilteringandIteratingCollection {
	 public static void main(String[] args) {  
	        List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
	        // This is more compact approach for filtering data  
	        productsList.stream()  
	                             .filter(product -> product.price == 30000)  
	                             .forEach(product -> System.out.println(product.name));    
	   
	        // This is more compact approach for filtering data
	        Float totalPrice = productsList.stream()  
                    .map(product->product.price)  
                    .reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
        System.out.println(totalPrice);  
        
     // More precise code   
        float totalPrice2 = productsList.stream()  
                .map(product->product.price)  
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
        System.out.println(totalPrice2);  
        
        
        // Using Collectors's method to sum the prices.  
        double totalPrice3 = productsList.stream()  
                        .collect(Collectors.summingDouble(product->product.price));  
        System.out.println(totalPrice3);  
        
        
     // max() method to get max Product price   
        Product productA = productsList.stream()  
                        .max((product1, product2)->   
                        product1.price > product2.price ? 1: -1).get();  
          
        System.out.println(productA.price);  
        // min() method to get min Product price  
        Product productB = productsList.stream()  
                .max((product1, product2)->   
                product1.price < product2.price ? 1: -1).get();  
        System.out.println(productB.price);  
        
        
     // count number of products based on the filter  
        long count = productsList.stream()  
                    .filter(product->product.price<30000)  
                    .count();  
        System.out.println(count);  
        
        
     // Converting Product List into a Map  
        Map<Integer,String> productPriceMap =   
            productsList.stream()  
                        .collect(Collectors.toMap(p->p.id, p->p.name));  
              
        System.out.println(productPriceMap); 
        
        List<Float> productPriceList =   
                productsList.stream()  
                            .filter(p -> p.price > 30000) // filtering data  
                            .map(Product::getPrice)         // fetching price by referring getPrice method  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println(productPriceList); 
          
	 }  
}
