package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Greens;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Purples;

public class Houses_pointy
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHouseFlatRoof(height);
    drawHousePointyRoof(70);
    drawHousetrapRoof(50);
    //drawHouse(200);
    //drawHouse(50);
    //drawHouse(90);
    //drawHouse(100);
  }
  private static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(Blues.Aquamarine);
    Tortoise.move(height);
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHousetrapRoof(int height)
  {
    Tortoise.setPenColor(Greens.Chartreuse);
    Tortoise.move(height);
    drawTrapRoof();
    Tortoise.move(50);
    Tortoise.turn(50);
    Tortoise.move(20);
    Tortoise.turn(40);
    Tortoise.move(10);
    Tortoise.turn(9);
    Tortoise.move(10);
    Tortoise.turn(40);
    Tortoise.move(20);
    Tortoise.turn(40);
    Tortoise.move(90);
  }
  private static void drawTrapRoof()
  {
  }
  private static void drawHouseFlatRoof(int height)
  {
    Tortoise.setPenColor(Purples.MediumSlateBlue);
    Tortoise.move(height);
    drawFlatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawPointyRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(90);
    Tortoise.move(15);
    Tortoise.turn(45);
  }
  private static void drawFlatRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
