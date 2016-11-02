#!/usr/bin/python
"""
    Unit Test for Problem 4
"""

import sys
import os
import unittest

CURRENT_PATH = os.path.dirname(os.path.realpath(__file__))
sys.path.insert(0, CURRENT_PATH + '/../')

from problems.problem_4 import timezone_conversion


class TestProblem4(unittest.TestCase):

    def test_not_a_datetime(self):
        self.assertEqual(timezone_conversion(''), '')
        self.assertEqual(
            timezone_conversion('2016-10-31'), '')
        self.assertEqual(
            timezone_conversion('01:00:00'), '')

    def test_conversions(self):
        self.assertEqual(
            timezone_conversion('2016-10-31 01:00:00'),
            '2016-10-30 22:00:00')
        self.assertEqual(
            timezone_conversion('2016-10-31 03:00:00'),
            '2016-10-31 00:00:00')
        self.assertEqual(
            timezone_conversion('2017-01-01 20:24:36'),
            '2017-01-01 23:24:36')


if __name__ == "__main__":
    unittest.main()
