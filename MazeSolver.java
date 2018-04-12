/** 
  Determine if an explorer can reach treasure from 
  their starting position
*/

public class MazeSolver{

    private Maze maze;
    
    private  boolean success;

    public MazeSolver(Maze maze1){
	maze = maze1;

	
	success = solveThis();

    }

    private boolean solveThis(){

	if (maze.explorerIsOnA() == maze.TREASURE) return true;
        if (maze.explorerIsOnA() == maze.WALL) return false;
	else return true;

	    
	
    }

    public String toString(){
	return "statement of prob is " + success;
    }
}
						    
    
    


    

