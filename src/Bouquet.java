
public class Bouquet
{
    public static void main(String[] args)
    {
        iFlowers iflowers = new Chocolate(new Box(new Eustoma()));
        System.out.println(iflowers.getDescription());
        System.out.println(iflowers.cost());

    }
}