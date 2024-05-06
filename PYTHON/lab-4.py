#Enter a chat and give them grade
ch = str(input("Enter a character(o/O a/A b/B c/C f/F ): "))
if ch == 'O' or ch == 'o' :
    print ("grade: very good")  # Grade for 'A' is always "A"
elif(ch=='a' or ch=='A'):
    print ("Grade: good")
elif(ch=='b' or ch=='B'):
    print ("grade: Average")
else:
    print("grade : fail")