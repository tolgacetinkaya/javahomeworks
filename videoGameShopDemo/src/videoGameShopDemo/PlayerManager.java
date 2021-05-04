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
			System.out.println(player.getFirstName() + " " + player.getLastName() + " kullanýcý hesabýnýz oluþturulmuþtur.");
		} else {
			System.out.println("Kimlik numaranýzý adýnýzý soyadýnýzý ve doðum tarihinizi kontrol edip tekrar deneyiniz");
		}
			
	}

	@Override
	public void delete(Player player) {
		System.out.println(
				player.getFirstName() + " " + player.getLastName() + " kullanýcý hesabýnýz sistemden silinmiþtir.");

	}

	@Override
	public void update(Player player) {
		System.out
				.println(player.getFirstName() + " " + player.getLastName() + " kullanýcý hesabýnýz güncellenmiþtir.");

	}

}
