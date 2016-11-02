#!/usr/bin/python
"""
    Unit Test for Problem 1
"""

import sys
import os
import unittest

CURRENT_PATH = os.path.dirname(os.path.realpath(__file__))
sys.path.insert(0, CURRENT_PATH + '/../')

from problems.problem_1 import walken_simulator


class TestProblem1(unittest.TestCase):

    def test_null_inputs(self):
        self.assertEqual(
            walken_simulator(""), "More Cowbell!")

    def test_string_less_five(self):
        self.assertEqual(
            walken_simulator("I drink your milkshake"),
            "I drink your milkshake.")

    def test_string_five(self):
        self.assertEqual(
            walken_simulator("Here's looking at you, kid"),
            "Here's looking at you, kid.")

    def test_string_more(self):

        self.assertEqual(
            walken_simulator("Frankly, my dear, I don't give a damn"),
            "Frankly, my dear, I don't. Give a damn.")
        self.assertEqual(
            walken_simulator("Roads? Where we're going we don't need roads"),
            "Roads? Where we're going we. Don't need roads.")
        self.assertEqual(
            walken_simulator("Don't mess with the bull young man. You'll get the horns"),
            "Don't mess with the bull. Young man. You'll get the. Horns.")


if __name__ == "__main__":
    unittest.main()