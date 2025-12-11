import java.util.Arrays;

public class search
{
    public static void main(String[] args)
    {
        boolean[][] board={
            {true,true,true},{true,true,true},{true,true,true}
        };
        int[][] path=new int[board.length][board[0].length];
        backtraking("",board,0,0,path,0);
    }
    static int maze(int r,int c)
    {
        if(r==1||c==1) {
            return 1;
        }
       /*  int count=0;
       count=count+ maze(r-1,c);
       count=count+maze(r,c-1);
       return count; */
       int l=maze(r-1,c);
       int right=maze(r,c-1);
       return l+right;
    }

    static void pathrestrict(String p,boolean[][] maze,int r,int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1) {
            System.out.println(p);
        return; }
        if(maze[r][c]==false) {
             //if(!maze[r][c])
            return;
        }
        if(r < maze.length-1)
        {
            pathrestrict(p+"d",maze,r+1,c);
        }
        if(c<maze.length-1) {
            pathrestrict(p+'r',maze,r,c+1);
        }
        
    }

    static void allpaths(String p,boolean[][] maze,int r,int c)
    {
        if(r==maze.length-1&&c==maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(r < maze.length-1)
        {
            pathrestrict(p+"d",maze,r+1,c);
        }
        if(c < maze[0].length-1) {
            pathrestrict(p+'r',maze,r,c+1);
        }
        if(c>0||c<maze.length-1) {
            pathrestrict(p+'u',maze,r-1,c);
        }
        if(c>0||r<maze.length-1||r>0) {
            pathrestrict(p+'l',maze,r,c-1);
        }

        
    }
    static void backtraking(String p,boolean[][] maze,int r,int c,int[][] path,int step)
    {
        if(r==maze.length-1&& c==maze[0].length-1) {
            path[r][c]=step;
            for(int[]arr:path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;

        }
    if(!maze[r][c]) {
        return;
    }
        path[r][c]=step;
        maze[r][c]=false;
        if(r<maze.length-1) {
            backtraking(p+'d',maze,r+1,c,path,step+1);

        }
        if(c<maze[0].length-1) {
            backtraking(p+'r',maze,r,c+1,path,step+1);
        }
        if(r>0) {
            backtraking(p+'u',maze,r-1,c,path,step+1);
        }
        if(c>0) {
            backtraking(p+'l',maze,r,c-1,path,step+1);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }
    //n queens problem
    
}python -m venv myenv
source myenv/bin/activate
pip install chatterbot
    