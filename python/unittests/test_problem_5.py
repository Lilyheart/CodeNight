#!/usr/bin/python
"""
    Unit Test for Problem 5
"""

import sys
import os
import unittest

CURRENT_PATH = os.path.dirname(os.path.realpath(__file__))
sys.path.insert(0, CURRENT_PATH + '/../')

from problems.problem_5 import get_whats_in_banana_stand


class TestProblem5(unittest.TestCase):

    def test_no_banana(self):
        self.assertEqual(
            get_whats_in_banana_stand('stand only'),
            'No Money!')

    def test_no_stand(self):
        self.assertEqual(
            get_whats_in_banana_stand('banana only'),
            'No Money!')

    def test_inside(self):
        self.assertEqual(
            get_whats_in_banana_stand('I like bananas, where do you stand on the issue?'),
            's, where do you ')
        self.assertEqual(
            get_whats_in_banana_stand('banana money stand'),
            ' money ')


if __name__ == "__main__":
    unittest.main()
