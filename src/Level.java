import java.awt.*;

public class Level {

	private int[][] barricadeHonderd;
	private int[][] barricadeTweeHonderd;
	private int[][] barricadeDrieHonderd;
	private int[][] sleutelHonderd;
	private int[][] sleutelTweeHonderd;
	private int[][] sleutelDrieHonderd;
	private int[][] Muren;
	private VeldObject startPositie;
	public VeldObject finish;
	public Dimension veldGrootte;

	public Level() {
		this.veldGrootte = new Dimension(10, 10);
		Muur muur = new Muur(0,1);
				this.startPositie = new VeldObject(0, 0) {
					@Override
					public boolean padVrij() {
						return false;
					}
				};

				this.finish = new Finish(9, 9);

				this.Muren = new int[][]{{0, 1}};

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