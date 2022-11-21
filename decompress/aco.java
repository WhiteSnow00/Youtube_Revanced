import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aco implements Comparable
{
    public static int a = 1;
    public boolean b;
    public int c;
    int d;
    public int e;
    public float f;
    public boolean g;
    final float[] h;
    final float[] i;
    ack[] j;
    int k;
    public int l;
    boolean m;
    int n;
    
    public aco(final int n) {
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.g = false;
        this.h = new float[9];
        this.i = new float[9];
        this.j = new ack[16];
        this.k = 0;
        this.l = 0;
        this.m = false;
        this.n = n;
    }
    
    public final void a(final ack ack) {
        int n = 0;
        while (true) {
            final int k = this.k;
            if (n >= k) {
                final ack[] j = this.j;
                final int length = j.length;
                if (k >= length) {
                    this.j = Arrays.copyOf(j, length + length);
                }
                final ack[] i = this.j;
                final int l = this.k;
                i[l] = ack;
                this.k = l + 1;
                return;
            }
            if (this.j[n] == ack) {
                return;
            }
            ++n;
        }
    }
    
    public final void b(final ack ack) {
        for (int k = this.k, i = 0; i < k; ++i) {
            if (this.j[i] == ack) {
                while (i < k - 1) {
                    final ack[] j = this.j;
                    final int n = i + 1;
                    j[i] = j[n];
                    i = n;
                }
                --this.k;
                return;
            }
        }
    }
    
    public final void c() {
        this.n = 5;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        this.m = false;
        for (int k = this.k, i = 0; i < k; ++i) {
            this.j[i] = null;
        }
        this.k = 0;
        this.l = 0;
        this.b = false;
        Arrays.fill(this.i, 0.0f);
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        return this.c - ((aco)o).c;
    }
    
    public final void d(final acl acl, final float f) {
        this.f = f;
        this.g = true;
        this.m = false;
        final int k = this.k;
        this.d = -1;
        for (int i = 0; i < k; ++i) {
            this.j[i].c(acl, this, false);
        }
        this.k = 0;
    }
    
    public final void e(final acl acl, final ack ack) {
        for (int k = this.k, i = 0; i < k; ++i) {
            this.j[i].d(acl, ack, false);
        }
        this.k = 0;
    }
    
    @Override
    public final String toString() {
        final int c = this.c;
        final StringBuilder sb = new StringBuilder("");
        sb.append(c);
        return sb.toString();
    }
}
