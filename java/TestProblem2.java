import java.util.HashMap;

/*
*    Problem 2:
*
*    Sean Bean doesn't always die...
*
*    (But he usually does: https://www.youtube.com/watch?v=zEhtsgu6bJg)
*    (Seriously... http://geektyrant.com/news/infographic-the-many-deaths-of-sean-bean)
*
*    Return an array of movie titles in which Sean bean does
*    and does not die, sorted from the year that they came out
*/

class Problem2 {

  HashMap<String, String[]> sean_bean_survival_and_deaths() {
    /*
    *    Input: None
    *    Output: HashMap with survival and death sorted Arrays of movie titles
    */

    HashMap<String, HashMap<String,String>> sean_bean_movies = new HashMap<String,HashMap<String,String>>();
    HashMap<String,String> movie1 = new HashMap<String,String>();
    movie1.put("movie", "'The Load of the Rings: Fellowship of the Ring");
    movie1.put("year", "2001");
    movie1.put("dies", "true");
    HashMap<String,String> movie2 = new HashMap<String,String>();
    movie2.put("movie", "'Patriot Games");
    movie2.put("year", "1992");
    movie2.put("dies", "true");
    HashMap<String,String> movie3 = new HashMap<String,String>();
    movie3.put("movie", "'Golden Eye");
    movie3.put("year", "1995");
    movie3.put("dies", "true");
    HashMap<String,String> movie4 = new HashMap<String,String>();
    movie4.put("movie", "'Silent Hill");
    movie4.put("year", "2006");
    movie4.put("dies", "false");
    HashMap<String,String> movie5 = new HashMap<String,String>();
    movie5.put("movie", "'National Treasure");
    movie5.put("year", "2004");
    movie5.put("dies", "false");
    HashMap<String,String> movie6 = new HashMap<String,String>();
    movie6.put("movie", "The Martian");
    movie6.put("year", "2015");
    movie6.put("dies", "false");
    sean_bean_movies.put("Movie1", movie1);
    sean_bean_movies.put("Movie2", movie2);
    sean_bean_movies.put("Movie3", movie3);
    sean_bean_movies.put("Movie4", movie4);
    sean_bean_movies.put("Movie5", movie5);
    sean_bean_movies.put("Movie6", movie6);

    // Walkenize Quote Here

    HashMap<String, String[]> seanbean_movie_breakdown = new HashMap<String, String[]>();

    return seanbean_movie_breakdown;

  }

}

class TestProblem2 {

  public static void main(String[] args) {
    Problem2 problem = new Problem2();

    System.out.printf("Problem2 Tests:\n\n");

    HashMap<String, String[]> sean_bean_survival_and_deaths =
      problem.sean_bean_survival_and_deaths();

    String[] survivial_movies =
      sean_bean_survival_and_deaths.get("survival");

    String[] expected_survivial_movies = {
      "National Treasure",
      "Silent Hill",
      "The Martian",
    };

    if (survivial_movies == expected_survivial_movies) {
      System.out.println("testSurvivalMovies: Success");
    } else {
      System.out.println("testSurvivalMovies: Failure");
      System.out.printf("'%s' != '%s'\n", survivial_movies, expected_survivial_movies);
    }
    System.out.println("");

    String[] death_movies =
      sean_bean_survival_and_deaths.get("death");

    String[] expected_death_movies = {
      "Patriot Games",
      "Golden Eye",
      "The Load of the Rings: Fellowship of the Ring",
    };

    if (death_movies == expected_death_movies) {
      System.out.println("testDeathMovies: Success");
    } else {
      System.out.println("testDeathMovies: Failure");
      System.out.printf("'%s' != '%s'\n", death_movies, expected_death_movies);
    }
    System.out.println("");

  }

}
