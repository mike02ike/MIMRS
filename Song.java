public class Song {

    //attributes
    private String title;
    private String genre;
    private Artist artist;
    private double length;
    private int dateReleased;

    //constructors
    public Song(){}

	//getters
    public String getTitle(){ return this.title; }

	public String getGenre(){ return this.genre; }
	
	public String getArtist(){ return this.artist; }

	public double getLength(){ return this.length; }

	public int getdateReleased(){ return this.dateReleased; }

    //setters
    public void setTitle( String title ){ this.title = title; }

    public void setGenre( String genre ){ this.genre = genre;  }

    public void setArtist( String artist ){ this.artist = artist; }

    public void setLength( double length ){ this.length = length; }

    public void setdateReleased( int dateReleased ){ this.dateReleased = dateReleased; }

}
