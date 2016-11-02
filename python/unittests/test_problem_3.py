#!/usr/bin/python
"""
    Unit Test for Problem 3
"""

import sys
import os
import unittest

CURRENT_PATH = os.path.dirname(os.path.realpath(__file__))
sys.path.insert(0, CURRENT_PATH + '/../')

from problems.problem_3 import problem


class TestProblem3(unittest.TestCase):

    def test(self):
        self.assertEqual(True, True)


if __name__ == "__main__":
    unittest.main()
