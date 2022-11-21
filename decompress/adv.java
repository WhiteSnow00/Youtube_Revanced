import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class adv
{
    int[] a;
    int[] b;
    int c;
    int[] d;
    float[] e;
    int f;
    int[] g;
    String[] h;
    int i;
    int[] j;
    boolean[] k;
    int l;
    
    public adv() {
        this.a = new int[10];
        this.b = new int[10];
        this.c = 0;
        this.d = new int[10];
        this.e = new float[10];
        this.f = 0;
        this.g = new int[5];
        this.h = new String[5];
        this.i = 0;
        this.j = new int[4];
        this.k = new boolean[4];
        this.l = 0;
    }
    
    final void a(final int n, final float n2) {
        final int f = this.f;
        final int[] d = this.d;
        final int length = d.length;
        if (f >= length) {
            this.d = Arrays.copyOf(d, length + length);
            final float[] e = this.e;
            final int length2 = e.length;
            this.e = Arrays.copyOf(e, length2 + length2);
        }
        final int[] d2 = this.d;
        final int f2 = this.f;
        d2[f2] = n;
        final float[] e2 = this.e;
        this.f = f2 + 1;
        e2[f2] = n2;
    }
    
    final void b(final int n, final int n2) {
        final int c = this.c;
        final int[] a = this.a;
        final int length = a.length;
        if (c >= length) {
            this.a = Arrays.copyOf(a, length + length);
            final int[] b = this.b;
            final int length2 = b.length;
            this.b = Arrays.copyOf(b, length2 + length2);
        }
        final int[] a2 = this.a;
        final int c2 = this.c;
        a2[c2] = n;
        final int[] b2 = this.b;
        this.c = c2 + 1;
        b2[c2] = n2;
    }
    
    final void c(final int n, final String s) {
        final int i = this.i;
        final int[] g = this.g;
        final int length = g.length;
        if (i >= length) {
            this.g = Arrays.copyOf(g, length + length);
            final String[] h = this.h;
            final int length2 = h.length;
            this.h = Arrays.copyOf(h, length2 + length2);
        }
        final int[] g2 = this.g;
        final int j = this.i;
        g2[j] = n;
        final String[] h2 = this.h;
        this.i = j + 1;
        h2[j] = s;
    }
    
    final void d(final int n, final boolean b) {
        final int l = this.l;
        final int[] j = this.j;
        final int length = j.length;
        if (l >= length) {
            this.j = Arrays.copyOf(j, length + length);
            final boolean[] k = this.k;
            final int length2 = k.length;
            this.k = Arrays.copyOf(k, length2 + length2);
        }
        final int[] i = this.j;
        final int m = this.l;
        i[m] = n;
        final boolean[] k2 = this.k;
        this.l = m + 1;
        k2[m] = b;
    }
}
