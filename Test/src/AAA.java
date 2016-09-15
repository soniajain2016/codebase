import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AAA {
/*	If we run the program and then comment 'store()' and uncomment 'read()' at the 'AAA.main()' we see that no 'TestEnum.field' value is serialized/deserialized.

	Here is a little puzzler - try to run the program when no code is commented, i.e. both calls are performed at 'AAA.main()'. Surprisingly, we see that custom 'AAA.field' value is preserved.

	The answer is that specification snippet about enum deserialization mentioned above says that enum instance is deserialized via calling 'valueOf()' method with string enum name as an argument. That implies that the same (customized) enum instance is reused within the same jvm process, i.e. all changes made to particular enum instance are reflected at all deserialized instances (we're not considering enum class loaded by different class loaders here).
*/

    public enum TestEnum {
        FIRST, SECOND;

        private int field;

        public int getField() {
            return field;
        }

        public void setField(int field) {
            this.field = field;
        }


        @Override
        public String toString() {
            return super.toString() + ", field=" + field;
        }
    }

    private static final String DATA_FILE = "data";

    public static void main(String[] args) throws Exception {
        store();
        read();
    }

    private static void store() throws Exception {
        ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream(DATA_FILE));
        TestEnum.FIRST.setField(12);
        System.out.println("Storing " + TestEnum.FIRST);
        oOut.writeObject(TestEnum.FIRST);
        oOut.close();
    }

    private static void read() throws Exception {
        ObjectInputStream oIn = new ObjectInputStream(new FileInputStream(DATA_FILE));
        TestEnum e = (TestEnum) oIn.readObject();
        System.out.println("Read: " + e);
    }
}