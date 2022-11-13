import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class djs implements djr
{
    private final int a;
    private final Object b;
    
    public djs(final InputStream b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public djs(final ByteBuffer b, final int a) {
        this.a = a;
        ((ByteBuffer)(this.b = b)).order(ByteOrder.BIG_ENDIAN);
    }
    
    @Override
    public final int a() {
        int n;
        short n2;
        if (this.a != 0) {
            n = this.d() << 8;
            n2 = this.d();
        }
        else {
            n = this.d() << 8;
            n2 = this.d();
        }
        return n | n2;
    }
    
    @Override
    public final int b(final byte[] array, int min) {
        final int a = this.a;
        int n = 0;
        if (a != 0) {
            min = Math.min(min, ((ByteBuffer)this.b).remaining());
            if (min == 0) {
                return -1;
            }
            ((ByteBuffer)this.b).get(array, 0, min);
            return min;
        }
        else {
            int read = 0;
            int n2;
            while (true) {
                n2 = read;
                if (n >= min) {
                    break;
                }
                read = ((InputStream)this.b).read(array, n, min - n);
                if ((n2 = read) == -1) {
                    break;
                }
                n += read;
            }
            if (n == 0 && n2 == -1) {
                throw new djq();
            }
            return n;
        }
    }
    
    @Override
    public final long c(long n) {
        if (this.a != 0) {
            final int n2 = (int)Math.min(((ByteBuffer)this.b).remaining(), n);
            final ByteBuffer byteBuffer = (ByteBuffer)this.b;
            byteBuffer.position(byteBuffer.position() + n2);
            return n2;
        }
        final long n3 = 0L;
        if (n < 0L) {
            n = n3;
        }
        else {
            long n4 = n;
            while (n4 > 0L) {
                final long skip = ((InputStream)this.b).skip(n4);
                if (skip > 0L) {
                    n4 -= skip;
                }
                else {
                    if (((InputStream)this.b).read() == -1) {
                        break;
                    }
                    --n4;
                }
            }
            n -= n4;
        }
        return n;
    }
    
    @Override
    public final short d() {
        if (this.a != 0) {
            if (((ByteBuffer)this.b).remaining() > 0) {
                return (short)(((ByteBuffer)this.b).get() & 0xFF);
            }
            throw new djq();
        }
        else {
            final int read = ((InputStream)this.b).read();
            if (read != -1) {
                return (short)read;
            }
            throw new djq();
        }
    }
}
