package example.card_view_demo;

/**
 * Created by tzia on 12-Jan-17.
 */

public class CardModel
{

    String levelName;
    String levelDescription;
    boolean turned, locked;


    public CardModel()
    {
    }

    public CardModel( String levelName, String levelDescription, boolean turned, boolean locked )
    {
        this.levelName = levelName;
        this.levelDescription = levelDescription;
        this.turned = turned;
        this.locked = locked;
    }

    public String getLevelName()
    {
        return levelName;
    }

    public void setLevelName( String levelName )
    {
        this.levelName = levelName;
    }

    public String getLevelDescription()
    {
        return levelDescription;
    }

    public void setLevelDescription( String levelDescription )
    {
        this.levelDescription = levelDescription;
    }

    public boolean isTurned()
    {
        return turned;
    }

    public void setTurned( boolean turned )
    {
        this.turned = turned;
    }

    public boolean isLocked()
    {
        return locked;
    }

    public void setLocked( boolean locked )
    {
        this.locked = locked;
    }


}
