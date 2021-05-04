package videoGameShopDemo;

public class GameSalesManager {

	void sellGame(Player player, Game game,Promotion promotion) {
		System.out.println(player.getFirstName() + " isimli kullanýcý, ");
		System.out.println(game.getName() + " adlý oyunu ");
		System.out.println(promotion.getName()+ " kampanyasýndan yararlanarak");
		System.out.println( "%"+(100*promotion.getPromotionRate()) + " oranýnda indirim kullanarak satýn aldý.");
	}
	
}
