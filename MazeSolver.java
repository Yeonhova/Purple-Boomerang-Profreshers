/** 
  Determine if an explorer can reach treasure from 
  their starting position
*/

public class MazeSolver{

    private Maze maze;
    
    private  boolean success; //determine if explorer can reach treasure (if any)

    private Displayer displayer;

    public MazeSolver(Maze maze1, int height){

	displayer = new Displayer(height);
	
	maze = maze1;

	displayer.atTopOfWindow("maze solving");

	
	success = solveThis();

    }

    private boolean solveThis(){

	if (maze.explorerIsOnA() == maze.TREASURE) return true; //base case 
        if (maze.explorerIsOnA() == maze.WALL) return false; //other base case
        else {
	    

	    int[] directions = {maze.EAST, maze.NORTH, maze.WEST, maze.SOUTH}; 
	    for (int nextStep: directions){ 

	       
	         Maze mazeBeforeNextStep = new Maze(maze);
		 maze.dropA(maze.WALL);

		 maze.go(nextStep);
		 displayer.atTopOfWindow(maze.toString());

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
