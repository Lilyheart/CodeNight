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

function SeanBeanSurvivalAndDeaths() {
    /*
    *    Input: None
    *    Output: Object with survival and death Arrays
    */

    var seanBeanMovies = [
        {
            'movie': 'The Load of the Rings: Fellowship of the Ring',
            'year': 2001,
            'dies': true
        },{
            'movie': 'Patriot Games',
            'year': 1992,
            'dies': true
        },{
            'movie': 'Golden Eye',
            'year': 1995,
            'dies': true
        },{
            'movie': 'Silent Hill',
            'year': 2006,
            'dies': false
        },{
            'movie': 'National Treasure',
            'year': 2004,
            'dies': false
        },{
            'movie': 'The Martian',
            'year': 2015,
            'dies': false
        }
    ];

    var seanBeanMovieBreakdown = {
        survival: [],
        death: []
    }

    // Populate Object Here

    return seanBeanMovieBreakdown
}