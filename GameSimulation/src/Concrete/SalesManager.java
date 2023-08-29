package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService{

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(game.getGameName() + " isimli oyun " + gamer.getFirstName()+ " "+ gamer.getLastName()+ " taraf�ndan sat�n al�nd�.");
		
	}

	@Override
	public void saleWithCampaign(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " isimli oyun " + gamer.getFirstName()+ " "+ gamer.getLastName()+ " taraf�ndan %" + campaign.getDiscount()+ " indirimle sat�n al�nd�.");
		
	}

}
