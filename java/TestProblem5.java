/*
*    Problem 5:
*
*    There is always money in the banana stand
*
*    NO TOUCHING (https://www.youtube.com/watch?v=UuHILqDIvis)
*
*    When you have problems with money, you should always look
*    in the banana stand, but we have to find it first
*
*    Create a function that takes in a string and returns anything
*    that is between the words banana and stand.
*
*    If there is no banana and/or stand, return an string: 'No Money!'
*/

class Problem5 {

  String get_whats_in_banana_stand(String full_text) {
    /*
    *    Input: string
    *    Output: string
    *
    *    Examples:
    *        'banana money stand' -> ' money '
    *        'I like bananas, where do you stand on the issue?' ->
    *            's, where do you '
    *        'banana only' -> ''
    *        'stand only' -> ''
    */

    String text_in_banana_stand = full_text;

    // Get text between banana and stand

    return text_in_banana_stand;

  }

}

class TestProblem5 {

  public static void main(String[] args) {
    Problem5 problem = new Problem5();

    System.out.printf("Problem5 Tests:\n\n");

    String whats_in_banana_stand = problem.get_whats_in_banana_stand("stand only");
    if (whats_in_banana_stand == "No Money!") {
      System.out.println("testNoBanana: Success");
    } else {
      System.out.println("testNoBanana: Failure");
      System.out.printf("'%s' != 'No Money!'\n", whats_in_banana_stand);
    }
    System.out.println("");

    whats_in_banana_stand = problem.get_whats_in_banana_stand("banana only");
    if (whats_in_banana_stand == "No Money!") {
      System.out.println("testNoStand: Success");
    } else {
      System.out.println("testNoStand: Failure");
      System.out.printf("'%s' != 'No Money!'\n", whats_in_banana_stand);
    }
    System.out.println("");

    whats_in_banana_stand = problem.get_whats_in_banana_stand("I like bananas, where do you stand on the issue?");
    if (whats_in_banana_stand == "s, where do you ") {
      System.out.println("testInside1: Success");
    } else {
      System.out.println("testInside1: Failure");
      System.out.printf("'%s' != 's, where do you '\n", whats_in_banana_stand);
    }
    System.out.println("");

    whats_in_banana_stand = problem.get_whats_in_banana_stand("banana money stand");
    if (whats_in_banana_stand == " money ") {
      System.out.println("testInside2: Success");
    } else {
      System.out.println("testInside2: Failure");
      System.out.printf("'%s' != ' money '\n", whats_in_banana_stand);
    }
    System.out.println("");

  }

}
