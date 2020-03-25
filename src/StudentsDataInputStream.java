import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StudentsDataInputStream extends InputStream {

    DataInputStream dis;

    public StudentsDataInputStream(InputStream is) {
        try(DataInputStream dis = new DataInputStream(is)) {
            this.dis = dis;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Student readStudent() throws IOException {
        String[] name = new String[2];
        for( int i = 0; i < 2; i++) {
            StringBuilder str = new StringBuilder();
            char b = Character.MIN_VALUE;
            while (b != ' ') {
                str.append(b);
                b = dis.readChar();
            }
            name[i] = str.toString();
        }
        boolean sex = dis.readByte() == 1;
        int group = dis.readInt();
        return new Student(name[0],name[1],sex, group);
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
    public int read() throws IOException {
        throw new UnsupportedOperationException();
    }
}

