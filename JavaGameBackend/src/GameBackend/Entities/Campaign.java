package GameBackend.Entities;

import GameBackend.Abstracts.Entity;

public class Campaign implements Entity{
	private int id;
	private int discount;
	private String campaignName;
	public Campaign() {
		
	}
	public Campaign(int id,int discount, String campaignName) {
		this.id = id;
		this.setDiscount(discount);
		this.campaignName = campaignName;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getId() {
		return id;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
