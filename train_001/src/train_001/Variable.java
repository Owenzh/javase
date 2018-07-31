package train_001;

public class Variable {
	static int TM = 0;
	public int tm = 0;

	public void increase() {
		this.tm++;
		TM++;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sbr = new StringBuilder();
		sbr.append("tm= ");
		sbr.append(this.tm);
		sbr.append(" TM= ");
		sbr.append(Variable.TM);
		System.out.println(sbr.toString());
		return sbr.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable vb1 = new Variable();
		int i;
		for (i = 0; i < 3; i++) {
			vb1.increase();
		}

		System.out.println(i);
		vb1.toString();
		Variable vb2 = new Variable();
		for (i = 0; i < 5; i++) {
			vb2.increase();
		}
		System.out.println(i);
		vb2.toString();
	}

}
