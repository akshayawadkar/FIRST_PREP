import java.util.LinkedList;
import java.util.Queue;

public class Playlist {

	
	private Song song;
	private Queue<Song> queue;
	
	public Playlist(Song song, Queue<Song> queue) {
		queue = new LinkedList<Song>(queue);
		queue.add(song);
	}
	
	public Song nextSong() {
		return queue.poll();
	}
	
	public void addSongToQueue(Song s) {
		queue.add(s);
	}
	
	
}
