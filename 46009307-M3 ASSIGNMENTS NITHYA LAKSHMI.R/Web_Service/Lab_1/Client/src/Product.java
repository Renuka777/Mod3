import java.util.HashMap;
import java.util.Map;

public class Product implements ProductDB {

	@Override
	public String availPruduct(String str) {
		String st = null;
		ProductsDB db= new ProductsDB();
		boolean b= false;
		HashMap<String,Double> hs = db.data();
		for(Map.Entry<String,Double> h : hs.entrySet())
		{
			if(h.getKey().equals(str)) {
				b = true;
				st = "Price of the product "+ h.getValue();
			}
		}
		if(!b)
		{
			st = "Product does not exists!!";
		}
		return st;
	}
	

}
