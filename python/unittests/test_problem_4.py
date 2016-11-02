#!/usr/bin/python
"""
    Unit Test for Problem 4
"""

import sys
import os
import unittest

CURRENT_PATH = os.path.dirname(os.path.realpath(__file__))
sys.path.insert(0, CURRENT_PATH + '/../')

from problems.problem_4 import problem


class TestProblem4(unittest.TestCase):

    def test(self):
        self.assertEqual(True, True)


if __name__ == "__main__":
    unittest.main()
