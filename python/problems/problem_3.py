#!/usr/bin/python
"""
    Problem 3:

    Texting is the most common form of communication,
    but it used to suck. Before mobile OSs had touch
    keyboards, we had to use the number keys to type.
    Each number had some characters associated with them,
    with the following mapping:

    1 -> .,!?1
    2 -> abc2
    3 -> def3
    4 -> ghi4
    5 -> jkl5
    6 -> mno6
    7 -> pqrs7
    8 -> tuv8
    9 -> wxyz9
    0 -> 0
    * -> space

    To type lol, the user would have to type 5 3 times in
    a row, pause, type 6 3 times in a row, pause, then
    type 5 times in a row.

    Create a function that turns a passed string into
    the keys that would need to be pressed

    pauses should be displayed as underscores

    If you wanted to enter a number, you would have to pass
    each letter for the key (4 presses of the number 2
    to get the number 2 to print)

    Video: https://www.youtube.com/watch?v=3lTIQT0X-3A
"""


def phone_text_conversion(text):
    """
        Input: string
        Output: string

        Examples:
            lol -> 555_666_555
            k -> 55
            l8r -> 555_8888_777
            no way! - 66_666_*_9_2_999_111
    """

    key_presses = ''

    return key_presses
