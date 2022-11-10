package House;
import java.math.*;
public class Floor
{
    float l,w;
    Floor(float l, float w)
    {
        this.l = l;
        this.w = w;
    }
    int totalTiles(Tile t)
    {

        float areaOfFloor = this.l* this.w;
        float areaOfTile = t.tile_lenght * t.tile_lenght;
        int no_oftiles = (int) Math.ceil(areaOfFloor/areaOfTile);
        return no_oftiles;
    }
}
