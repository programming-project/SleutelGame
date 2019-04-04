import java.awt.*;

public class Level {

	private int[][] barricadeHonderd = new int[][]{{0, 2},{0, 7},{0, 8},{0, 9},{1, 7},{1, 8},{1, 9},{2, 2}, {3, 2},{3, 8},{3, 9},{4, 2},{4, 3},{4, 8},{4, 9}, {5, 1},{5, 2},{6, 2}, {7, 2},{7, 5},{8, 2},{8, 3},{9, 2},{5, 7}};
	private int[][] barricadeTweeHonderd = new int[][]{{9, 3},{3, 7}};
	private int[][] barricadeDrieHonderd= new int[][]{{2, 7},{2, 8},{4, 7},{5, 8},{6, 5},{7, 3},{7, 4}};
	private int[][] sleutelHonderd = new int[][]{{1, 4},{2, 9}};
	private int[][] sleutelTweeHonderd = new int[][]{{8, 0}};
	private int[][] sleutelDrieHonderd = new int[][]{{1, 5}};
	private int[][] Muren = new int[][]{{0, 1}, {3,1},{4, 1},{4, 4},{4, 5},{4, 6},{5, 6} ,{6, 1},{6, 3},{6, 4},{6, 6},{6, 7}, {7, 1},{8, 1},{8, 7},{9, 1},{9, 7}};
	public VeldObject finish = new Finish(9, 9);
	public Dimension veldGrootte = new Dimension(10, 10);

	public Level() {
	}

	public int[][] getBarricadeHonderd() {
		return barricadeHonderd;
	}

	public int[][] getBarricadeTweeHonderd() {
		return barricadeTweeHonderd;
	}

	public int[][] getBarricadeDrieHonderd() {
		return barricadeDrieHonderd;
	}

	public int[][] getSleutelHonderd() {
		return sleutelHonderd;
	}

	public int[][] getSleutelTweeHonderd() {
		return sleutelTweeHonderd;
	}

	public int[][] getSleutelDrieHonderd() {
		return sleutelDrieHonderd;
	}

	public int[][] getMuren() {
		return Muren;
	}

}