// 
// Decompiled by Procyon v0.6.0
// 

public final class cdu
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
    final /* synthetic */ cdv j;
    
    public cdu(final cdv j, final int a, final int b) {
        this.j = j;
        this.a = a;
        this.b = b;
        this.b();
    }
    
    public final int a() {
        return (this.e - this.d + 1) * (this.g - this.f + 1) * (this.i - this.h + 1);
    }
    
    final void b() {
        final cdv j = this.j;
        final int[] a = j.a;
        final int[] b = j.b;
        int i = this.a;
        int d = Integer.MAX_VALUE;
        int f = Integer.MAX_VALUE;
        int h = Integer.MAX_VALUE;
        int e = Integer.MIN_VALUE;
        int g = Integer.MIN_VALUE;
        int k = Integer.MIN_VALUE;
        int c = 0;
        while (i <= this.b) {
            final int n = a[i];
            final int n2 = c + b[n];
            final int d2 = cdv.d(n);
            final int c2 = cdv.c(n);
            final int b2 = cdv.b(n);
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
            d = n4;
            f = n6;
            h = n8;
            e = n3;
            g = n5;
            k = n7;
            c = n2;
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
