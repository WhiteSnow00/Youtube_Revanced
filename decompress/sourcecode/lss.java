import java.util.concurrent.LinkedBlockingDeque;

// 
// Decompiled by Procyon v0.6.0
// 

final class lss
{
    public final lsr a;
    public final LinkedBlockingDeque b;
    public final lwg c;
    public long d;
    public long e;
    public int f;
    public final lwg g;
    public lzi h;
    public final argq i;
    
    public lss(final lwg g, final byte[] array) {
        this.g = g;
        this.a = new lsr();
        this.b = new LinkedBlockingDeque();
        this.i = new argq((char[])null, null);
        this.c = new lwg(32);
        this.f = 65536;
    }
    
    public final int a(final int n) {
        if (this.f == 65536) {
            this.f = 0;
            final lzi c = this.g.C();
            this.h = c;
            this.b.add(c);
        }
        return Math.min(n, 65536 - this.f);
    }
    
    public final void b(final long n) {
        for (int n2 = (int)(n - this.d) / 65536, i = 0; i < n2; ++i) {
            this.g.D(this.b.remove());
            this.d += 65536L;
        }
    }
    
    public final void c(long n, final byte[] array, final int n2) {
        int min;
        for (int i = 0; i < n2; i += min) {
            this.b(n);
            final int n3 = (int)(n - this.d);
            min = Math.min(n2 - i, 65536 - n3);
            System.arraycopy(this.b.peek().a, n3, array, i, min);
            n += min;
        }
    }
    
    public final void d() {
        this.b(this.a.a());
    }
    
    public final boolean e(final lrm lrm) {
        return this.a.d(lrm, this.i);
    }
}
