package videoGameShopDemo;

public class PromotionManager implements PromotionService{

	@Override
	public void add(Promotion promotion) {
		System.out.println(promotion.getName() + " kampanyas� olu�turuldu");
		
	}

	@Override
	public void delete(Promotion promotion) {
		System.out.println("S�resi ge�en " + promotion.getName() + " kampanyas� kald�r�ld�");
		
		
	}

	@Override
	public void update(Promotion promotion) {
		System.out.println(promotion.getName() + " kampanyas� g�ncellendi");
		
		
	}

}
