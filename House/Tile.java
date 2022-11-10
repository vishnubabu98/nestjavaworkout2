package House;
public class Tile
{
    float tile_lenght;
    Tile(float tile_lenght)
    {
        this.tile_lenght = tile_lenght;
    }
    public static void main(String[] args) {

        Tile t1 = new Tile(3);

        Floor f1 = new Floor(7,6);

        int result = f1.totalTiles(t1);

        System.out.println("Number of tile needed :"+result);
    }

}