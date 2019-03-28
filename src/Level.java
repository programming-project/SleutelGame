import java.awt.*;

public class Level {

	private int level;
	private int[][] barricadeHonderd;
	private int[][] barricadeTweeHonderd;
	private int[][] barricadeDrieHonderd;
	private int[][] sleutelHonderd;
	private int[][] sleutelTweeHonderd;
	private int[][] sleutelDrieHonderd;
	private int[][] Muren;
	private VeldObject startPositie;
	public VeldObject finish;
	public Dimension boardSize;

	public Level(int level) {
		this.level = level;
		this.boardSize = new Dimension(10, 10);
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

	public VeldObject getStartPositie() {
		return startPositie;
	}

	public VeldObject getFinish() {
		return finish;
	}
}