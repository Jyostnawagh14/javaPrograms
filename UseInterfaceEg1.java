package mypack;

//Create an interface called "Playable" with a method called "play". Create two classes called "Song" and "Video" that implement the Playable interface and implement the "play" method. Create objects of both the Song and Video classes and call their respective "play" methods.

//Create the Playable interface with the "play" method
interface Playable
{
 void play();//play() method is called
}

//Create the Song class that implements the Playable interface & Play() method
class Song implements Playable
{
 private String title;//data members

 public Song(String title)//We take title for songs
 {
     this.title = title;
 }

 public void play() //Override is done
 {
     System.out.println("Playing song: " + title);//Playing song: Song Title
 }
}

//Create the Video class that implements the Playable interface & Play() method
class Video implements Playable
{
 private String title;//data members

 public Video(String title)//We take title for video
 {
     this.title = title;
 }

 @Override
 public void play() //Override is done
 {
     System.out.println("Playing video: " + title);//Playing video: Video Title
 }
}

public class UseInterfaceEg1//Main class
{
 public static void main(String[] args)//Main method
 {
     // Create objects of the Song and Video classes
	 
     Song song = new Song("Song Title");
     Video video = new Video("Video Title");

     // Call the "play" method of the Song and Video objects
     
     song.play();
     video.play();
 }
}

//output:-
//Playing song: Song Title
//Playing video: Video Title
