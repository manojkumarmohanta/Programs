# let = 'python'
# r = len(let)
# for i in range(r):
#     for j in range(i+1):
#         print(let[j],end="")
#     print()
# for i in range(r):
#     for j in range(r-i):
#         print(let[j],end="")
#     print()

string = "python"
x=0
for i in string:
    x=x+1
    for j in range(x):
        print(string[j],end="")
    print()
for i in range(x):
    x=x-1
    for j in range(x):
        print(string[j],end="")
    print()
