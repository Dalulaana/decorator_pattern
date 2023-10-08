public class Letter extends PresentDecorator
{
    @Override
    public double cost()
    {
        return super.cost() + 200.0;
    }

    public Letter(iFlowers iflowers)
    {
        super(iflowers);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "letter";
    }
}
