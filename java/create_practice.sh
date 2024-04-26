#!/bin/bash

# Check if problem name is provided
if [ -z "$1" ]
then 
    echo "Problem name is not provided. Usage: ./create_practice.sh ProblemName" 
    exit 1
fi

##### create a new solution

# create a solution folder for the problem
PROBLEM_NAME="$1"

echo "Creating solution folder for $PROBLEM_NAME..."
DIRECTORY="./first-leetcode-algorithm/src/main/java/leetcode/algorithm/$PROBLEM_NAME/"
if [ ! -d "$DIRECTORY" ]; then
    mkdir -p $DIRECTORY
fi
echo "solution folder created successfully"

FIRST_LETTER=$(echo ${PROBLEM_NAME:0:1}| tr '[:upper:]' '[:lower:]')
REST_OF_NAME=${PROBLEM_NAME:1}

# create a solution java class
echo "Creating solution java class..."
# the basic template for the solution
echo "package leetcode.algorithm.$PROBLEM_NAME;

public class Solution {
    public String $FIRST_LETTER$REST_OF_NAME(){

    }
}" > $DIRECTORY/Solution.java

echo "solution class created successfully"

# create a test folder for the problem
echo "Creating test folder for $PROBLEM_NAME..."
DIRECTORY="./first-leetcode-algorithm/src/test/java/leetcode/algorithm/$PROBLEM_NAME/"
if [ ! -d "$DIRECTORY" ]; then
    mkdir -p $DIRECTORY
fi
echo "test folder created successfully"

# create a test file for the problem
echo "Creating test java class..."
# the basic template for the test
echo "package leetcode.algorithm.$PROBLEM_NAME;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private Solution solution= new Solution();

    @Test
    public void testAlgorithm(){
        assertEquals();
    }
}" > $DIRECTORY/SolutionTest.java

echo "test class created successfully"
