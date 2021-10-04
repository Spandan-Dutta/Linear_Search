def linear_Search(list1, n, key):  
  
      
    for i in range(0, n):  
        if (list1[i] == key):  
            return i  
    return -1  
  
  
list1 = [36 ,47, 31, 2, 19, 91]  
key = 19  
  
n = len(list1)  
res = linear_Search(list1, n, key)  
if(res == -1):  
    print("Element not found")  
else:  
    print("Element is found at index: ", res)  