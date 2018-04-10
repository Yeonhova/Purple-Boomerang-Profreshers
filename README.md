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
starting with the right-most, untravelled path.

## Base Cases
If the current path leads to a treasure (when the explorer is on the treasure),
then the statement in the problem has a boolean value of true.

If the explorer is on the wall, 
then the statement in the problem has a boolean value of false.

## English or Pseudocode Description of Algorithm
Jargon specific to this project:
Path: The trail that I am standing on
Junction: point at which the current path split

When I am asked for the solution to a maze problem,
	and I travel down my current path and I encounter a junction,
the Recursive Abstraction can provide the boolean value of the statement in the problem, starting with the right-most, untravelled path.

Base Case - (If base case isn’t prompted after travelling all possible (distinct) path(s), then the statement in the problem has a boolean value of false)
If I encounter a treasure,
then the statement in the problem has a boolean value of true.

## Class(es), with fields and methods

## Version *n* wish list

