package GameBackend.Abstracts;

import GameBackend.Entities.Gamer;

public abstract class BaseGamerManager implements GamerService{

	@Override
	public void register(Gamer gamer) {
		System.out.println("Yeni oyuncu kayýt oldu "+gamer.getUserName());
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Bilgilerini güncelledi"+gamer.getUserName());
	}

	@Override
	public void remove(Gamer gamer) {
		System.out.println("Oyuncu hesabýný sildi"+gamer.getUserName());
	}

}
