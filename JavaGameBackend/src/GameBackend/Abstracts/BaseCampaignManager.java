package GameBackend.Abstracts;

import GameBackend.Entities.Campaign;
import GameBackend.Entities.Product;

public class BaseCampaignManager implements CampaignService{
	@Override
	public void add(Campaign campaign,Product product) {
		product.setLastPrice(product.getPrice()-(product.getPrice()*campaign.getDiscount()/100));
		System.out.println("Kampanya eklendi: "+campaign.getCampaignName());
	}

	@Override
	public void update(Campaign campaign,Product product) {
		product.setLastPrice(product.getPrice()-(product.getPrice()*campaign.getDiscount()/100));
		System.out.println("Kampanya güncellendi: "+campaign.getCampaignName());
	}

	@Override
	public void remove(Campaign campaign,Product product) {
		product.setLastPrice(product.getPrice());
		System.out.println("Kampanya silindi:"+campaign.getCampaignName());
	}

}
