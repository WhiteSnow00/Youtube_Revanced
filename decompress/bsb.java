import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class bsb
{
    public long a;
    public long b;
    public final boolean[] c;
    private long d;
    private long e;
    private long f;
    private long g;
    private int h;
    
    public bsb() {
        this.c = new boolean[15];
    }
    
    public static int a(final long n) {
        return (int)(n % 15L);
    }
    
    public final long b() {
        final long g = this.g;
        if (g == 0L) {
            return 0L;
        }
        return this.b / g;
    }
    
    public final void c(final long n) {
        final long a = this.a;
        if (a == 0L) {
            this.d = n;
        }
        else if (a == 1L) {
            final long n2 = n - this.d;
            this.e = n2;
            this.b = n2;
            this.g = 1L;
        }
        else {
            final long n3 = n - this.f;
            final long e = this.e;
            final int a2 = a(a);
            if (Math.abs(n3 - e) <= 1000000L) {
                ++this.g;
                this.b += n3;
                final boolean[] c = this.c;
                if (c[a2]) {
                    c[a2] = false;
                    --this.h;
                }
            }
            else {
                final boolean[] c2 = this.c;
                if (!c2[a2]) {
                    c2[a2] = true;
                    ++this.h;
                }
            }
        }
        ++this.a;
        this.f = n;
    }
    
    public final void d() {
        this.a = 0L;
        this.g = 0L;
        this.b = 0L;
        this.h = 0;
        Arrays.fill(this.c, false);
    }
    
    public final boolean e() {
        return this.a > 15L && this.h == 0;
    }
}
