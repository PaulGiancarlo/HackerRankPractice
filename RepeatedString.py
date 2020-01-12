
import math
import os
import random
import re
import sys

def repeatedString(s, n):
    a_cnt = s.count('a')
    num = n//len(s)
    mod = n%len(s)
    count = a_cnt*num + s[:mod].count('a')
    print(count)
    return count 

if __name__ == '__main__':
        
        s = 'a'

        n = 1000000000000

        result = repeatedString(s, n)
        print(result)
