
public class Main {
	
	
	public static void main(String[]args) {
		
		Game game = new Game();
		game.setGameId(1);
		game.setGameName("Counter-Strike:Global Offensive");
		game.setGameDescription("Online War Game");
		game.setGamePrice(75);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.update(game);
		gameManager.delete(game);
		
		
		System.out.println("************************************");		
		
		Gamer gamer = new Gamer(1, "Aleyna", "Isnýk", "Lenacým", "aleynaisnik@gmail.com", "22.08.2000");
		gamer.setGamerId(1);
		gamer.setFirstName("Aleyna");
		gamer.setLastName("Isnýk");
		gamer.setUserName("Lenacým");
		gamer.setEmail("aleynaisnik@gmail.com");
		gamer.setDateOfBirth("22.08.2000");
		gamer.setIdentificationNumber("12547896547");
		
	
		GamerManager gamerManager = new GamerManager();
		gamerManager.add(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		
		System.out.println("**********************************");		
		
		Campaign campaign = new Campaign();
		campaign.setCampaignId(1);
		campaign.setCampaignName("2021 Bahar Kampanyasý");
		campaign.setCampaignDiscount(25);
		
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.campaignAdd(campaign);
		campaignManager.campaignUpdate(campaign);
		campaignManager.campaignDelete(campaign);
		campaignManager.campaignApply(campaign);
		
		System.out.println("**********************************");	
		
		
		
		Sales sales = new Sales();
		
		SalesManager salesManager = new SalesManager();
		salesManager.compaignSale(gamer, campaign , game );
		salesManager.withoutCampaignSale(gamer, game );
		salesManager.returnOfSale(gamer , game);
		
		
		
		

		
		
		
		
		
		
		
		
		
	}

}
