package GameBackend.Abstracts;

import GameBackend.Entities.Gamer;

public interface PersonCheckService {
	boolean checkIfRealPerson(Gamer gamer);
}
