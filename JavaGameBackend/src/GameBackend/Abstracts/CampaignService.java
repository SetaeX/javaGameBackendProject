package GameBackend.Abstracts;

import GameBackend.Entities.Campaign;
import GameBackend.Entities.Product;

public interface CampaignService {
	public void add(Campaign campaign,Product product);
	public void update(Campaign campaign,Product product);
	public void remove(Campaign campaign,Product product);
}
