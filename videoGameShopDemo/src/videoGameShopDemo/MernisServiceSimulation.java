package videoGameShopDemo;




public class MernisServiceSimulation implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		
		if(player.getNationalityId()=="12345678900" && player.getFirstName()=="Austin" && player.getLastName()=="Marcus" || 
				player.getNationalityId()=="98765432101" && player.getFirstName()=="Tolga" && player.getLastName()=="Çetinkaya" 	) {
			return true;
			
		}else {
			return false;
		}
		
	}	
	
	

	

}
