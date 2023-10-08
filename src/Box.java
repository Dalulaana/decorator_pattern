public class Box extends WrapperDecorator {
    @Override
    public double cost()
    {
        return super.cost() + 2000.0;
    }

    public Box(iFlowers iflowers)
    {
        super(iflowers);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "box, ";
    }
}
