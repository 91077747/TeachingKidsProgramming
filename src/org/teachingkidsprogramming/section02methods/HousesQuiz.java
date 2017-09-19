package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizGrader;

public class HousesQuiz extends HousesQuizAdapter
{
  public void questions1Thru6()
  {
    // Question 1 
    //   small (recipe below) 
    small();
    //   Question2
    //   medium (recipe below) 
    medium();
    //
    //   Question3
    //   large (recipe below) 
    large();
    drawASide();
    //
    //   Question6
    //   drawASide (recipe below) 
    drawASide();
  }
  private void drawASide()
  {
    //   ------------- Recipe for drawASide 
    //      call moveTheLength and turnTheCorner
    moveTheLength();
    turnTheCorner();
    //   ------------- End of drawASide recipe
  }
  private void turnTheCorner()
  {
    //   ------------- Recipe for turnTheCorner 
    //      turn the Tortoise 1/3 of 360 degrees to the left
    Tortoise.turn(-120);
    //   ------------- End of turnTheCorner recipe
  }
  private void moveTheLength()
  {
    //   ------------- Recipe for moveTheLength 
    Tortoise.move(length);
    //      move the Tortoise the current length
    //   ------------- End of moveTheLength recipe
  }
  private void medium()
  {
    //   ------------- Recipe for medium 
    //      set the current length to 21
    length = 21;
    //   ------------- End of medium recipe
  }
  private void large()
  {
    //   ------------- Recipe for large 
    //      set the current length to 63
    length = 63;
  }
  private void small()
  {
    //   ------------- Recipe for small 
    length = 7;
  }
  public static void main(String[] args)
  {
    new HousesQuizGrader().grade(new HousesQuiz());
  }
}
