# Exercise 1.1

*(a) Describe (in words or pseudocode) an algorithm to determine for a given
integer n, the next prime number p after or equal to n, that is, the prime
number p >= n such that p - n is minimised.*  
```
Initiate a boolean isPrime and initialize with n isPrime is true.
Initiate a divisor = 2 and allow divisor to go up to n-1.
n divide divisor;  
 > if remainder is 0 then it is not prime. Update isPrime = false.  
 > else increment divisor by 1 and repeat from 'n divide divisor'.  

If sending n as an argument of isPrime gives true, print n.
If sending n as an argument of isPrime gives false, find closest prime >= n:  
 > increment n by 1 and set it as variable p
 > pass p as an argument of isPrime
 >> If true, print p. If false, repeat with p incremented by 1.
```

*(b) Argue that your algorithm is correct.*  
```
My answer here.
```

*(c) Very roughly, estimate how efficient your algorithm is: That is, look at
the loops used in your algorithm and estimate roughly how many iterations in
each loop your algorithm needs for a given number n.*  
```
My answer here.
```

# Exercise 1.2

_Write a Java programme **PrimeAtLeast** that expects one argument (the number
n) and implements your algorithm._  
_Try to use a method (or several ones) other than the main method in your
program. For this, single out parts of your program, which could naturally
be encapsulated in a method._

```
My link here.
```
