import java.util.ArrayList;
import java.util.List;

public class Product implements ProductImpl {
	List<Products> pr = new ArrayList();
	public Product()
	{
		Products p = new Products(101,"Laptop",45678.34);
		Products p1 = new Products(102,"IPad",65678.84);
		Products p2 = new Products(103,"Iphone",67584.54);
		Products p3 = new Products(104,"IPod",23546.78);
		Products p4 = new Products(105,"Hard Disk",5764.7);
		Products p5 = new Products(106,"Data Cables",2346.6);
		Products p6 = new Products(107,"Fit Bit Wrist Band",9845.7);
		Products p7 = new Products(108,"Arm Sleeves",1386.4);
		Products p8 = new Products(109,"Adapter",4567.0);
		Products p9 = new Products(110,"Samsung Tab",54527.5);
		pr.add(p);pr.add(p1);pr.add(p2);pr.add(p3);pr.add(p4);pr.add(p5);pr.add(p6);pr.add(p7);pr.add(p8);pr.add(p9);
		
	}
	
	@Override
	public void addProduct(String name, int id, double price) {
		Products p10 = new Products();
		p10.setId(id);
		p10.setName(name);
		p10.setPrice(price);
		pr.add(p10);
	}

}
