import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
        StringBuilder str = new StringBuilder();
        boolean sex = true;
        byte group = 0;
        char b = Character.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            switch (dis.readByte()) {
                case 1:
                    while (b != ' ') {
                        str.append(b);
                        b = dis.readChar();
                    }
                    name[0] = str.toString();
                    str = new StringBuilder();
                    break;
                case 2:
                    while (b != ' ') {
                        str.append(b);
                        b = dis.readChar();
                    }
                    name[1] = str.toString();
                    str = new StringBuilder();
                    break;
                case 3:
                    sex = 1 == dis.readByte();
                    break;
                default:
                    group = dis.readByte();
                    break;
            }
        }
        return new Student(name[0], name[1], sex, group);
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
    public int read() {
        throw new UnsupportedOperationException();
    }
}

