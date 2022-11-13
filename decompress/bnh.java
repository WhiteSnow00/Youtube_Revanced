import android.os.Handler$Callback;
import android.util.Pair;
import android.os.Handler;
import java.util.IdentityHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bnh extends bnc
{
    public boolean b;
    private final ayu c;
    private final afeq d;
    private final IdentityHashMap e;
    private Handler f;
    
    public bnh(final ayu c, final afeq d) {
        this.c = c;
        this.d = d;
        this.e = new IdentityHashMap();
    }
    
    public static Object G(final int n, final Object o) {
        return Pair.create((Object)n, o);
    }
    
    private final void H() {
        int n = 0;
        while (true) {
            final afeq d = this.d;
            if (n >= ((afih)d).c) {
                break;
            }
            final bng bng = (bng)d.get(n);
            if (bng.d == 0) {
                final eg eg = super.a.get(bng.b);
                dk.d((Object)eg);
                ((bny)eg.b).t((bnx)eg.d);
            }
            ++n;
        }
    }
    
    private final void I() {
        if (!this.b) {
            final Handler f = this.f;
            dk.d((Object)f);
            f.obtainMessage(0).sendToTarget();
            this.b = true;
        }
    }
    
    public static int b(final Object o) {
        return (int)((Pair)o).first;
    }
    
    public static Object o(final Object o) {
        return ((Pair)o).second;
    }
    
    protected final /* bridge */ int d(final Object o, final int n) {
        final Integer n2 = (Integer)o;
        return 0;
    }
    
    protected final void e(final Object o, final bny bny, final azm azm) {
        final Integer n = (Integer)o;
        this.I();
    }
    
    protected final ayy k(final Object o, final ayy ayy) {
        final Integer n = (Integer)o;
        if (n != (int)(ayy.d % ((afih)this.d).c)) {
            return null;
        }
        return ayy.b(G(n, ayy.a)).c(ayy.d / ((afih)this.d).c);
    }
    
    public final bnf n() {
        final azl azl = new azl();
        final azk azk = new azk();
        final afel d = afeq.d();
        final afel d2 = afeq.d();
        final afel d3 = afeq.d();
        int n = 0;
        boolean b = true;
        int n2 = 0;
        long n3 = 0L;
        Object d4 = null;
        int n4 = 0;
        boolean b2 = true;
        boolean b3 = false;
        long n5 = 0L;
        long m = 0L;
        while (true) {
            final afeq d5 = this.d;
            if (n >= ((afih)d5).c) {
                final ayu c = this.c;
                final afeq g = d.g();
                final afeq g2 = d2.g();
                final afeq g3 = d3.g();
                if (!b) {
                    d4 = null;
                }
                return new bnf(c, g, g2, g3, b2, b3, n5, m, d4);
            }
            final bng bng = (bng)d5.get(n);
            final bnq b4 = bng.a.b;
            dk.g(((azm)b4).p() ^ true, (Object)"Can't concatenate empty child Timeline.");
            d.h((Object)b4);
            d2.h((Object)n2);
            final int n6 = n2 + ((azm)b4).b();
            boolean b5;
            int n8;
            for (int i = 0; i < ((azm)b4).c(); i = n8 + 1, n4 = 1, b = b5) {
                ((azm)b4).o(i, azl);
                if (n4 == 0) {
                    d4 = azl.d;
                }
                b5 = (b && bax.aa(d4, azl.d));
                long n7;
                if ((n7 = azl.n) == -9223372036854775807L) {
                    n7 = bng.c;
                    if (n7 == -9223372036854775807L) {
                        return null;
                    }
                }
                n5 += n7;
                if (bng.b == 0 && i == 0) {
                    m = azl.m;
                    n3 = -azl.q;
                    n8 = 0;
                }
                else {
                    dk.g(azl.q == 0L, (Object)"Can't concatenate windows. A window has a non-zero offset in a period.");
                    n8 = i;
                }
                b2 &= (azl.h || azl.l);
                b3 |= azl.i;
            }
            final int b6 = ((azm)b4).b();
            int j = 0;
            n2 = n6;
            while (j < b6) {
                d3.h((Object)n3);
                ((azm)b4).m(j, azk);
                long d6 = azk.d;
                if (d6 == -9223372036854775807L) {
                    dk.g(b6 == 1, (Object)"Can't concatenate multiple periods with unknown duration in one window.");
                    long n9;
                    if ((n9 = azl.n) == -9223372036854775807L) {
                        n9 = bng.c;
                    }
                    d6 = n9 + azl.q;
                }
                n3 += d6;
                ++j;
            }
            ++n;
        }
    }
    
    public final azm p() {
        return (azm)this.n();
    }
    
    public final ayu sP() {
        return this.c;
    }
    
    protected final void sR(final bco bco) {
        super.sR(bco);
        int n = 0;
        this.f = new Handler((Handler$Callback)new bne(this, 0));
        while (true) {
            final afeq d = this.d;
            if (n >= ((afih)d).c) {
                break;
            }
            this.g((Object)n, (bny)((bng)d.get(n)).a);
            ++n;
        }
        this.I();
    }
    
    public final void sS(final bnv bnv) {
        final bng bng = this.e.remove(bnv);
        dk.d((Object)bng);
        ((bpg)bng.a).sS(bnv);
        --bng.d;
        if (!this.e.isEmpty()) {
            this.H();
        }
    }
    
    protected final void sT() {
        super.sT();
        final Handler f = this.f;
        if (f != null) {
            f.removeCallbacksAndMessages((Object)null);
            this.f = null;
        }
        this.b = false;
    }
    
    public final bnv sU(final ayy ayy, final brf brf, final long n) {
        final bng bng = (bng)this.d.get(b(ayy.a));
        final ayy b = ayy.b(o(ayy.a));
        final long d = ayy.d;
        final int c = ((afih)this.d).c;
        final int b2 = bng.b;
        final ayy c2 = b.c(d * c + b2);
        final eg eg = super.a.get(b2);
        dk.d((Object)eg);
        ((bny)eg.b).v((bnx)eg.d);
        ++bng.d;
        final bnp g = bng.a.G(c2, brf, n);
        this.e.put(g, bng);
        this.H();
        return (bnv)g;
    }
    
    protected final void w() {
    }
}
