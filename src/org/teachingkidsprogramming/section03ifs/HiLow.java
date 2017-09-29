package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    int answer = (int) (Math.random() * 100 + 1);
    //System.out.println("The answer is" + answer);
    //int answer = 40;
    for (int i = 1; i <= 8; i++)
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
      }
      else
        MessageBox.showMessage("too Low");
      if (i == 8)
      {
        MessageBox.showMessage("You lost");
      }
    }
  }
}
