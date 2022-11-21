import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bpo implements btp
{
    private static final pbg j;
    public ayh[] a;
    private final btm b;
    private final int c;
    private final ayh d;
    private final SparseArray e;
    private boolean f;
    private bpq g;
    private long h;
    private bud i;
    
    static {
        j = new pbg((byte[])null, (byte[])null, (byte[])null);
    }
    
    public bpo(final btm b, final int c, final ayh d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new SparseArray();
    }
    
    public final bte a() {
        final bud i = this.i;
        if (i instanceof bte) {
            return (bte)i;
        }
        return null;
    }
    
    public final void b(final bpq g, final long n, final long h) {
        this.g = g;
        this.h = h;
        if (!this.f) {
            this.b.d((btp)this);
            if (n != -9223372036854775807L) {
                this.b.f(0L, n);
            }
            this.f = true;
            return;
        }
        final btm b = this.b;
        long n2 = n;
        if (n == -9223372036854775807L) {
            n2 = 0L;
        }
        b.f(0L, n2);
        for (int i = 0; i < this.e.size(); ++i) {
            ((bpn)this.e.valueAt(i)).g(g, h);
        }
    }
    
    public final void c() {
        this.b.e();
    }
    
    public final boolean d(final btn btn) {
        final int h = this.b.h(btn, bpo.j);
        bad.f(h != 1);
        return h == 0;
    }
    
    public final bug q(final int n, final int n2) {
        bpn bpn;
        if ((bpn = (bpn)this.e.get(n)) == null) {
            bad.f(this.a == null);
            ayh d;
            if (n2 == this.c) {
                d = this.d;
            }
            else {
                d = null;
            }
            bpn = new bpn(n, n2, d);
            bpn.g(this.g, this.h);
            this.e.put(n, (Object)bpn);
        }
        return (bug)bpn;
    }
    
    public final void r() {
        final ayh[] a = new ayh[this.e.size()];
        for (int i = 0; i < this.e.size(); ++i) {
            final ayh a2 = ((bpn)this.e.valueAt(i)).a;
            bad.c(a2);
            a[i] = a2;
        }
        this.a = a;
    }
    
    public final void x(final bud i) {
        this.i = i;
    }
}
