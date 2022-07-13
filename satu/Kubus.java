
/*
 *
 * Smell code			:
 * potential cause(s)	:
 * solution(s)			:
 *
 */

public class Kubus extends BangunRuang implements BangunDatar {
	public int rusuk;

	public Kubus(int rusuk) {
		super();
		this.rusuk = rusuk;
	}

	@Override
	public float computeArea() {
		// TODO Auto-generated method stub
		return 6*this.rusuk*this.rusuk;
	}

	@Override
	public float computeAround() {
		// TODO Auto-generated method stub
		return 12*this.rusuk;
	}

	@Override
	public float computeVolume() {
		// TODO Auto-generated method stub
		return this.rusuk*this.rusuk*this.rusuk;
	};


}
