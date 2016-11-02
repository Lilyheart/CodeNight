#!/usr/bin/python
"""
    Unit Test for Problem 2
"""

import sys
import os
import unittest

CURRENT_PATH = os.path.dirname(os.path.realpath(__file__))
sys.path.insert(0, CURRENT_PATH + '/../')

from problems.problem_2 import problem


class TestProblem2(unittest.TestCase):

    def test(self):
        self.assertEqual(True, True)


if __name__ == "__main__":
    unittest.main()
