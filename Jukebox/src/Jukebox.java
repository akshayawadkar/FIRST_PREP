import java.util.HashSet;
import java.util.Set;

public class Jukebox {
	private CDPlayer cdPlayer;
	private User user;
	private Set<CD> cdCollection;
	private SongSelector selector;
	
	public Jukebox(CDPlayer cdPlayer, User user, Set<CD> cdCollection, SongSelector selector) {
		this.cdPlayer = cdPlayer;
		this.user = user;
		this.cdCollection = new HashSet<>();
		this.selector = selector;
	}
	
	public Song getCurrentSong() {
		return selector.getSong();
	}
	
}
