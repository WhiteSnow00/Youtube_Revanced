import java.util.ArrayDeque;
import java.util.Stack;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvd
{
    public final byte[] a;
    public int b;
    public int c;
    public long d;
    public final AbstractCollection e;
    public final Object f;
    public Object g;
    
    public lvd() {
        this.a = new byte[8];
        this.e = new Stack();
        this.f = new lve();
    }
    
    public lvd(final byte[] array) {
        this.a = new byte[8];
        this.e = new ArrayDeque();
        this.f = new bvr();
    }
    
    public final long a(final lsh lsh, final int n) {
        final byte[] a = this.a;
        int i = 0;
        lsh.g(a, 0, n);
        long n2 = 0L;
        while (i < n) {
            n2 = (n2 << 8 | (long)(this.a[i] & 0xFF));
            ++i;
        }
        return n2;
    }
    
    public final long b(final btj btj, final int n) {
        final byte[] a = this.a;
        int i = 0;
        btj.k(a, 0, n);
        long n2 = 0L;
        while (i < n) {
            n2 = (n2 << 8 | (long)(this.a[i] & 0xFF));
            ++i;
        }
        return n2;
    }
}
