package Products;

public class Products {
	
	private int id;
	private String name;
	private int cost;
	
	public Products(int id, String name, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public Products() {
		 
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", cost=" + cost + "]\n";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	

}
