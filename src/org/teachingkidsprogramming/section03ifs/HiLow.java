package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
    //    Do the following 8 times --#9
    for (int i = 1; i <= 8; i++)
    {
    }
    int guess = MessageBox.askForNumericalInput("what is your guess?");
    //         If the guess is correct --#4
    if (guess == 40)
    {
      Sound.playBeep();
      MessageBox.showMessage("you Won!!!");
    }
    //               and exit --#10
    //         Otherwise, if the guess is too high --#6
    else if (guess > 40)
    {
      MessageBox.showMessage("too High");
    }
    else
    {
      MessageBox.showMessage("too Low");
    }
    //    End Repeat --#9.2
  }
  //    After 8 incorrect guesses tell the user they've lost --#11
}
