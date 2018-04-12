/** 
  Test the ability to determine 
  if an explorer can reach treasure 
  in a maze. 
*/

public class UserOfMazeSolver {


       public static void main(String[] commandLine)
       throws java.io.FileNotFoundException {
        System.out.println();

        Maze maze = new Maze( commandLine[0]
                            , Integer.parseInt( commandLine[1])
                            , Integer.parseInt( commandLine[2])
                            );
        System.out.println( maze + System.lineSeparator());

	MazeSolver solvePls = new MazeSolver(maze);

	System.out.println(solvePls);
       }
}
