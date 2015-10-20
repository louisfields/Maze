import java.util.ArrayList;
import java.util.List;

/**
 * Developed by: Nick
 * Date of File Creation: 10/19/2015.
 * Time of File Creation: 9:29 AM
 */

public class MazeHolder{

    private int r, c;

    private char[][] maze;

    public MazeHolder(int r, int c){

        this.r = (2*r)+1;
        this.c = (2*c)+1;

        maze = new char[r][c];
    }

    private class Cell{
        int x, y;

        boolean isAWall = false;
        boolean used = false;

        private ArrayStack a = new ArrayStack(r, c);

        Cell(int x, int y){
            this(x, y, false);
        }
        Cell(int x, int y, boolean isAWall){
            this.x = x;
            this.y = y;
            this.isAWall = isAWall;
        }

        void addNeighbor(Cell other){

        }
    }


    private class ArrayStack {
        private int maxR;
        private int maxC;
        private List<Cell> path;
        private Cell top;

        public ArrayStack(int r, int c){
            maxR = r;
            maxC = c;
            path = new ArrayList<Cell>();
            top = path.get(path.size()-1);
        }

        public void push(Cell c){
            path.add(c);
        }

        public Cell pop(){
            return path.get(path.size()-1);
        }

        public Cell peek(){
            return top;
        }

        public boolean isEmpty(){
            return path.isEmpty();
        }

        public boolean isFull(){
            return top == new Cell(maxR, maxC);
        }
    }
}

