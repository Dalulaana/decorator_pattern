public class Chocolate extends PresentDecorator
{
    @Override
    public double cost()
    {
        return super.cost() + 1000.0;
    }

    public Chocolate(iFlowers iflowers)
    {
        super(iflowers);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "chocolate";
    }
}
