import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class btb implements bua
{
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;
    
    public btb(final int[] b, final long[] c, final long[] d, final long[] e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        int length = b.length;
        this.a = length;
        if (length > 0) {
            --length;
            this.f = d[length] + e[length];
            return;
        }
        this.f = 0L;
    }
    
    public final long a() {
        return this.f;
    }
    
    public final bty b(final long n) {
        int d = this.d(n);
        final bub bub = new bub(this.e[d], this.c[d]);
        if (bub.b < n && d != this.a - 1) {
            final long[] e = this.e;
            ++d;
            return new bty(bub, new bub(e[d], this.c[d]));
        }
        return new bty(bub, bub);
    }
    
    public final boolean c() {
        return true;
    }
    
    public final int d(final long n) {
        return bax.av(this.e, n, true);
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String string = Arrays.toString(this.b);
        final String string2 = Arrays.toString(this.c);
        final String string3 = Arrays.toString(this.e);
        final String string4 = Arrays.toString(this.d);
        final StringBuilder sb = new StringBuilder("ChunkIndex(length=");
        sb.append(a);
        sb.append(", sizes=");
        sb.append(string);
        sb.append(", offsets=");
        sb.append(string2);
        sb.append(", timeUs=");
        sb.append(string3);
        sb.append(", durationsUs=");
        sb.append(string4);
        sb.append(")");
        return sb.toString();
    }
}
