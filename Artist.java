public class Artist {
    //attributes
    private String name;
    private String homeTown;
    private String dob;
    private String[] genres;

    public Artist(){}
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHomeTown() {
        return homeTown;
    }
    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String[] getGenres() {
        return genres;
    }
    public void setGenres(String[] genres) {
        this.genres = genres;
    }
}
