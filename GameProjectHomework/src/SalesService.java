
public interface SalesService {
	
	void compaignSale(Gamer gamer, Campaign campaign, Game game);
	
	void withoutCampaignSale(Gamer gamer, Game game);
	
	void returnOfSale(Gamer gamer, Game game );

}
