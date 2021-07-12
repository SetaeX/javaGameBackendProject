package GameBackend;

import GameBackend.Abstracts.BaseCampaignManager;
import GameBackend.Abstracts.BaseGamerManager;
import GameBackend.Adapters.MernisServiceAdapter;
import GameBackend.Concrete.SaleManager;
import GameBackend.Concrete.UserManager;
import GameBackend.Entities.Campaign;
import GameBackend.Entities.Gamer;
import GameBackend.Entities.Product;

public class Main {
//Bu kimlik doðrulamasý Türk vatandaþý olanlara aittir
	public static void main(String[] args) {
		BaseGamerManager user=new UserManager(new MernisServiceAdapter());
		Gamer gamer=new Gamer(1,"Ahmet","Terk",1999,"12345678901","trrt");
		Product product=new Product(1,156.12,"FallGuys","Bu bir oyun");
		user.register(gamer);
		user.update(gamer);
		user.remove(gamer);
		
		BaseCampaignManager campaignManager=new BaseCampaignManager();
		SaleManager sale=new SaleManager();
		campaignManager.add(new Campaign(1,15,"kasim15"), product);
		sale.sale(gamer, product);
		campaignManager.update(new Campaign(1,5,"kasim15"),product);
		sale.sale(gamer, product);
		campaignManager.remove(new Campaign(1,0,"kasim15"), product);
		sale.sale(gamer, product);
	}

}
