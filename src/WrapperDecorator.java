public abstract class WrapperDecorator implements iFlowers
{
    iFlowers iflowers;

    public WrapperDecorator(iFlowers iflowers) {
        this.iflowers = iflowers;
    }

    public double cost() {
        return iflowers.cost();
    }

    public String addWrapper() {
        return "wrapper: ";
    }

    @Override
    public String getDescription() {
        return iflowers.getDescription() + addWrapper();
    }
}
