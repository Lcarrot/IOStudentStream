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

    public void writeStudent(Student student) throws IOException {
        String[] name = new String[]{student.getName(), student.getSurname()};
        for (String s : name) {
            for (int k = 0; k < s.length(); k++) {
                dos.writeChar(s.charAt(k));
            }
            dos.writeChar(' ');
        }
        byte sex = (byte) ((student.getSex()) ? 1 : 2);
        dos.writeByte(sex);
        dos.writeInt(student.getGroup());
    }

    @Override
    public void write(int b) throws IOException {
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
