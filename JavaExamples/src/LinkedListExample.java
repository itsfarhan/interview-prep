// Time Complexity:
// ● Access: O(n)
// ● Search: O(n)
// ● Insert: O(1)
// ● Remove: O(1)

import java.util.LinkedList;
import java.util.ListIterator;

class MusicPlaylist{
    private LinkedList<String> playlist;

    public MusicPlaylist(){
        playlist = new LinkedList<>();
    }

    public void addSong(String song){
        playlist.add(song);
        System.out.println("Song added: "+song);
    }

    public void removeSong(String song){
        if(playlist.remove(song)){
            System.out.println("Song removed: "+song);
        }else{
            System.out.println(song+" not found to remove");
        }
    }

    public void displayPlaylist(){
        System.out.println("Current Playlist: "+playlist);
    }

    public void playSongs(){
        ListIterator<String> iterator = playlist.listIterator();
        System.out.println("playing songs...");
        while(iterator.hasNext()){
            System.out.println("Playing next song: "+iterator.next());
        }
    }

    public void playPreviousSongs(){
        ListIterator<String> iterator = playlist.listIterator(playlist.size());
        System.out.println("Playing previous song...");
        while(iterator.hasPrevious()){
            System.out.println("Playing song: "+iterator.previous());
        }
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        MusicPlaylist musicPlaylist = new MusicPlaylist();

        musicPlaylist.addSong("song1");
        musicPlaylist.addSong("song2");
        musicPlaylist.addSong("song3");
        musicPlaylist.addSong("song4");
        musicPlaylist.addSong("song5");

        musicPlaylist.displayPlaylist();
        musicPlaylist.playSongs();

        musicPlaylist.addSong("song6");
        musicPlaylist.displayPlaylist();

        musicPlaylist.removeSong("song3");
        musicPlaylist.displayPlaylist();

        musicPlaylist.playPreviousSongs();
    }
}
