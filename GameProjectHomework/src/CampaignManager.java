public class CampaignManager  implements CampaignService {

    @Override
    public void campaignAdd(Campaign campaign) {
        System.out.println("Kampanya eklendi  : " + campaign.campaignName);

    }

    @Override
    public void campaignUpdate(Campaign campaign) {
        System.out.println("Kampanya güncellendi  : " + campaign.campaignName);

    }

    @Override
    public void campaignDelete(Campaign campaign) {
        System.out.println("Kampanya Geri alýndý : " + campaign.campaignName);

    }

    
    

	@Override
	public void campaignApply(Campaign campaign) {
		  System.out.println("Kampanya Uygulandý : " + campaign.campaignName);
		
	}

}

