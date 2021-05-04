package videoGameShopDemo;

import java.sql.Date;

public class Main {

	public static void main(String[] args) {

		PlayerManager playerManager= new PlayerManager(new MernisServiceSimulation());
		
		Player player1= new Player();
		player1.setId(1);
		player1.setFirstName("Austin");
		player1.setLastName("Marcus");
		player1.setEmail("austin@marcus.com");
		player1.setDateOfBirth(new Date(1999, 5, 8));
		player1.setNationalityId("12345678900");
		
		Player player2= new Player();
		player2.setId(2);
		player2.setFirstName("Tolga");
		player2.setLastName("Çetinkaya");
		player2.setEmail("tolga@cetinkaya.com");
		player2.setDateOfBirth(new Date(1991, 2, 7));
		player2.setNationalityId("98765432100");
		
		playerManager.add(player1);
		playerManager.add(player2);
		
		System.out.println("----------------");
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setName("Assassins Creed Valhalla Ultimate Version");
		game1.setGenre("Action, Open World, Adventure");
		game1.setUnitPrice(539);
		
		Game game2 = new Game();
		game2.setId(2);
		game2.setName("Watch Dogs : Legion");
		game2.setGenre("Action, Open World");
		game2.setUnitPrice(269);	
		
		Promotion promotion1 = new Promotion();
		promotion1.setId(1);
		promotion1.setName("Efsane Assassins Creed indirimi");
		promotion1.setPromotionDetail("5 Mayýs  00:00 - 5 Mayýs 23:59 Tarihleri arasýndaki sana özel bu fýrsatý kaçýrma");
		promotion1.setPromotionRate(0.40);
 		
 		System.out.println("----------------");
 		
 		
		
		
 		Promotion promotion2 = new Promotion();
		promotion2.setId(2);
		promotion2.setName("Bahar indirimi");
		promotion2.setPromotionDetail("26 Nisan - 10 Mayýs Tarihlerinde Geçerli Hoþgeldin Bahar Ýndirimi Kampanyasý ");
		promotion2.setPromotionRate(0.15);		
		System.out.println("----------------");
		
		
		System.out.println(game2.getName()+ " Oyununun Kampanyalý Fiyatý : "  +  game2.getPromotionalPrice(promotion2));
		System.out.println(game1.getName()+ " Oyununun Kampanyalý Fiyatý : "   + game1.getPromotionalPrice(promotion1));
		System.out.println("----------------");
		
 		GameManager gameManager= new GameManager();
 		gameManager.add(game1);
 		System.out.println("----------------");
 		gameManager.add(game2);
 		System.out.println("----------------");
 		gameManager.delete(game2);
 		System.out.println("----------------");
 		
 		PromotionManager promotionManager= new PromotionManager();
 		promotionManager.add(promotion1);
 		System.out.println("----------------");
 		promotionManager.add(promotion2);
 		System.out.println("----------------");
 		promotionManager.update(promotion2);
 		System.out.println("----------------");
 		promotionManager.delete(promotion1);
 		System.out.println("----------------");
 		
 		GameSalesManager gameSalesManager= new GameSalesManager();
 		gameSalesManager.sellGame(player1, game1, promotion1);
 		
 		
 		
 		
 		
 		
		
		


	}

}
