
public class SongSelector {

	
	private Song currentSong;
	
	public SongSelector(Song s) {
		this.currentSong = s;
	}
	
	public void setSong(Song s) {
		currentSong = s;
	}
	
	public Song getSong() {
		return currentSong;
	}
}
