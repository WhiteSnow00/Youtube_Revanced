import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bpk implements btl
{
    private static final ozg j;
    public ayf[] a;
    private final bti b;
    private final int c;
    private final ayf d;
    private final SparseArray e;
    private boolean f;
    private bpm g;
    private long h;
    private btz i;
    
    static {
        j = new ozg(null, null, null);
    }
    
    public bpk(final bti b, final int c, final ayf d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new SparseArray();
    }
    
    public final bta a() {
        final btz i = this.i;
        if (i instanceof bta) {
            return (bta)i;
        }
        return null;
    }
    
    public final void b(final bpm g, final long n, final long h) {
        this.g = g;
        this.h = h;
        if (!this.f) {
            this.b.d((btl)this);
            if (n != -9223372036854775807L) {
                this.b.f(0L, n);
            }
            this.f = true;
            return;
        }
        final bti b = this.b;
        long n2 = n;
        if (n == -9223372036854775807L) {
            n2 = 0L;
        }
        b.f(0L, n2);
        for (int i = 0; i < this.e.size(); ++i) {
            ((bpj)this.e.valueAt(i)).g(g, h);
        }
    }
    
    public final void c() {
        this.b.e();
    }
    
    public final boolean d(final btj btj) {
        final int h = this.b.h(btj, bpk.j);
        dk.h(h != 1);
        return h == 0;
    }
    
    public final buc q(final int n, final int n2) {
        bpj bpj;
        if ((bpj = (bpj)this.e.get(n)) == null) {
            dk.h(this.a == null);
            ayf d;
            if (n2 == this.c) {
                d = this.d;
            }
            else {
                d = null;
            }
            bpj = new bpj(n, n2, d);
            bpj.g(this.g, this.h);
            this.e.put(n, (Object)bpj);
        }
        return (buc)bpj;
    }
    
    public final void r() {
        final ayf[] a = new ayf[this.e.size()];
        for (int i = 0; i < this.e.size(); ++i) {
            final ayf a2 = ((bpj)this.e.valueAt(i)).a;
            dk.e((Object)a2);
            a[i] = a2;
        }
        this.a = a;
    }
    
    public final void x(final btz i) {
        this.i = i;
    }
}
