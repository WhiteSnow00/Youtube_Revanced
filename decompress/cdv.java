// 
// Decompiled by Procyon v0.6.0
// 

public final class cdv
{
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    final cdw j;
    
    public cdv(final cdw j, final int a, final int b) {
        this.j = j;
        this.a = a;
        this.b = b;
        this.b();
    }
    
    public final int a() {
        return (this.e - this.d + 1) * (this.g - this.f + 1) * (this.i - this.h + 1);
    }
    
    final void b() {
        final cdw j = this.j;
        final int[] a = j.a;
        final int[] b = j.b;
        int i = this.a;
        int c = 0;
        int e = Integer.MIN_VALUE;
        int g = Integer.MIN_VALUE;
        int k = Integer.MIN_VALUE;
        int d = Integer.MAX_VALUE;
        int f = Integer.MAX_VALUE;
        int h = Integer.MAX_VALUE;
        while (i <= this.b) {
            final int n = a[i];
            final int n2 = c + b[n];
            final int d2 = cdw.d(n);
            final int c2 = cdw.c(n);
            final int b2 = cdw.b(n);
            int n3;
            if (d2 > (n3 = e)) {
                n3 = d2;
            }
            int n4;
            if (d2 < (n4 = d)) {
                n4 = d2;
            }
            int n5;
            if (c2 > (n5 = g)) {
                n5 = c2;
            }
            int n6;
            if (c2 < (n6 = f)) {
                n6 = c2;
            }
            int n7;
            if (b2 > (n7 = k)) {
                n7 = b2;
            }
            int n8;
            if (b2 < (n8 = h)) {
                n8 = b2;
            }
            ++i;
            c = n2;
            e = n3;
            g = n5;
            k = n7;
            d = n4;
            f = n6;
            h = n8;
        }
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = k;
        this.c = c;
    }
    
    final boolean c() {
        return this.b + 1 - this.a > 1;
    }
}
