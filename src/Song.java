import java.util.ArrayList;
import java.util.HashSet;

public class Song
{
    private String Artist;
    private String Title;
    private HashSet<String> a;

    public Song(String title, String artist)
    {
        this.Title = title;
        this.Artist = artist;
        a = new HashSet<String>();
    }
    public String getTitle()
    {
        return Title;
    }
    public String getArtist()
    {
        return Artist;
    }

    public int howMany(ArrayList<String> Name)
    {
        for (int i = 0; i < Name.size(); i++)
        {
            Name.set(i, Name.get(i).toLowerCase());
        }
        int previousSize = a.size();
        a.addAll(Name);
        return (a.size() - previousSize);
    }
}