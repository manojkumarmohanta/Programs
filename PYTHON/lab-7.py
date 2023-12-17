#Write a program that finds the greatest of three given numbers using functions. Pass three arguments?
def find_greatest(num1, num2, num3):
  """This function takes three numbers as arguments and returns the greatest number."""

  # Find the greatest number.
  if num1 > num2 and num1 > num3:
    return num1
  elif num2 > num1 and num2 > num3:
    return num2
  else:
    return num3

# Get the three numbers from the user.
num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))
num3 = int(input("Enter the third number: "))

# Find the greatest number.
greatest_number = find_greatest(num1, num2, num3)

# Print the greatest number.
print("The greatest number is", greatest_number)