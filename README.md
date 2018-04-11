# Purple-Boomerang-Profreshers

## Personnel
Kevin Flores & Yeonho Jang

## Statement of Problem:
Given a maze with (distinct) path(s), what is the boolean value of the statement “it is possible to get from the starting position to treasure”?

## Recursive Abstraction
When I am asked to find the boolean value of the statement
“it is possible to get from the starting position to treasure?”,
The recursive abstraction can find the boolean value of the statement
“it is possible to get from the starting position to treasure?”,
starting with the next step in all cardinal direction.

If the recursive case exhausts without returning any trues, return a false. 

## Base Cases
If the current step has a treasure (when the explorer is on the treasure),
then the statement in the problem has a boolean value of true.

If the value for islegal for the current position returns false (if the explorer is not on a stepping stone), 
then the statement in the problem has a boolean value of false.

## English or Pseudocode Description of Algorithm
If the current position has a treasure, // base case decision for victory!
	return true.
  
Else, if the the current positions is not legal, //base case decision for not a stepping stone!
	return false.
  
 else //recursive case
 Drop wall
  	For each cardinal direction,
      	move one step forwards 
      	invoke the recursive abstraction
      	move one step backwards   
 return false //End
 
## Class(es), with fields and methods

## Version *n* wish list
- All possible paths to solution
- Shortest path to solution
- Longest path to solution
