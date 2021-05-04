package videoGameShopDemo;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun adý : "+game.getName());
		System.out.println("Oyun türü : "+game.getGenre());
		System.out.println("Oyun fiyatý : "+game.getUnitPrice());
		System.out.println("Bilgilerine sahip oyun sisteme eklendi");		

		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" adlý oyunu sistemden sildiniz.");
	
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun adý : "+game.getName());
		System.out.println("Oyun türü : "+game.getGenre());
		System.out.println("Oyun fiyatý : "+game.getUnitPrice());
		System.out.println("Bilgileriyle oyun güncellendi.");
	
	}

}
