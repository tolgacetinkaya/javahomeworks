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
			System.out.println(player.getFirstName() + " " + player.getLastName() + " kullanıcı hesabınız oluşturulmuştur.");
		} else {
			System.out.println("Kimlik numaranızı adınızı soyadınızı ve doğum tarihinizi kontrol edip tekrar deneyiniz");
		}
			
	}

	@Override
	public void delete(Player player) {
		System.out.println(
				player.getFirstName() + " " + player.getLastName() + " kullanıcı hesabınız sistemden silinmiştir.");

	}

	@Override
	public void update(Player player) {
		System.out
				.println(player.getFirstName() + " " + player.getLastName() + " kullanıcı hesabınız güncellenmiştir.");

	}

}
