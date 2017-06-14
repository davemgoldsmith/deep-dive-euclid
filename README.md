# deep-dive-euclid
euclid program
GCD program  
This will compute the greatest common devisor given two numbers 
If either number is negative, then the absolute value will be used  
If either number is zero, then GCD is the non zero other number, could also be a zero  
The algorythm compares the two numbers and figures the larger number and subtracts the smaller from the larger  
While a != b then  
    If a > b then reduce the value of a by b
    otherwise  
      reduce the value of b by a  
      GCD = a - b
   
