def display(arr):
    for element in arr:
        print(element, end=" ")
    print()
def insert_element(arr,size,element,capacity,index):
    if size>=capacity:
        return -1
    for i in range(size-1,index-1,-1):
        arr[i+1] = arr[i]
    arr[index]=element
    return 1

def main():
    arr = [1,2,3,5,6]
    size = 5
    element = 4
    index = 3
    display(arr)
    size += 1
    insert_element(arr,size,element,100,index)
    
    display(arr)

if __name__ =="__main__":
    main()