package Abstract;

import Entities.Gamer;

public interface GamerService {
	void save(Gamer gamer);
	void update(Gamer gamer);
	void remove(Gamer gamer);
}
