#!/usr/bin/python
"""
    Unit Test for Problem 3
"""

import sys
import os
import unittest

CURRENT_PATH = os.path.dirname(os.path.realpath(__file__))
sys.path.insert(0, CURRENT_PATH + '/../')

from problems.problem_3 import phone_text_conversion


class TestProblem3(unittest.TestCase):

    def test_nothing(self):
        self.assertEqual(
            phone_text_conversion(''), '')

    def test_omg(self):
        self.assertEqual(
            phone_text_conversion('omg'), '666_6_4')

    def test_inbd(self):
        self.assertEqual(
            phone_text_conversion('inbd'), '444_66_22_3')

    def test_idkmybffjill(self):
        self.assertEqual(
            phone_text_conversion('idkmybffjill'),
            '444_3_55_6_999_22_333_333_5_444_555_555')

    def test_tisnf(self):
        self.assertEqual(
            phone_text_conversion('tisnf'), '666_6_4')

    def test_n00b(self):
        self.assertEqual(
            phone_text_conversion('n00b'), '66_0_0_22')

    def test_hello_world(self):
        self.assertEqual(
            phone_text_conversion('hello world!'),
            '44_33_555_555_666_*_9_666_777_555_3_111')


if __name__ == "__main__":
    unittest.main()
