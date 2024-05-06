#Write a program to get a string made of the first 2 and last 2 characters from a given string If the string length is less than 2, return empty string in python?
def get_first_last_chars(string):
    if len(string) < 2:
        return "you have to enter at least 2 character"
    else:
        return string[:2] + string[-2:]

var = str(input("Enter a string: "))
var2 = get_first_last_chars(var)
print(var2)