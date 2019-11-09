import java.util.HashMap;
public class ProductsDB {

	HashMap<String,Double> hs = new HashMap<>();
	public HashMap<String,Double> data()
	{
		hs.put("IPad",65678.84);
		hs.put("Samsung",40000.0);
		hs.put("mobile",15000.65);
		hs.put("Huewei",65000.84);
		hs.put("TV",61833.84);
		return hs;
	}
	
}
