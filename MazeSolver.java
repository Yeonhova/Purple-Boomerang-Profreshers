/** 
  Determine if an explorer can reach treasure from 
  their starting position
*/

public class MazeSolver{

    private Maze maze;

    private boolean success; // boolean value of the statement
                             // "is it possible to get from the
                             //  starting posiiton to treasure"

    public MazeSolver( String sourceFilename
                     , int explorerRank, int explorerFile
		     ) throws java.io.FileNotFoundException {
	maze = new Maze(String sourceFilename
			, int explorerRank, int explorerFile);
	
	success = solveThisMaze();
    }

    public boolean solveThisMaze(){

	// base cases below

	if (maze.explorerIsOnA() == maze.WALL) // our explorer is on a wall 
	    return false;
	if (maze.explorerIsA() == maze.TREASURE) // booyah! we are on treasure
	    return true;
    }

    public String toString(){
	if (success) return "It is possible to get from the starting position to treasure";
	else return "It is not possible to get from the starting posiiton to treasure";
    }
}

	

	

	

	

	
	
	
	
		     
                
        
}
