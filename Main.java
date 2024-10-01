package sprint1.Inlämningsuppgift1;

import javax.swing.*;

enum PlantsOnGreenest
{
    IGGE,
    LAURA,
    MEATLOAF,
    OLOF
}

public class Main
{
    public Main()
    {
        Plant igge = new Cactus("Igge");
        PalmTree laura = new PalmTree("Laura", 5.0);
        CarnivorousPlant meatloaf = new CarnivorousPlant(0.7, "Meatloaf");
        PalmTree olof = new PalmTree("Olof", 1.0);

        String wrongInputMessage = "Den växten bor inte på hotellet.";
        PlantsOnGreenest plant;
        String input;

        while (true)
        {
             input = JOptionPane.showInputDialog("Vilken växt ska få vätska? ");
            if (input == null)
            {
                break;
            }

            try
            {
                plant = PlantsOnGreenest.valueOf(input.toUpperCase().trim());
                switch (plant)
                {
                    case IGGE -> JOptionPane.showMessageDialog(null, igge);
                    case LAURA -> JOptionPane.showMessageDialog(null, laura);
                    case MEATLOAF -> JOptionPane.showMessageDialog(null, meatloaf);
                    case OLOF -> JOptionPane.showMessageDialog(null, olof);
                }
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, wrongInputMessage);
            }
        }
    }

    public static void main(String[] args)
    {
        Main greenest = new Main();
    }
}
