package Entities;

public class Campaign {
	private int campaignId;
	private String CampaignName;
	private int discount;
	
	public Campaign() {
		
	}
	
	public Campaign(int campaignId, String campaignName, int discount) {
		super();
		this.campaignId = campaignId;
		CampaignName = campaignName;
		this.discount = discount;
	}
	
	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return CampaignName;
	}

	public void setCampaignName(String campaignName) {
		CampaignName = campaignName;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
}
