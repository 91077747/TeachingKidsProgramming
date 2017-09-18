package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Greens;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Houses2
{
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Victoria");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHouse(height);
    drawHouse(120);
    drawHouse(90);
    drawHouse(20);
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
  private static void drawHouse(int height)
  {
    Tortoise.setPenColor(Reds.Red);
    Tortoise.move(height);
    //DrawFlatRoof();
    // draw a pointy roof
    DrawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void DrawPointyRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(90);
    Tortoise.move(15);
    Tortoise.turn(45);
  }
  private static void DrawFlatRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
