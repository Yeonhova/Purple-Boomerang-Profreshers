/** 
  Determine if an explorer can reach treasure from 
  their starting position
*/

public class MazeSolver{

    private Maze maze;
    
    private  boolean success; //determine if explorer can reach treasure (if any)

    public MazeSolver(Maze maze1){
	maze = maze1;

	
	success = solveThis();

    }

    private boolean solveThis(){

	if (maze.explorerIsOnA() == maze.TREASURE) return true; //base case
        if (maze.explorerIsOnA() == maze.WALL) return false; //other base case
	else{
		int[] directions = {maze.EAST, maze.NORTH, maze.WEST, maze.SOUTH}; 
	    for (int nextStep: directions){ 

	       
	         Maze mazeBeforeNextStep = new Maze(maze);
		 maze.dropA(maze.WALL);

		 maze.go(nextStep);
		 System.out.println(maze);

		 if (solveThis()) return true;

		

		 maze = mazeBeforeNextStep;
	    }
	    return false;
	}
    }
	public String toString(){
		return "boolean of the statement is " + success;
	}
}	
