import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmy extends bpf
{
    private final long b;
    private final long d;
    private final boolean e;
    private final ArrayList f;
    private final azk g;
    private bmw h;
    private bmx i;
    private long j;
    private long k;
    
    public bmy(final bnx bnx, final long n, final long n2) {
        this(bnx, n, n2, true);
    }
    
    public bmy(final bnx bnx, final long b, final long d, final boolean b2) {
        super(bnx);
        dk.f(b >= 0L);
        this.b = b;
        this.d = d;
        this.e = true;
        this.f = new ArrayList();
        this.g = new azk();
    }
    
    private final void G(final azl azl) {
        final azk g = this.g;
        final int n = 0;
        azl.o(0, g);
        final long q = this.g.q;
        final bmw h = this.h;
        long k = Long.MIN_VALUE;
        long n2;
        long d;
        if (h != null && !this.f.isEmpty()) {
            final long j = this.j;
            if (this.d != Long.MIN_VALUE) {
                k = this.k - q;
            }
            n2 = j - q;
            d = k;
        }
        else {
            final long b = this.b;
            d = this.d;
            this.j = q + b;
            if (d != Long.MIN_VALUE) {
                k = q + d;
            }
            this.k = k;
            for (int size = this.f.size(), i = 0; i < size; ++i) {
                ((bmv)this.f.get(i)).k(this.j, this.k);
            }
            n2 = b;
        }
        try {
            ((bmr)this).y((azl)(this.h = new bmw(azl, n2, d)));
        }
        catch (final bmx l) {
            this.i = l;
            for (int n3 = n; n3 < this.f.size(); ++n3) {
                ((bmv)this.f.get(n3)).d = this.i;
            }
        }
    }
    
    protected final void b(final azl azl) {
        if (this.i != null) {
            return;
        }
        this.G(azl);
    }
    
    public final void sK() {
        final bmx i = this.i;
        if (i == null) {
            super.sK();
            return;
        }
        throw i;
    }
    
    public final void sM(final bnu bnu) {
        dk.h(this.f.remove(bnu));
        this.c.sM(((bmv)bnu).a);
        if (this.f.isEmpty()) {
            final bmw h = this.h;
            dk.d((Object)h);
            this.G(h.b);
        }
    }
    
    protected final void sN() {
        super.sN();
        this.i = null;
        this.h = null;
    }
    
    public final bnu sO(final ayx ayx, final bre bre, final long n) {
        final bmv bmv = new bmv(this.c.sO(ayx, bre, n), true, this.j, this.k);
        this.f.add(bmv);
        return (bnu)bmv;
    }
}
