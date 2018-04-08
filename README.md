# Purple-Boomerang-Profreshers

## personnel
Kevin Flores & Yeonho Jang
## statement of problem:
Given a maze with (distinct) path(s), what is the boolean value of the statement “it is possible to get from the starting position to treasure”?

## recursive abstraction
When I am asked to find the boolean value of the statement
“it is possible to get from the starting position to treasure?”,
The recursive abstraction can find the boolean value of the statement
“it is possible to get from the starting position to treasure?”,
starting with the right-most, untravelled path.

## base case
If the current path leads to a treasure,
then the statement in the problem has a boolean value of true.

## English or pseudocode description of algorithm
Jargon specific to this project:
Path: The trail that I am standing on
Junction: point at which the current path split

When I am asked for the solution to a maze problem,
	and I travel down my current path and I encounter a junction,
the Recursive Abstraction can provide the boolean value of the statement in the problem, starting with the right-most, untravelled path.

Base Case - (If base case isn’t prompted after travelling all possible (distinct) path(s), then the statement in the problem has a boolean value of false)
If I encounter a treasure,
then the statement in the problem has a boolean value of true.

## class(es), with fields and methods

## version *n* wish list

