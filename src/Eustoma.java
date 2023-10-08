public class Eustoma extends Flowers
{

    @Override
    public double cost()
    {
        return super.cost() + 8000.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "eustoma, ";
    }
}
