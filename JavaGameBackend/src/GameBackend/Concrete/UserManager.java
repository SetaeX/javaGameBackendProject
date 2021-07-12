package GameBackend.Concrete;

import GameBackend.Abstracts.BaseGamerManager;
import GameBackend.Abstracts.PersonCheckService;
import GameBackend.Entities.Gamer;

public class UserManager extends BaseGamerManager{
	private PersonCheckService checkService;

	public UserManager(PersonCheckService checkService) {
		this.checkService = checkService;
	}
	public void register(Gamer gamer) {
		if(checkService.checkIfRealPerson(gamer)) {
			System.out.println("Kullanýcý eklendi"+gamer.getUserName());
		}else {
			System.out.println("Doðrulama Geçersiz.");
		}
	}
}
