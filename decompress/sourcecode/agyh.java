import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import java.nio.ByteBuffer;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class agyh
{
    private static volatile int f = 100;
    public int a;
    final int b;
    public int c;
    agyi d;
    
    public agyh() {
        this.b = agyh.f;
        this.c = Integer.MAX_VALUE;
    }
    
    public static int J(final int n) {
        return -(n & 0x1) ^ n >>> 1;
    }
    
    public static int K(int read, final InputStream inputStream) {
        if ((read & 0x80) == 0x0) {
            return read;
        }
        int n = read & 0x7F;
        read = 7;
        int i;
        while (true) {
            i = read;
            if (read >= 32) {
                break;
            }
            final int read2 = inputStream.read();
            if (read2 == -1) {
                throw ahab.j();
            }
            n |= (read2 & 0x7F) << read;
            if ((read2 & 0x80) == 0x0) {
                return n;
            }
            read += 7;
        }
        while (i < 64) {
            read = inputStream.read();
            if (read == -1) {
                throw ahab.j();
            }
            if ((read & 0x80) == 0x0) {
                return n;
            }
            i += 7;
        }
        throw ahab.e();
    }
    
    public static long L(final long n) {
        return -(n & 0x1L) ^ n >>> 1;
    }
    
    public static agyh M(final InputStream inputStream) {
        return P(inputStream, 4096);
    }
    
    public static agyh N(final ByteBuffer byteBuffer) {
        Object o;
        if (byteBuffer.hasArray()) {
            o = R(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        else if (byteBuffer.isDirect() && ahcj.a) {
            o = new agyg(byteBuffer);
        }
        else {
            final int remaining = byteBuffer.remaining();
            final byte[] array = new byte[remaining];
            byteBuffer.duplicate().get(array);
            o = R(array, 0, remaining);
        }
        return (agyh)o;
    }
    
    public static agyh O(final byte[] array) {
        return R(array, 0, array.length);
    }
    
    public static agyh P(final InputStream inputStream, final int n) {
        if (inputStream == null) {
            return O(agzz.b);
        }
        return (agyh)new agyf(inputStream, n);
    }
    
    public static agyh R(final byte[] array, final int n, final int n2) {
        final agyd agyd = new agyd(array, n, n2);
        try {
            agyd.f(n2);
            return (agyh)agyd;
        }
        catch (final ahab ahab) {
            throw new IllegalArgumentException(ahab);
        }
    }
    
    public abstract String A();
    
    public abstract void B(final int p0);
    
    public abstract void C(final int p0);
    
    public abstract boolean E();
    
    public abstract boolean F();
    
    public abstract boolean G(final int p0);
    
    public abstract byte[] H();
    
    public final void Q() {
        if (this.a < this.b) {
            return;
        }
        throw ahab.h();
    }
    
    public abstract double b();
    
    public abstract float c();
    
    public abstract int e();
    
    public abstract int f(final int p0);
    
    public abstract int g();
    
    public abstract int h();
    
    public abstract int i();
    
    public abstract int k();
    
    public abstract int l();
    
    public abstract int m();
    
    public abstract int n();
    
    public abstract int o();
    
    public abstract long p();
    
    public abstract long q();
    
    public abstract long u();
    
    public abstract long v();
    
    public abstract long w();
    
    public abstract agyc x();
    
    public abstract MessageLite y(final ahbe p0, final ExtensionRegistryLite p1);
    
    public abstract String z();
}
