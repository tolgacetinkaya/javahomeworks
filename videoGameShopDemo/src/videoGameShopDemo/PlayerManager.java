package videoGameShopDemo;

public class PlayerManager implements PlayerService {


	private CustomerCheckService customerCheckService;
	
	public PlayerManager (CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService=customerCheckService;		
	}
	
	
	@Override
	public void add(Player player) {
		
		if (customerCheckService.checkIfRealPerson(player)) {
			System.out.println(player.getFirstName() + " " + player.getLastName() + " kullan�c� hesab�n�z olu�turulmu�tur.");
		} else {
			System.out.println("Kimlik numaran�z� ad�n�z� soyad�n�z� ve do�um tarihinizi kontrol edip tekrar deneyiniz");
		}
			
	}

	@Override
	public void delete(Player player) {
		System.out.println(
				player.getFirstName() + " " + player.getLastName() + " kullan�c� hesab�n�z sistemden silinmi�tir.");

	}

	@Override
	public void update(Player player) {
		System.out
				.println(player.getFirstName() + " " + player.getLastName() + " kullan�c� hesab�n�z g�ncellenmi�tir.");

	}

}
