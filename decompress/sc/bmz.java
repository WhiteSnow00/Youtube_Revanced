import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmz extends bpg
{
    private final long b;
    private final long d;
    private final boolean e;
    private final ArrayList f;
    private final azl g;
    private bmx h;
    private bmy i;
    private long j;
    private long k;
    
    public bmz(final bny bny, final long n, final long n2) {
        this(bny, n, n2, true);
    }
    
    public bmz(final bny bny, final long b, final long d, final boolean b2) {
        super(bny);
        dk.f(b >= 0L);
        this.b = b;
        this.d = d;
        this.e = true;
        this.f = new ArrayList();
        this.g = new azl();
    }
    
    private final void G(final azm azm) {
        final azl g = this.g;
        final int n = 0;
        azm.o(0, g);
        final long q = this.g.q;
        final bmx h = this.h;
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
                ((bmw)this.f.get(i)).k(this.j, this.k);
            }
            n2 = b;
        }
        try {
            ((bms)this).y((azm)(this.h = new bmx(azm, n2, d)));
        }
        catch (final bmy l) {
            this.i = l;
            for (int n3 = n; n3 < this.f.size(); ++n3) {
                ((bmw)this.f.get(n3)).d = this.i;
            }
        }
    }
    
    protected final void b(final azm azm) {
        if (this.i != null) {
            return;
        }
        this.G(azm);
    }
    
    public final void sQ() {
        final bmy i = this.i;
        if (i == null) {
            super.sQ();
            return;
        }
        throw i;
    }
    
    public final void sS(final bnv bnv) {
        dk.h(this.f.remove(bnv));
        this.c.sS(((bmw)bnv).a);
        if (this.f.isEmpty()) {
            final bmx h = this.h;
            dk.d((Object)h);
            this.G(h.b);
        }
    }
    
    protected final void sT() {
        super.sT();
        this.i = null;
        this.h = null;
    }
    
    public final bnv sU(final ayy ayy, final brf brf, final long n) {
        final bmw bmw = new bmw(this.c.sU(ayy, brf, n), true, this.j, this.k);
        this.f.add(bmw);
        return (bnv)bmw;
    }
}
