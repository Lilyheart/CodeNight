/*
*    Problem 3:
*
*    Texting is the most common form of communication,
*    but it used to suck. Before mobile OSs had touch
*    keyboards, we had to use the number keys to type.
*    Each number had some characters associated with them,
*    with the following mapping:
*
*    1 -> .,!?1
*    2 -> abc2
*    3 -> def3
*    4 -> ghi4
*    5 -> jkl5
*    6 -> mno6
*    7 -> pqrs7
*    8 -> tuv8
*    9 -> wxyz9
*    0 -> 0
*    * -> space
*
*    To type lol, the user would have to type 5 3 times in
*    a row, pause, type 6 3 times in a row, pause, then
*    type 5 times in a row.
*
*    Create a function that turns a passed string into
*    the keys that would need to be pressed
*
*    pauses should be displayed as underscores
*
*    If you wanted to enter a number, you would have to pass
*    each letter for the key (4 presses of the number 2
*    to get the number 2 to print)
*
*    Video: https://www.youtube.com/watch?v=3lTIQT0X-3A
*/

class Problem3 {

  String phone_text_conversion(String text_message) {
    /*
    *    Input: string
    *    Output: string
    *
    *    Examples:
    *        lol -> 555_666_555
    *        k -> 55
    *        l8r -> 555_8888_777
    *        no way! - 66_666_*_9_2_999_111
    */

    String key_presses = "";

    // Determine Key Presses Here

    return key_presses;

  }

}

class TestProblem3 {

  public static void main(String[] args) {
    Problem3 problem = new Problem3();

    System.out.printf("Problem3 Tests:\n\n");

    String key_presses = problem.phone_text_conversion("");
    if (key_presses == "") {
      System.out.println("testEmptyInput: Success");
    } else {
      System.out.println("testEmptyInput: Failure");
      System.out.printf("'%s' != ''\n", key_presses);
    }
    System.out.println("");

    key_presses = problem.phone_text_conversion("omg");
    if (key_presses == "666_6_4") {
      System.out.println("testInput1: Success");
    } else {
      System.out.println("testInput1: Failure");
      System.out.printf("'%s' != '666_6_4'\n", key_presses);
    }
    System.out.println("");

    key_presses = problem.phone_text_conversion("inbd");
    if (key_presses == "444_66_22_3") {
      System.out.println("testInput2: Success");
    } else {
      System.out.println("testInput2: Failure");
      System.out.printf("'%s' != '444_66_22_3'\n", key_presses);
    }
    System.out.println("");

    key_presses = problem.phone_text_conversion("idkmybffjill");
    if (key_presses == "444_3_55_6_999_22_333_333_5_444_555_555") {
      System.out.println("testInput3: Success");
    } else {
      System.out.println("testInput3: Failure");
      System.out.printf("'%s' != '444_3_55_6_999_22_333_333_5_444_555_555'\n", key_presses);
    }
    System.out.println("");

    key_presses = problem.phone_text_conversion("tisnf");
    if (key_presses == "666_6_4") {
      System.out.println("testInput4: Success");
    } else {
      System.out.println("testInput4: Failure");
      System.out.printf("'%s' != '666_6_4'\n", key_presses);
    }
    System.out.println("");

    key_presses = problem.phone_text_conversion("n00b");
    if (key_presses == "66_0_0_22") {
      System.out.println("testInput4: Success");
    } else {
      System.out.println("testInput4: Failure");
      System.out.printf("'%s' != '66_0_0_22'\n", key_presses);
    }
    System.out.println("");

    key_presses = problem.phone_text_conversion("hello world!");
    if (key_presses == "44_33_555_555_666_*_9_666_777_555_3_111") {
      System.out.println("testInput4: Success");
    } else {
      System.out.println("testInput4: Failure");
      System.out.printf("'%s' != '44_33_555_555_666_*_9_666_777_555_3_111'\n", key_presses);
    }
    System.out.println("");

  }

}
