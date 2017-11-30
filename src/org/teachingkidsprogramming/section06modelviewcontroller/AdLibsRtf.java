package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.MVCUtils.Parser;
import org.teachingextensions.logo.utils.MVCUtils.Viewer;

public class AdLibsRtf
{
  public static class Words
  {
    public String adverb;
    public String edverb;
    public String bodyPart;
  }
  public static void main(String[] args)
  {
    //  Create a new 'word' container your story's words (uncomment line 10) --#1.1
    Words word = new Words();
    //  Ask the user to enter an adverb, save it as currentAdverb --#2
    String currentAdverb = MessageBox.askForTextInput("enter an adverb");
    //  Ask the user to enter a verb ending in '-ed', save it as currentEdVerb --#3
    String currentEdVerb = MessageBox.askForTextInput("please Enter a verb with a 'ed' at the end ");
    //  Ask the user to enter a body part, save it as currentBodyPart --#4
    //  Connect the words in the currentStory to an RTF file parser (use the Parser object)  --#1.2
    Parser.parseRtfFile("view.rtf", word);
    //  Display the currentStory in an RTF file (use the Viewer object) --#1.3
    Viewer.displayRtfFile("VICTORIA");
  }
}