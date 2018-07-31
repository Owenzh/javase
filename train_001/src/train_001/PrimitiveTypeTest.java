package train_001;

public class PrimitiveTypeTest {

	public PrimitiveTypeTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Primitive type test...");
		byte b = 127;
		short s = 32767;
		int it = 1234;
		long lg = -23245533;
		float ft = 0.0f;
		float flt = 123.67f;
		double db = 0.0d;
		double dlb = 89.34;
		boolean bn = true;
		char cr = 'C';
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("byte= ");
		stringBuilder.append(b);
		stringBuilder.append("\n");
		stringBuilder.append("short= ");
		stringBuilder.append(s);
		stringBuilder.append("\n");
		stringBuilder.append("int= ");
		stringBuilder.append(it);
		stringBuilder.append("\n");
		stringBuilder.append("long= ");
		stringBuilder.append(lg);
		stringBuilder.append("\n");
		stringBuilder.append("float= ");
		stringBuilder.append(ft);
		stringBuilder.append("\n");
		stringBuilder.append("float= ");
		stringBuilder.append(flt);
		stringBuilder.append("\n");
		stringBuilder.append("double= ");
		stringBuilder.append(db);
		stringBuilder.append("\n");
		stringBuilder.append("double= ");
		stringBuilder.append(dlb);
		stringBuilder.append("\n");
		stringBuilder.append("boolean= ");
		stringBuilder.append(bn);
		stringBuilder.append("\n");
		stringBuilder.append("char= ");
		stringBuilder.append(cr);
		stringBuilder.append("\n");
		System.out.println(stringBuilder.toString());

	}
}
