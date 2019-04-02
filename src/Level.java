import java.awt.*;

public class Level {

	private int[][] barricadeHonderd = new int[][]{{0, 3}, {0, 5} , {0, 6}};
	private int[][] barricadeTweeHonderd;
	private int[][] barricadeDrieHonderd;
	private int[][] sleutelHonderd;
	private int[][] sleutelTweeHonderd;
	private int[][] sleutelDrieHonderd;
	private int[][] Muren = new int[][]{{0, 1}, {0, 2} , {0, 4} };
	public VeldObject finish = new Finish(10, 10);
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

	public VeldObject getFinish() {
		return finish;
	}
}