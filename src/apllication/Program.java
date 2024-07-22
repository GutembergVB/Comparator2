package apllication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		// Comparator classe anonima
				List<Product> list = new ArrayList<>();

				list.add(new Product("TV", 900.00));
				list.add(new Product("Notebook", 1200.00));
				list.add(new Product("Tablet", 450.00));
				
				Comparator<Product> comp = new Comparator<Product>(){ // Comparator() em classe anonima.
                   @Override
					public int compare(Product p1, Product p2) {
						return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()) ;
					}
				};

				list.sort(comp);// sort() ordena elementos de uma  coleção e Arrays, 
		                                       // em ordem natural ou a escolhadefinida por compatoTo(0).
				for (Product p : list) {
					System.out.println(p);
				}
	}
}

/*  SAÍDA
Product [name=Notebook, price=1200.0]
Product [name=Tablet, price=450.0]
Product [name=TV, price=900.0]    */
