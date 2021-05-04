package videoGameShopDemo;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun ad� : "+game.getName());
		System.out.println("Oyun t�r� : "+game.getGenre());
		System.out.println("Oyun fiyat� : "+game.getUnitPrice());
		System.out.println("Bilgilerine sahip oyun sisteme eklendi");		

		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" adl� oyunu sistemden sildiniz.");
	
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun ad� : "+game.getName());
		System.out.println("Oyun t�r� : "+game.getGenre());
		System.out.println("Oyun fiyat� : "+game.getUnitPrice());
		System.out.println("Bilgileriyle oyun g�ncellendi.");
	
	}

}
