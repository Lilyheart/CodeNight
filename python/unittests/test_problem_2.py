#!/usr/bin/python
"""
    Unit Test for Problem 2
"""

import sys
import os
import unittest

CURRENT_PATH = os.path.dirname(os.path.realpath(__file__))
sys.path.insert(0, CURRENT_PATH + '/../')

from problems.problem_2 import sean_bean_survival_and_deaths


class TestProblem2(unittest.TestCase):

    def test_survival(self):

        returned_survival_movies, returned_death_movies =\
            sean_bean_survival_and_deaths()

        expected_survivial_movies = [
            'National Treasure',
            'Silent Hill',
            'The Martian',
        ]

        self.assertEqual(returned_survival_movies,
            expected_survivial_movies)

    def test_death(self):

        returned_survival_movies, returned_death_movies =\
            sean_bean_survival_and_deaths()

        expected_death_movies = [
            'Patriot Games',
            'Golden Eye',
            'The Load of the Rings: Fellowship of the Ring',
        ]

        self.assertEqual(returned_death_movies,
            expected_death_movies)


if __name__ == "__main__":
    unittest.main()
