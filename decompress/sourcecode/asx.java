import j$.io.DesugarInputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.ByteArrayInputStream;
import java.nio.ByteOrder;
import java.io.DataInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.DataInput;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class asx extends InputStream implements DataInput, InputStreamRetargetInterface
{
    protected final DataInputStream a;
    protected int b;
    public ByteOrder c;
    private byte[] d;
    
    public asx(final InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }
    
    public asx(final InputStream inputStream, final ByteOrder c) {
        (this.a = new DataInputStream(inputStream)).mark(0);
        this.b = 0;
        this.c = c;
    }
    
    public asx(final InputStream inputStream, final byte[] array) {
        this(inputStream);
        if (inputStream.markSupported()) {
            this.a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
    
    public asx(final byte[] array) {
        this(new ByteArrayInputStream(array), ByteOrder.BIG_ENDIAN);
    }
    
    public asx(final byte[] array, final byte[] array2) {
        this(array);
        this.a.mark(Integer.MAX_VALUE);
    }
    
    public final long a() {
        return (long)this.readInt() & 0xFFFFFFFFL;
    }
    
    @Override
    public final int available() {
        return this.a.available();
    }
    
    public final void b(final int n) {
        int i;
        int read;
        for (i = 0; i < n; i += read) {
            final int n2 = n - i;
            if ((read = (int)this.a.skip(n2)) <= 0) {
                if (this.d == null) {
                    this.d = new byte[8192];
                }
                read = this.a.read(this.d, 0, Math.min(8192, n2));
                if (read == -1) {
                    final StringBuilder sb = new StringBuilder("Reached EOF while skipping ");
                    sb.append(n);
                    sb.append(" bytes.");
                    throw new EOFException(sb.toString());
                }
            }
        }
        this.b += i;
    }
    
    public final void c(long n) {
        final long n2 = this.b;
        if (n2 > n) {
            this.b = 0;
            this.a.reset();
        }
        else {
            n -= n2;
        }
        this.b((int)n);
    }
    
    @Override
    public final void mark(final int n) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }
    
    @Override
    public final int read() {
        ++this.b;
        return this.a.read();
    }
    
    @Override
    public final int read(final byte[] array, int read, final int n) {
        read = this.a.read(array, read, n);
        this.b += read;
        return read;
    }
    
    @Override
    public final boolean readBoolean() {
        ++this.b;
        return this.a.readBoolean();
    }
    
    @Override
    public final byte readByte() {
        ++this.b;
        final int read = this.a.read();
        if (read >= 0) {
            return (byte)read;
        }
        throw new EOFException();
    }
    
    @Override
    public final char readChar() {
        this.b += 2;
        return this.a.readChar();
    }
    
    @Override
    public final double readDouble() {
        return Double.longBitsToDouble(this.readLong());
    }
    
    @Override
    public final float readFloat() {
        return Float.intBitsToFloat(this.readInt());
    }
    
    @Override
    public final void readFully(final byte[] array) {
        this.b += array.length;
        this.a.readFully(array);
    }
    
    @Override
    public final void readFully(final byte[] array, final int n, final int n2) {
        this.b += n2;
        this.a.readFully(array, n, n2);
    }
    
    @Override
    public final int readInt() {
        this.b += 4;
        final int read = this.a.read();
        final int read2 = this.a.read();
        final int read3 = this.a.read();
        final int read4 = this.a.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        if (this.c == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (this.c == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        final StringBuilder sb = new StringBuilder("Invalid byte order: ");
        final ByteOrder c = this.c;
        sb.append(c);
        throw new IOException("Invalid byte order: ".concat(String.valueOf(c)));
    }
    
    @Override
    public final String readLine() {
        return null;
    }
    
    @Override
    public final long readLong() {
        this.b += 8;
        final int read = this.a.read();
        final int read2 = this.a.read();
        final int read3 = this.a.read();
        final int read4 = this.a.read();
        final int read5 = this.a.read();
        final int read6 = this.a.read();
        final int read7 = this.a.read();
        final int read8 = this.a.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        if (this.c == ByteOrder.LITTLE_ENDIAN) {
            return ((long)read8 << 56) + ((long)read7 << 48) + ((long)read6 << 40) + ((long)read5 << 32) + ((long)read4 << 24) + ((long)read3 << 16) + ((long)read2 << 8) + read;
        }
        if (this.c == ByteOrder.BIG_ENDIAN) {
            return ((long)read << 56) + ((long)read2 << 48) + ((long)read3 << 40) + ((long)read4 << 32) + ((long)read5 << 24) + ((long)read6 << 16) + ((long)read7 << 8) + read8;
        }
        final StringBuilder sb = new StringBuilder("Invalid byte order: ");
        final ByteOrder c = this.c;
        sb.append(c);
        throw new IOException("Invalid byte order: ".concat(String.valueOf(c)));
    }
    
    @Override
    public final short readShort() {
        this.b += 2;
        final int read = this.a.read();
        final int read2 = this.a.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        if (this.c == ByteOrder.LITTLE_ENDIAN) {
            return (short)((read2 << 8) + read);
        }
        if (this.c == ByteOrder.BIG_ENDIAN) {
            return (short)((read << 8) + read2);
        }
        final StringBuilder sb = new StringBuilder("Invalid byte order: ");
        final ByteOrder c = this.c;
        sb.append(c);
        throw new IOException("Invalid byte order: ".concat(String.valueOf(c)));
    }
    
    @Override
    public final String readUTF() {
        this.b += 2;
        return this.a.readUTF();
    }
    
    @Override
    public final int readUnsignedByte() {
        ++this.b;
        return this.a.readUnsignedByte();
    }
    
    @Override
    public final int readUnsignedShort() {
        this.b += 2;
        final int read = this.a.read();
        final int read2 = this.a.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        if (this.c == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (this.c == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        final StringBuilder sb = new StringBuilder("Invalid byte order: ");
        final ByteOrder c = this.c;
        sb.append(c);
        throw new IOException("Invalid byte order: ".concat(String.valueOf(c)));
    }
    
    @Override
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }
    
    @Override
    public final int skipBytes(final int n) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }
}
