package sprint1.Inlämningsuppgift1;

public abstract class Plant
{
    //Här har jag använt inkapsling
    private double amountOfLiquid;
    private String name;
    private String kindOfLiquid;
    private double height;

    public Plant(double amountOfLiquid, String name, String kindOfLiquid, double height)
    {
        this.amountOfLiquid = amountOfLiquid;
        this.name = name;
        this.kindOfLiquid = kindOfLiquid;
        this.height = height;
    }

    public Plant(double amountOfLiquid, String name, String kindOfLiquid)
    {
        this.amountOfLiquid = amountOfLiquid;
        this.name = name;
        this.kindOfLiquid = kindOfLiquid;
    }

    public double getAmountOfLiquid()
    {
        return amountOfLiquid;
    }

    public double getHeight()
    {
        return height;
    }

    public String getName()
    {
        return name;
    }

    public String getKindOfLiquid()
    {
        return kindOfLiquid;
    }

    @Override
    public String toString()
    {
        return name +
                " behöver " + amountOfLiquid +
                " liter " + kindOfLiquid +
                " per dag.";
    }
}
