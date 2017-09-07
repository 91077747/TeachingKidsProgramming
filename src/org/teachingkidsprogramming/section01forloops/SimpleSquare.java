package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("Victoria");
    Tortoise.show();
    Tortoise.setSpeed(10);
    int sides = 80;
    for (int i = 0; i < 200; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(50 + i);
      Tortoise.turn(2000 / sides);
    }
    //
    //(Optional): Sign your work using the Virtual Proctor
    // See your work at http://virtual
  }
}
