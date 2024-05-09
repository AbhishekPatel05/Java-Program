import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class A{
	int productID;
    int price;
	String Name;
	String companyName;
	public A(int productID, String name, int price, String companyName) {
		this.productID = productID;
	    this.Name = name;
		this.price = price;
		this.companyName = companyName;
	}
	
}
public class Stream {
    public static void main(String[] args) {
        List<A>ProductList=new ArrayList<A>();
		ProductList.add(new A(1,"Soap",300,"Usha"));
		ProductList.add(new A(2,"Shampoo",500,"Usha"));
		ProductList.add(new A(3,"Cooler",4000,"Usha"));
		ProductList.add(new A(4,"Fan",450,"Usha"));
		ProductList.add(new A(5,"Watch",4002,"Usha"));
		
		List<Integer>ProdList=ProductList.stream()
                           .filter(p->p.productID>3)//Filering
                           .map(m->m.productID)//fetching
                           .collect(Collectors.toList());
		System.out.println(ProdList);
		
		             
    }
}