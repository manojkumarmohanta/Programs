#Write a program to print Fibonacci series using recursion?
def fibonacci(n, terms):
    if n <= 1:
        return n
    else:
        return fibonacci(n-1, terms) + fibonacci(n-2, terms)

n = int(input("Enter the number of terms: "))

print("Fibonacci series:")
for i in range(n):
    print(fibonacci(i, n))