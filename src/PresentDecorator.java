public class PresentDecorator implements iFlowers
{
    iFlowers iflowers;

    public PresentDecorator(iFlowers iflowers) {
        this.iflowers = iflowers;
    }

    public double cost() {
        return iflowers.cost();
    }

    public String addPresent() {
        return "present: ";
    }

    @Override
    public String getDescription() {
        return iflowers.getDescription() + addPresent();
    }
}
