#!/usr/bin/python
"""
    Problem 4:

    Timezones are important to consider when developing
    any application.

    Write a function to take a passed in datetime string
    from Eastern Time (ET), and return a datetime string
    with the correct time for Pacific Time (PT)

    Eastern Time is 3 hours ahead of Pacific Time

    Format should be year-month-date hours:minutes:seconds
    (YYYY-MM-DD HH:MM:SS)

    If an invalid form is passed, return an empty string
"""

# Imports Here


def timezone_conversion(et_datetime):
    """
        Input: string (YYYY-MM-DD HH:MM:SS)
        Output: string (YYYY-MM-DD HH:MM:SS)

        Examples:
            2016-10-31 01:00:00 -> 2016-10-30 22:00:00
    """

    pt_datetime = et_datetime

    # Timezone Conversion Here

    return pt_datetime
