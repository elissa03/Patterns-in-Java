# Patterns in Java

## Overview
This project involves writing a program that prompts the user to input various values to display different patterns on the screen. The program continues to prompt until '0' is entered to quit.

## Input Values and Constraints
The program requires the user to enter the following values:
- **Pattern number**: An integer between 1 and 4, with 0 to exit the main loop.
- **Alpha-numeric first character (ch1)**.
- **Non alpha-numeric second character (ch2)**.
- **Size of pattern (size)**: A positive integer; considered as height in patterns 1 and 2, and width in patterns 3 and 4.

_Note: The first and last column of each pattern are filled with a '*' character._

## Methods
- `isAlphaNumeric(char ch)`: Checks if a character is alpha-numeric.
- `stringNChar(char ch, int n)`: Returns a string with character `ch` repeated `n` times.
- `stringNChar(char ch1, int n1, char ch2, int n2)`: Returns a string concatenating `n1` times `ch1` and `n2` times `ch2`.
- `stringNChar(char ch1, char ch2, int n1, int n2)`: Similar to the above but returns `n1` times `ch1`, `n2` times `ch2`, and `n1` times `ch1` again.
- `pattern1`, `pattern2`, `pattern3`, `pattern4`: Display respective patterns using the `stringNChar` methods.

## Sample Runs
Instructions for various patterns with examples are included to demonstrate the output based on user input.

### Pattern 1
- **Input**:
``` bash
    Enter pattern number [1, 4] (0 to quit): 1
    Enter an alpha-numeric first char: f
    Enter a non alpha-numeric second char: +
    Enter a size >= 3: 5
```
- **Output**:
``` bash
    Pattern 1: ch1 = 'f', ch2 = '+', size = 5
    ++++f++++
    +++fff+++
    ++fffff++
    +fffffff+
    fffffffff
```

### Pattern 2
- **Input**:
``` bash
    Enter pattern number [1, 4] (0 to quit): 2
    Enter an alpha-numeric first char: e
    Enter a non alpha-numeric second char: -
    Enter a size >= 3: 4
```
- **Output**:
``` bash
    Pattern 2: ch1 = 'e', ch2 = '-', size = 4
    eeeeeee
    -eeeee-
    --eee--
    ---e---
```

### Pattern 3
- **Input**:
``` bash
    Enter pattern number [1, 4] (0 to quit): 3
    Enter an alpha-numeric first char: g
    Enter a non alpha-numeric second char: =
    Enter a size >= 3: 6
```
- **Output**:
``` bash
    Pattern 3: ch1 = 'g', ch2 = '=', size = 6
    g=====
    gg====
    ggg===
    gggg==
    ggggg=
    gggggg
    ggggg=
    gggg==
    ggg===
    gg====
    g=====
```

### Pattern 4
- **Input**:
``` bash
    Enter pattern number [1, 4] (0 to quit): 4
    Enter an alpha-numeric first char: g
    Enter a non alpha-numeric second char: =
    Enter a size >= 3: 6
```
- **Output**:
``` bash
    Pattern 4: ch1 = 'g', ch2 = '=', size = 6
    =====g
    ====gg
    ===ggg
    ==gggg
    =ggggg
    gggggg
    =ggggg
    ==gggg
    ===ggg
    ====gg
    =====g
```

### Exiting the Program
``` bash
    Enter pattern number [1, 4] (0 to quit): 0
    Thank you for using this application.
```






 
