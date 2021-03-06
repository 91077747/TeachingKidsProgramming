package org.teachingkidsprogramming.section04mastery;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class DigiFlower
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(4);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Silver);
    Tortoise.setPenWidth(3);
    for (int i = 0; i < 15; i++)
    {
      createColorPalette();
      drawOctogon();
      Tortoise.turn(360 / 15);
      //        End Repeat --#14.2
    }
  }
  private static void drawOctogon()
  {
    for (int i = 0; i < 8; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(50);
      Tortoise.turn(360 / 8);
    }
  }
  private static void createColorPalette()
  {
    Color color1 = PenColors.Whites.AliceBlue;
    Color color2 = PenColors.Pinks.LightPink;
    Color color3 = PenColors.Greens.DarkCyan;
    Color color4 = PenColors.Whites.AliceBlue;
    ColorWheel.addColor(color1);
    ColorWheel.addColor(color2);
    ColorWheel.addColor(color3);
    ColorWheel.addColor(color4);
    ColorWheel.addColor(color4);
    ColorWheel.addColor(color3);
    ColorWheel.addColor(color2);
    ColorWheel.addColor(color1);
  }
}
