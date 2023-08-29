package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService{

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(game.getGameName() + " isimli oyun " + gamer.getFirstName()+ " "+ gamer.getLastName()+ " tarafýndan satýn alýndý.");
		
	}

	@Override
	public void saleWithCampaign(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " isimli oyun " + gamer.getFirstName()+ " "+ gamer.getLastName()+ " tarafýndan %" + campaign.getDiscount()+ " indirimle satýn alýndý.");
		
	}

}
