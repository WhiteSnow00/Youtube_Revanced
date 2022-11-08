import java.util.Arrays;
import java.util.ArrayList;
import java.io.OutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agyb extends OutputStream
{
    private static final byte[] a;
    private final int b;
    private final ArrayList c;
    private int d;
    private byte[] e;
    private int f;
    
    static {
        a = new byte[0];
    }
    
    public agyb(final int b) {
        this.b = b;
        this.c = new ArrayList();
        this.e = new byte[b];
    }
    
    private final void d(final int n) {
        this.c.add(new agya(this.e));
        final int d = this.d + this.e.length;
        this.d = d;
        this.e = new byte[Math.max(this.b, Math.max(n, d >>> 1))];
        this.f = 0;
    }
    
    public final int a() {
        synchronized (this) {
            return this.d + this.f;
        }
    }
    
    public final agyc b() {
        synchronized (this) {
            final int f = this.f;
            final byte[] e = this.e;
            if (f < e.length) {
                if (f > 0) {
                    this.c.add(new agya(Arrays.copyOf(e, f)));
                }
            }
            else {
                this.c.add(new agya(this.e));
                this.e = agyb.a;
            }
            this.d += this.f;
            this.f = 0;
            return agyc.v(this.c);
        }
    }
    
    public final void c() {
        synchronized (this) {
            this.c.clear();
            this.d = 0;
            this.f = 0;
        }
    }
    
    @Override
    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.a());
    }
    
    @Override
    public final void write(final int n) {
        synchronized (this) {
            if (this.f == this.e.length) {
                this.d(1);
            }
            this.e[this.f++] = (byte)n;
        }
    }
    
    @Override
    public final void write(final byte[] array, final int n, int f) {
        synchronized (this) {
            final byte[] e = this.e;
            final int length = e.length;
            final int f2 = this.f;
            final int n2 = length - f2;
            if (f <= n2) {
                System.arraycopy(array, n, e, f2, f);
                this.f += f;
                return;
            }
            System.arraycopy(array, n, e, f2, n2);
            f -= n2;
            this.d(f);
            System.arraycopy(array, n + n2, this.e, 0, f);
            this.f = f;
        }
    }
}
