package sprint1.Inlämningsuppgift1;

//Här använder jag arv och interface
public class CarnivorousPlant extends Plant implements ILiquidCalculation
{
    private double baseAmountOfLiquid = 0.1;

    public CarnivorousPlant(double height, String name)
    {
        super(0.2,name,"proteindryck",height);
    }

    @Override //metoden från interface implementeras här
    public double liquidCalculation()
    {
        double liquid = getAmountOfLiquid();
        double height = getHeight();
        return baseAmountOfLiquid +(liquid*height);
    }
    @Override // här har jag använt mig av polymorfism
    public String toString()
    {
        return getName() +
                " behöver " + liquidCalculation() +
                " liter " + getKindOfLiquid() +
                " per dag.";
    }
}
