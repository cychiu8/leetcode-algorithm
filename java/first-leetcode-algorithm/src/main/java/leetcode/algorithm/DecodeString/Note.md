# 394. DecodeString

- use two stacks
    1. keep track of the number of times a string needs to be repeated
    2. store the intermediate results
- check point
    - digit: update count
    - '[': -> means new start of next count & substring
        - push previoust count to count stack
        - reset count to zero
        - push substring into stack (intermidiate substring)
    - ']': -> means a substring can be decoded
        - pop the count
        - pop the intermediate substring
        - add the substring to intermediate substring for 'count' times

    - other: add to current substring

- ref: https://leetcode.com/problems/decode-string/solutions/4717135/100-step-by-step-explaination-with-pictures-optimized-stack-approach