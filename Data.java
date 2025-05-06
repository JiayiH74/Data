public class Data
{
    public static final int MAX = (int) (Math.random() * Integer.MAX_VALUE);
    private int[][] grid;

    public Data (int cols, int rows)
    {
        grid = new int[cols][rows];
    }

    public Data(int[][] arr)
    {
        grid = arr;
    }

    public void repopulate()
    {
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; i++)
            {
                int val = 0;
                while(val % 10 != 0 || val % 100 == 0)
                {
                    val = (int) Math.random() * MAX + 1;
                }
                grid[i][j] = val;
            }
        }
    }

    public String toString() {
        String s = "";
        for(int row[] : grid)
        {
            for(int col : row)
            {
                s += col + " ";
            }
            s += "\n";
        }
        return s;
    }

    public int countIncreasingCols()
    {
        int count = 0;
        for(int col = 0; col < grid[0].length; col++)
        {
            int increasing = 1;
            for(int row = 1; row < grid.length; row++)
            {
                if(grid[row][col] >= grid[row - 1][col]) increasing++;
                if(increasing == grid.length) count++;
            }
        }
        return count;
    }
}
