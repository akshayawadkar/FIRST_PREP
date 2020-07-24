
public class CDPlayer {

	
	private Playlist playlist;
	private CD cd;
	

	public CDPlayer(CD c) {
		this.cd = c;
	}
	
	public CDPlayer(Playlist p) {
		this.playlist = p;
	}
	
	public CDPlayer(CD c, Playlist p) {
		this.cd = c;
		this.playlist = p;
	}
	
	
	
	public void setPlaylist(Playlist p) {
		this.playlist = p;
	}
	
	public Playlist getPlaylist() {
		return this.playlist;
	}
	
	public void playSong(Song s) {
		
	}
}
