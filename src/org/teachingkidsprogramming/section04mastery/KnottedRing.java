package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class KnottedRing
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    createColorPalette();
    for (int i = 0; i < 30; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      drawOctagonWithOverlap();
      Tortoise.turn(360 / 30);
      Tortoise.turn(5);
    }
  }
  private static void drawOctagonWithOverlap()
  {
    for (int i = 0; i < 9; i++)
    {
      Tortoise.move(110);
      Tortoise.turn(360 / 8);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(PenColors.Reds.Red);
    ColorWheel.addColor(PenColors.Greens.DarkCyan);
  }
}
