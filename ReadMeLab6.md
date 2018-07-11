**Lab 6 Questions**

  

1.  Why does FixedArrayQueue require an explicit constructor?

  

- This is required because in order to initialize queue size and allocate memory for the array of that size, we need an explicit constructor.

  
2.  What happens when you offer an item to a full FixedArrayQueue?


- There will be no space for a new object and the method will return false. 


3.  What happens when you poll an emptyFixedArrayQueue?


- The returned value will be null, since there are no items.

  

4. What is the time and (extra) space complexity of each of the FixedArrayQueue methods?

  

- Offer, peek, poll, isEmpty, all have a time and space complexity of O(1). Whereas asList will have O(n).
