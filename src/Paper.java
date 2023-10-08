public class Paper extends WrapperDecorator
{
    @Override
    public double cost()
    {
        return super.cost() + 1000.0;
    }

    public Paper(iFlowers iflowers)
    {
        super(iflowers);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "paper, ";
    }

}
