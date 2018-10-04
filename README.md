# Exercise 1.1

*(a) Describe (in words or pseudocode) an algorithm to determine for a given
integer n, the next prime number p after or equal to n, that is, the prime
number p >= n such that p - n is minimised.*  
```
Initiate a boolean isPrime and initialize with n isPrime is true.
Have guard clauses for n < 2 and n = 2.
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
Essentially, I am using the definition of prime numbers:  
  *a prime number is a number that is divisible only by itself and 1.*  
My algorithm is correct up to Java's integer upper bound.  
An argument of <= 2 is clearly correct because their output is hard-coded.  
For argument n > 2, the isPrime() method tries to divide n with every number below it, starting from 2. This is an exhaustive way of checking for prime. The process stops once it finds the first divisor and determines that n is not prime. Otherwise, it would have divided n by each integer in {2,...,n-1} and determines that there is no divisor, ie. n is only divisible by itself and 1.  
The main() method (described in the second half of the described algorithm) now simply has a job of checking whether the argument is prime or not. It is dependent on the isPrime() method.  
If the argument is prime, we are done.  
Else, it incrementally checks whether the integers above the argument is prime and outputs the first prime it reaches.  
```

*(c) Very roughly, estimate how efficient your algorithm is: That is, look at
the loops used in your algorithm and estimate roughly how many iterations in
each loop your algorithm needs for a given number n.*  
```
Given an integer n taken from {-2147483648,...,0,1,2,3...,2147483647}:  
|Operation      | Run-time      | High-level explanation  |
| ------------- |:-------------:| -----:|
| checking inequality | O(1) | Will get back to you |
| long division of n-digit and m-digit numbers  | O(nm) | Will get back to you |
| iteration of 1 to n-1 for some natural number n | O(n) | Will get back to you |

```

# Exercise 1.2

_Write a Java programme **PrimeAtLeast** that expects one argument (the number
n) and implements your algorithm._  
_Try to use a method (or several ones) other than the main method in your
program. For this, single out parts of your program, which could naturally
be encapsulated in a method._

```
To view my solution to this, kindly refer to the files in this repository.
```
