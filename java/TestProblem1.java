/*
*    Problem 1:
*
*    Christopher Walken is known for putting his own spin
*    on how to read his lines. Specifically, he likes to
*    insert pauses, which would be denoted by a period.
*
*    Create a function that takes a string, and inserts a
*    period after each 5th word.
*
*    Since a period is being added after each 5th word, the
*    the following word should be capitalized, to add emphasis
*
*    All quotes should end with a period (If a period already
*    exists, skip to the next 5th word)
*
*    If nothing is passed, return 'More Cowbell!'
*
*    Great Example: https://vimeo.com/55624839
*/

class Problem1 {

  String walken_simulator(String quote) {
    /*
    *  Input: string
    *  Output: string
    *
    *  Examples:
    *
    *    "" -> "More Cowbell!"
    *
    *    "You're talking to me all wrong" ->
    *        "You're talking to me all. Wrong."
    */

    String walke_quote = "";
    int wordCount = 0;

    // Walkenize Quote Here
    if (quote.equals(""))
      return "More Cowbell!";

    String[] words = quote.split("\\s+");

    for (int i = 0; i < words.length - 1; i++) {
      wordCount++;
      if (wordCount >= 5) {
        walke_quote += words[i] + ". ";
        wordCount = 0;
      } else if (wordCount == 1) {
        walke_quote += capitalizeMe(words[i]) + " ";
      } else {
        walke_quote += words[i] + " ";
      }
    }

    if (wordCount == 0) {
      walke_quote += capitalizeMe(words[words.length - 1]) + ".";
    } else {
      walke_quote += words[words.length - 1] + ".";
    }

    return walke_quote;

  }

  String capitalizeMe(String string) {
    return Character.toUpperCase(string.charAt(0)) + string.substring(1);
  }

}



class TestProblem1 {

  public static void main(String[] args) {
    Problem1 problem = new Problem1();

    System.out.printf("Problem1 Tests:\n\n");

    String walken_quote = problem.walken_simulator("");
    if (walken_quote.equals("More Cowbell!")) {
      System.out.println("testNullInputs: Success");
    } else {
      System.out.println("testNullInputs: Failure");
      System.out.printf("'%s' != 'More Cowbell!'\n", walken_quote);
    }
    System.out.println("");

    walken_quote = problem.walken_simulator(
        "I drink your milkshake");
    if (walken_quote.equals("I drink your milkshake.")) {
      System.out.println("testStringLessFive: Success");
    } else {
      System.out.println("testStringLessFive: Failure");
      System.out.printf(
        "'%s' != 'I drink your milkshake.'\n", walken_quote);
    }
    System.out.println("");

    walken_quote = problem.walken_simulator(
        "Here's looking at you, kid");
    if (walken_quote.equals("Here's looking at you, kid.")) {
      System.out.println("testStringFive: Success");
    } else {
      System.out.println("testStringFive: Failure");
      System.out.printf(
        "'%s' != 'Here's looking at you, kid.'\n", walken_quote);
    }
    System.out.println("");

    walken_quote = problem.walken_simulator(
        "Frankly, my dear, I don't give a damn");
    if (walken_quote.equals("Frankly, my dear, I don't. Give a damn.")) {
      System.out.println("testStringMore1: Success");
    } else {
      System.out.println("testStringMore1: Failure");
      System.out.printf(
        "'%s' != 'Frankly, my dear, I don't. Give a damn.'\n", walken_quote);
    }
    System.out.println("");

    walken_quote = problem.walken_simulator(
        "Roads? Where we're going we don't need roads");
    if (walken_quote.equals("Roads? Where we're going we. Don't need roads.")) {
      System.out.println("testStringMore2: Success");
    } else {
      System.out.println("testStringMore2: Failure");
      System.out.printf(
        "'%s' != 'Roads? Where we're going we. Don't need roads.'\n", walken_quote);
    }
    System.out.println("");

    walken_quote = problem.walken_simulator(
        "Don't mess with the bull young man. You'll get the horns");
    if (walken_quote.equals("Don't mess with the bull. Young man. You'll get the. Horns.")) {
      System.out.println("testStringMore3: Success");
    } else {
      System.out.println("testStringMore3: Failure");
      System.out.printf(
        "'%s' != 'Don't mess with the bull. Young man. You'll get the. Horns.'\n", walken_quote);
    }
    System.out.println("");

  }

}
