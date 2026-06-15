# Wonderland Number (5 digits)

## Description

Wonderland Number is a programming kata based on a numerical logic problem involving constraints on digits.

In this variant, the goal is to find a **5-digit number** that satisfies a very specific property: when multiplied by certain factors, the results must contain exactly the same digits, with no repeated digits within the number itself and no digit collisions across the resulting products.

## Problem

The task is to find a 5-digit number that satisfies the following conditions:

- It is a number with exactly 5 digits.
- All digits are unique.
- When multiplied by certain numbers (as defined in the kata statement), the resulting products must be composed of digits that are all different.
- Additionally, the digits in each result must also respect the rule of no repetition within the number.

## Idea of the Exercise

The problem is based on finding a “special” number that maintains a unique digit structure under multiplication, which implies strong combinatorial constraints.

It is not a direct calculation, but rather a search process with validation of digit-based conditions.

## Concepts Covered

- Java programming
- Brute force search
- Digit manipulation
- Uniqueness validation
- Sets
- Search optimization
- Combinatorial logic

## Solution Strategy

A typical approach consists of:

1. Iterating over all 5-digit numbers.
2. Filtering out numbers with repeated digits.
3. Multiplying the number by the given factors in the exercise.
4. Checking that:
   - There are no repeated digits in each result.
   - The digits satisfy the global constraints of the problem.
5. Storing or returning the number that satisfies all conditions.

## Validation Example

For a candidate number `ABCDE`:

```text
ABCDE × k → valid result if:
- all digits in the result are distinct
- there are no internal repetitions
```

## Objective

The goal of this kata is to practice:

- Solving problems with strong constraints
- Digit manipulation
- Use of data structures such as sets
- Search and filtering algorithms
- Combinatorial thinking

## Author

Exercise completed as part of Cyber Dojo practice sessions using Java.
