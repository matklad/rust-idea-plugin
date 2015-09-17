#!/usr/bin/env python3.5

import sys
import os

template = "public fun test{}(): Unit = doTest()"


def to_title_case(s):
    return ''.join(x.title() for x in s.split('_'))


for entry in os.scandir(sys.argv[1] if len(sys.argv) > 1 else '.'):
    if entry.name.endswith('.rs'):
        print(template.format(to_title_case(entry.name.rstrip('.rs'))))
