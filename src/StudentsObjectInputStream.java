
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class StudentsObjectInputStream extends InputStream {

    ObjectInputStream oin;

    public StudentsObjectInputStream(InputStream in){
        try(ObjectInputStream oin = new ObjectInputStream(in)) {
            this.oin = oin;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Student readStudent() throws IOException, ClassNotFoundException {
        return (Student) oin.readObject();
    }

    @Override
    public int read(byte[] b) throws IOException {
        return super.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return super.read(b, off, len);
    }

    @Override
    public long skip(long n) throws IOException {
        return super.skip(n);
    }

    @Override
    public int available() throws IOException {
        return super.available();
    }

    @Override
    public void close() throws IOException {
        super.close();
    }

    @Override
    public synchronized void mark(int readlimit) {
        super.mark(readlimit);
    }

    @Override
    public synchronized void reset() throws IOException {
        super.reset();
    }

    @Override
    public boolean markSupported() {
        return super.markSupported();
    }

    @Override
    public int read(){
        throw new UnsupportedOperationException();
    }
}
