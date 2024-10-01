package sprint1.Inlämningsuppgift1;

//Här använder jag arv och interface
public class PalmTree extends Plant implements ILiquidCalculation
{
    public PalmTree(String name, double height)
    {
        super(0.5,name,"kranvatten", height);
    }

    @Override //metoden från interface implementeras här
    public double liquidCalculation()
    {
        double liquid = getAmountOfLiquid();
        double height = getHeight();
        return liquid*height;
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
