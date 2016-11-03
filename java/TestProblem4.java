/*
*    Problem 4:
*
*    Timezones are important to consider when developing
*    any application.
*
*    Write a function to take a passed in datetime string
*    from Eastern Time (ET), and return a datetime string
*    with the correct time for Pacific Time (PT)
*
*    Eastern Time is 3 hours ahead of Pacific Time
*
*    Format should be year-month-date hours:minutes:seconds
*    (YYYY-MM-DD HH:MM:SS)
*
*    If an invalid form is passed, return an empty string
*/

class Problem4 {

  String timezone_conversion(String et_datetime) {
    /*
    *    Input: string (YYYY-MM-DD HH:MM:SS)
    *    Output: string (YYYY-MM-DD HH:MM:SS)
    *
    *    Examples:
    *        2016-10-31 01:00:00 -> 2016-10-30 22:00:00
    */

    String pt_datetime = et_datetime;

    // Timezone Conversion Here

    return pt_datetime;

  }

}

class TestProblem4 {

  public static void main(String[] args) {
    Problem4 problem = new Problem4();

    System.out.printf("Problem4 Tests:\n\n");

    String pt_datetime = problem.timezone_conversion("");
    if (pt_datetime == "") {
      System.out.println("testNotADatetime1: Success");
    } else {
      System.out.println("testNotADatetime1: Failure");
      System.out.printf("'%s' != ''\n", pt_datetime);
    }
    System.out.println("");

    pt_datetime = problem.timezone_conversion("2016-10-31");
    if (pt_datetime == "") {
      System.out.println("testNotADatetime2: Success");
    } else {
      System.out.println("testNotADatetime2: Failure");
      System.out.printf("'%s' != ''\n", pt_datetime);
    }
    System.out.println("");

    pt_datetime = problem.timezone_conversion("01:00:00");
    if (pt_datetime == "") {
      System.out.println("testNotADatetime3: Success");
    } else {
      System.out.println("testNotADatetime3: Failure");
      System.out.printf("'%s' != ''\n", pt_datetime);
    }
    System.out.println("");

    pt_datetime = problem.timezone_conversion("2016-10-31 01:00:00");
    if (pt_datetime == "2016-10-30 22:00:00") {
      System.out.println("testConversion1: Success");
    } else {
      System.out.println("testConversion1: Failure");
      System.out.printf("'%s' != '2016-10-30 22:00:00'\n", pt_datetime);
    }
    System.out.println("");

    pt_datetime = problem.timezone_conversion("2016-10-31 03:00:00");
    if (pt_datetime == "2016-10-31 00:00:00") {
      System.out.println("testConversion2: Success");
    } else {
      System.out.println("testConversion2: Failure");
      System.out.printf("'%s' != '2016-10-31 00:00:00'\n", pt_datetime);
    }
    System.out.println("");

    pt_datetime = problem.timezone_conversion("2017-01-01 20:24:36");
    if (pt_datetime == "2017-01-01 23:24:36") {
      System.out.println("testConversion3: Success");
    } else {
      System.out.println("testConversion3: Failure");
      System.out.printf("'%s' != '2017-01-01 23:24:36'\n", pt_datetime);
    }
    System.out.println("");

  }

}
