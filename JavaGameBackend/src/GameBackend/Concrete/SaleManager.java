package GameBackend.Concrete;

import GameBackend.Entities.Gamer;
import GameBackend.Entities.Product;

public class SaleManager {

	public void sale(Gamer gamer,Product product) {
		System.out.println(gamer.getUserName()+"�r�n sat�n ald�: "+product.getProductName()+" --- "+product.getLastPrice());
	}
}
