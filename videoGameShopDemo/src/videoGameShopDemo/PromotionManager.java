package videoGameShopDemo;

public class PromotionManager implements PromotionService{

	@Override
	public void add(Promotion promotion) {
		System.out.println(promotion.getName() + " kampanyasý oluþturuldu");
		
	}

	@Override
	public void delete(Promotion promotion) {
		System.out.println("Süresi geçen " + promotion.getName() + " kampanyasý kaldýrýldý");
		
		
	}

	@Override
	public void update(Promotion promotion) {
		System.out.println(promotion.getName() + " kampanyasý güncellendi");
		
		
	}

}
