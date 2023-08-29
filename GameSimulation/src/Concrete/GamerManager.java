package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
 
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void save(Gamer gamer) {
		if(gamerCheckService.CheckIfRealPerson(gamer)) {
			System.out.println("Oyuncu kaydedildi : " + gamer.getFirstName() + " " + gamer.getLastName());
		}else {
			System.out.println("Not a valid person.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu g�ncellendi! " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void remove(Gamer gamer) {
		System.out.println("Oyuncu kald�r�ld�! " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

}
