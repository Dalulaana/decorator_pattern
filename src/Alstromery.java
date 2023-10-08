public class Alstromery extends Flowers {

    @Override
    public double cost()
    {
        return super.cost() + 7000.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "alstromery, ";
    }
}
