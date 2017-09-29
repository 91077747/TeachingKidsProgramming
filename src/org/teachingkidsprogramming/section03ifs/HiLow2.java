package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

//this variation tells user how many guesses they have left 
public class HiLow2
{
  public static void main(String[] args)
  {
    int answer = (int) (Math.random() * 100 + 1);
    //System.out.println("The answer is" + answer);
    //int answer = 40;
    int lives = 8;
    for (int i = 1; i <= lives; i++)
    {
      int guess = MessageBox.askForNumericalInput("what is your guess?");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("you Won!!!");
        break;
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("too High");
        MessageBox.showMessage("You have" + (lives - i) + " guesses left");
      }
      else
        MessageBox.showMessage("too Low");
      MessageBox.showMessage("You have" + (lives - i) + " guesses left");
      if (i == lives)
      {
        MessageBox.showMessage("You lost");
      }
    }
  }
}
