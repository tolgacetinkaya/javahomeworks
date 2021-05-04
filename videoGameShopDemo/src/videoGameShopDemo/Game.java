package videoGameShopDemo;

public class Game implements Entity{

	private int id;
	private String name;
	private String genre;
	private double unitPrice;		
	
	public Game() {}
	
	
	public Game(int id, String name, String genre, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.unitPrice = unitPrice;
		
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


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public double getPromotionalPrice(Promotion promotion) {
		return unitPrice - (unitPrice* promotion.getPromotionRate());
	}
	
	
	
	
	
}
