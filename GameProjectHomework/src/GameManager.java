
public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi :" + game.gameName);
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi :" + game.gameName);
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi :" + game.gameName);
	}
	

}
