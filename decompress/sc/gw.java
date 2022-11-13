import android.support.v7.widget.LinearLayoutManager;
import android.util.SparseIntArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gw
{
    final Class a;
    final int b;
    final hk c;
    final hj d;
    final int[] e;
    final int[] f;
    final int[] g;
    public boolean h;
    public int i;
    int j;
    int k;
    public final SparseIntArray l;
    public final jkn m;
    final bki n;
    final pvh o;
    private int p;
    private final hk q;
    private final hj r;
    
    public gw(final Class a, final bki n, final pvh o, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.e = new int[2];
        this.f = new int[2];
        this.g = new int[2];
        this.p = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = new SparseIntArray();
        final gu q = new gu(this);
        this.q = (hk)q;
        final gv r = new gv(this);
        this.r = (hj)r;
        this.a = a;
        this.b = 20;
        this.n = n;
        this.o = o;
        this.m = new jkn();
        this.c = (hk)new hf((hk)q);
        this.d = (hj)new hh((hj)r);
        this.a();
    }
    
    public final void a() {
        this.l.clear();
        final hj d = this.d;
        final int k = this.k + 1;
        this.k = k;
        ((hh)d).b(hi.b(1, k, (Object)null));
    }
    
    public final void b() {
        final pvh o = this.o;
        final int[] e = this.e;
        e[0] = ((LinearLayoutManager)((src)o.a).e).K();
        e[1] = ((LinearLayoutManager)((src)o.a).e).M();
        final int[] e2 = this.e;
        final int n = e2[0];
        final int n2 = e2[1];
        if (n <= n2) {
            if (n >= 0) {
                if (n2 >= this.i) {
                    return;
                }
                Label_0158: {
                    if (!this.h) {
                        this.p = 0;
                    }
                    else {
                        final int[] f = this.f;
                        if (n <= f[1]) {
                            final int n3 = f[0];
                            if (n3 <= n2) {
                                if (n < n3) {
                                    this.p = 1;
                                    break Label_0158;
                                }
                                if (n > n3) {
                                    this.p = 2;
                                }
                                break Label_0158;
                            }
                        }
                        this.p = 0;
                    }
                }
                final int[] f2 = this.f;
                f2[0] = n;
                f2[1] = n2;
                final int[] g = this.g;
                final int p = this.p;
                final int n4 = e2[1];
                final int n5 = e2[0];
                final int n6 = n4 - n5 + 1;
                int n7 = n6 / 2;
                int n8;
                if (p == 1) {
                    n8 = n6;
                }
                else {
                    n8 = n7;
                }
                final int n9 = n5 - n8;
                g[0] = n9;
                if (p == 2) {
                    n7 = n6;
                }
                g[1] = n4 + n7;
                g[0] = Math.min(e2[0], Math.max(n9, 0));
                final int[] g2 = this.g;
                g2[1] = Math.max(this.e[1], Math.min(g2[1], this.i - 1));
                final hj d = this.d;
                final int[] e3 = this.e;
                final int n10 = e3[0];
                final int n11 = e3[1];
                final int[] g3 = this.g;
                ((hh)d).b(hi.c(2, n10, n11, g3[0], g3[1], this.p, (Object)null));
            }
        }
    }
    
    public final boolean c() {
        return this.k != this.j;
    }
}
