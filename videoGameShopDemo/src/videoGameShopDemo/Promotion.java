package videoGameShopDemo;

public class Promotion implements Entity{

	private int id;
	private double promotionRate;
	private String name;	
	private String promotionDetail;
	
	public Promotion() {}
	
	public Promotion(int id, double promotionRate, String name, String promotionDetail) {
		super();
		this.id = id;
		this.promotionRate = promotionRate;
		this.name = name;
		
		this.promotionDetail = promotionDetail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPromotionRate() {
		return promotionRate;
	}

	public void setPromotionRate(double promotionRate) {
		this.promotionRate = promotionRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getPromotionDetail() {
		return promotionDetail;
	}

	public void setPromotionDetail(String promotionDetail) {
		this.promotionDetail = promotionDetail;
	}
	
}
