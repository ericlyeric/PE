package Problem_015;

/*
Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
there are exactly 6 routes to the bottom right corner.
How many such routes are there through a 20×20 grid?
 */

public class LatticePaths {
    public String latPaths(int dimension) {
        dimension++;
        double[][] lattice = new double[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (i == 0 || j == 0) lattice[i][j] = 1;
                else lattice[i][j] = lattice[i-1][j] + lattice[i][j-1];
            }
        }
        String paths = String.format("%.0f", lattice[dimension-1][dimension-1]);
        return paths;
    }
}
