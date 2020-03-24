import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class StudentsObjectOutputStream extends OutputStream {

    ObjectOutputStream ous;

    public StudentsObjectOutputStream(OutputStream os) {
        try (ObjectOutputStream ous = new ObjectOutputStream(os)) {
            this.ous = ous;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeStudent(Student student) throws IOException {
        ous.writeObject(student);
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

    @Override
    public void write(int b) throws IOException {
    }
}
