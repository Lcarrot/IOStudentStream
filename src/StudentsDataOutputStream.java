import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StudentsDataOutputStream extends OutputStream {

    DataOutputStream dos;

    public StudentsDataOutputStream(OutputStream os) {
        try(DataOutputStream dos = new DataOutputStream(os)) {
           this.dos = dos;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeStudent(Student student, byte first, byte second, byte third, byte fourth) throws IOException {
        byte[] order = new byte[]{first, second, third, fourth};
        byte l;
        if (first > 4 || second > 4 || third > 4 || fourth > 4) throw new IllegalArgumentException();
        for (int i = 0; i < order.length; i++) {
            int k = order[i];
            switch (k) {
                case 1:
                    dos.writeChars(student.getName());
                    dos.writeChar(' ');
                    break;
                case 2:
                    dos.writeChars(student.getSurname());
                    dos.writeChar(' ');
                    break;
                case 3:
                    l = (byte) (student.getSex() ? 1 : 2);
                    dos.writeByte(l);
                    break;
                default:
                    l = (byte) (student.getGroup() - 900);
                    dos.writeByte(l);
                    break;
            }
        }
    }

    @Override
    public void write(int b) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void write(byte[] b) throws IOException {
        super.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        super.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        super.flush();
    }

    @Override
    public void close() throws IOException {
        super.close();
    }
}
