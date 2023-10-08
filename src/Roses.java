public class Roses extends Flowers
{

    @Override
    public double cost()
    {
        return super.cost() + 6000.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "roses, ";
    }
}
