package videoGameShopDemo;

public class GameSalesManager {

	void sellGame(Player player, Game game,Promotion promotion) {
		System.out.println(player.getFirstName() + " isimli kullan�c�, ");
		System.out.println(game.getName() + " adl� oyunu ");
		System.out.println(promotion.getName()+ " kampanyas�ndan yararlanarak");
		System.out.println( "%"+(100*promotion.getPromotionRate()) + " oran�nda indirim kullanarak sat�n ald�.");
	}
	
}
