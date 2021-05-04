
public class SalesManager implements SalesService {

	@Override
	public void compaignSale(Gamer gamer, Campaign campaign, Game game) {
		String campaignSale = "kampanyalý satýþ yapýldý";
		System.out.println(gamer.getFirstName() + "isimli kullacýya" + game.gameName + "adlý oyun" + campaignSale );
		
	}

	@Override
	public void withoutCampaignSale(Gamer gamer, Game game) {
		String withoutCampaignSale = "  kampanyasýz satýþý yapýldý ";
		System.out.println(gamer.getFirstName() + "isimli kullacýya" + game.gameName + "adlý oyun" + withoutCampaignSale );
		
		
	}

	@Override
	public void returnOfSale(Gamer gamer, Game game) {
		String returnOfSale = "iade edildi";
		System.out.println(gamer.getFirstName() + "isimli kullacý tarafýndan" + game.gameName + "  " +"adlý oyun"+ "  " + returnOfSale );
		
	}


}
