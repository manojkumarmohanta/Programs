#Write a program that prints absolute value, square root and cube root of a number?
import math

# get input from user
num = float(input("Enter a number: "))

# calculate absolute value
abs_num = abs(num)

# calculate square root
sqrt_num = math.sqrt(num)

# calculate cube root
cube_num = num ** (1/3)

# print results
print("Absolute value of", num, "is", abs_num)
print("Square root of", num, "is", sqrt_num)
print("Cube root of", num, "is", cube_num)