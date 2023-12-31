import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1,"Ýkra","Özgirgin",2001,"516464332");
		Gamer gamer2 = new Gamer(2,"Ali","Veli",2007,"12587892");
		Game game = new Game(1,"CS:GO",100);
		Campaign campaign = new Campaign(1,"Öðrenci", 20);
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.save(gamer);
		gamerManager.save(gamer2);
		gamerManager.remove(gamer);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.update(game);
		gameManager.delete(game);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign); 
		
		SalesManager salesManager = new SalesManager();
		salesManager.sale(gamer2, game);
		salesManager.saleWithCampaign(gamer, game, campaign);
		
		
		
	}

}
