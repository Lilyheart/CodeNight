#!/usr/bin/python
"""
    Problem 2:

    Sean Bean doesn't always die...

    (But he usually does: https://www.youtube.com/watch?v=zEhtsgu6bJg)
    (Seriously... http://geektyrant.com/news/infographic-the-many-deaths-of-sean-bean)

    Return a list of movie titles in which Sean bean does
    and does not die, sorted from the year that they came out
"""


def sean_bean_survival_and_deaths():
    """
        Input: None
        Output: list, list
    """

    sean_bean_movies = [
        {
            'movie': 'The Load of the Rings: Fellowship of the Ring',
            'year': 2001,
            'dies': True
        },{
            'movie': 'Patriot Games',
            'year': 1992,
            'dies': True
        },{
            'movie': 'Golden Eye',
            'year': 1995,
            'dies': True
        },{
            'movie': 'Silent Hill',
            'year': 2006,
            'dies': False
        },{
            'movie': 'National Treasure',
            'year': 2004,
            'dies': False
        },{
            'movie': 'The Martian',
            'year': 2015,
            'dies': False
        }
    ]

    survival_movies = []
    death_movies = []

    return survival_movies, death_movies
