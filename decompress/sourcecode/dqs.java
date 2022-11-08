import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqs extends ardf
{
    public long[] a;
    int b;
    private long c;
    
    public dqs() {
        super("stsz");
        this.a = new long[0];
    }
    
    protected final long h() {
        int n;
        if (this.c == 0L) {
            n = this.a.length * 4;
        }
        else {
            n = 0;
        }
        return n + 12;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        this.c = clm.w(byteBuffer);
        final int q = aqqm.q(clm.w(byteBuffer));
        this.b = q;
        if (this.c == 0L) {
            this.a = new long[q];
            for (int i = 0; i < this.b; ++i) {
                this.a[i] = clm.w(byteBuffer);
            }
        }
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        clm.m(byteBuffer, this.c);
        if (this.c == 0L) {
            clm.m(byteBuffer, (long)this.a.length);
            final long[] a = this.a;
            for (int length = a.length, i = 0; i < length; ++i) {
                clm.m(byteBuffer, a[i]);
            }
            return;
        }
        clm.m(byteBuffer, (long)this.b);
    }
    
    public final long k() {
        int n;
        if (this.c > 0L) {
            n = this.b;
        }
        else {
            n = this.a.length;
        }
        return n;
    }
    
    public final long l(final int n) {
        final long c = this.c;
        if (c > 0L) {
            return c;
        }
        return this.a[n];
    }
    
    public final String toString() {
        final long c = this.c;
        final long k = this.k();
        final StringBuilder sb = new StringBuilder(79);
        sb.append("SampleSizeBox[sampleSize=");
        sb.append(c);
        sb.append(";sampleCount=");
        sb.append(k);
        sb.append("]");
        return sb.toString();
    }
}
