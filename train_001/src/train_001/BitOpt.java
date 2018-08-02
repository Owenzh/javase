package train_001;

public class BitOpt {
	private int a;
	private int b;

	public BitOpt() {
		super();
	}

	public BitOpt(int a1, int b1) {
		super();
		this.a = a1;
		this.b = b1;
	}

	protected void changeValueV1() {
		System.out.println("------Change Value V1 run---");
		StringBuilder sbr = new StringBuilder();
		sbr.append("Before: a=" + this.a);
		sbr.append(" b=" + this.b);
		sbr.append("\n");
		int temp;
		temp = this.a;
		this.a = this.b;
		this.b = temp;
		sbr.append("After:  a=" + this.a);
		sbr.append(" b=" + this.b);
		System.out.println(sbr);
	}

	protected void changeValueV2() {
		System.out.println("------Change Value V2 run---");
		StringBuilder sbr = new StringBuilder();
		sbr.append("Before: a=" + this.a);
		sbr.append(" b=" + this.b);
		sbr.append("\n");
		this.a = this.a ^ this.b;
		this.b = this.a ^ this.b;
		this.a = this.a ^ this.b;
		sbr.append("After:  a=" + this.a);
		sbr.append(" b=" + this.b);
		System.out.println(sbr);
	}

	protected void optAll() {
		System.out.println("------Opt All run---");
		System.out.println("init: a = " + a + ", b = " + b);
		System.out.println("a & b = " + (a & b));
		System.out.println("a | b = " + (a | b));
		System.out.println("a ^ b = " + (a ^ b));
		System.out.println("a ^ b ^ b = " + (a ^ b ^ b));
		System.out.println("a ^ b ^ b ^ b = " + (a ^ b ^ b ^ b));
		System.out.println("~a  = " + (~a));
		System.out.println("~b  = " + (~b));
	}

	public static void main(String[] args) {
		// & ! ^ ~ >>,>>>,<<
		BitOpt bo = new BitOpt(5, 10);
		bo.optAll();
		bo.changeValueV1();
		bo.changeValueV2();
	}

}
