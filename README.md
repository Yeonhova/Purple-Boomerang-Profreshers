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
&nbsp;&nbsp;return true.
  
Else, if the the current positions is not legal, //base case decision for not a stepping stone!  
&nbsp;&nbsp;return false.
  
else //recursive case  
Drop wall  
&nbsp;&nbsp;For each cardinal direction,  
&nbsp;&nbsp;&nbsp;&nbsp;move one step forwards   
&nbsp;&nbsp;&nbsp;&nbsp;invoke the recursive abstraction  
&nbsp;&nbsp;&nbsp;&nbsp;move one step backwards     
return false //End  
 
## Class(es), with fields and methods

###Maze

#####Fields
maze - a 2D array that represents the state of the maze  
MAX_RANKS - shows max ranks and implicitly, columns - 64x64 maze  
rankCount - number of ranks in a particular maze  

#####Methods
Maze Constructor with three parameters - places explorer in the maze  
Maze Constructor Copier - Self explanatory  
toString - Self explanatory  
dropA - drops a maze element  
explorerIsOnA - where or what the explorer currently stands on  

###MazeSolver

#####Fields
maze - stores maze that will be evaluated  
success - value for the statement of the problem  

#####Methods
MazeSolver - updates the fileds 
solveThis - solves the maze for the statement of the problem
toString - Self explanatory

## Known Bugs
None

## Version *n* wish list
- All possible paths to solution
- Shortest path to solution
- Longest path to solution
