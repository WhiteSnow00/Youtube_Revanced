import java.util.Collections;
import java.util.HashMap;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class boi extends bnc
{
    private static final ayu b;
    private final boolean c;
    private final bny[] d;
    private final azm[] e;
    private final ArrayList f;
    private int g;
    private long[][] h;
    private boh i;
    
    static {
        final ayj ayj = new ayj();
        ayj.c("MergingMediaSource");
        b = ayj.a();
    }
    
    public boi(final boolean b, final bny... array) {
        this(b, array, (byte[])null);
    }
    
    public boi(final boolean c, final bny[] d, final byte... array) {
        this.c = c;
        this.d = d;
        this.f = new ArrayList((Collection<? extends E>)Arrays.asList(d));
        this.g = -1;
        this.e = new azm[d.length];
        this.h = new long[0][];
        new HashMap();
        aefb.J(8, "expectedKeys");
        ((afhp)new afhm()).b().u();
    }
    
    protected final /* bridge */ void e(Object o, final bny bny, final azm azm) {
        final Integer n = (Integer)o;
        if (this.i == null) {
            int g;
            if (this.g == -1) {
                g = azm.b();
                this.g = g;
            }
            else {
                final int b = azm.b();
                g = this.g;
                if (b != g) {
                    this.i = new boh();
                    return;
                }
            }
            if (this.h.length == 0) {
                this.h = new long[g][this.e.length];
            }
            this.f.remove(bny);
            this.e[n] = azm;
            if (this.f.isEmpty()) {
                if (this.c) {
                    o = new azk();
                    for (int i = 0; i < this.g; ++i) {
                        final long n2 = -this.e[0].m(i, (azk)o).e;
                        int n3 = 1;
                        while (true) {
                            final azm[] e = this.e;
                            if (n3 >= e.length) {
                                break;
                            }
                            this.h[i][n3] = n2 - -e[n3].m(i, (azk)o).e;
                            ++n3;
                        }
                    }
                }
                ((bms)this).y(this.e[0]);
            }
        }
    }
    
    protected final /* bridge */ ayy k(final Object o, final ayy ayy) {
        if ((int)o == 0) {
            return ayy;
        }
        return null;
    }
    
    public final ayu sP() {
        final bny[] d = this.d;
        ayu ayu;
        if (d.length > 0) {
            ayu = d[0].sP();
        }
        else {
            ayu = boi.b;
        }
        return ayu;
    }
    
    public final void sQ() {
        final boh i = this.i;
        if (i == null) {
            super.sQ();
            return;
        }
        throw i;
    }
    
    protected final void sR(final bco bco) {
        super.sR(bco);
        for (int i = 0; i < this.d.length; ++i) {
            this.g((Object)i, this.d[i]);
        }
    }
    
    public final void sS(bnv a) {
        final bog bog = (bog)a;
        int n = 0;
        while (true) {
            final bny[] d = this.d;
            if (n >= d.length) {
                break;
            }
            final bny bny = d[n];
            final bnv bnv = a = bog.a[n];
            if (bnv instanceof boe) {
                a = ((boe)bnv).a;
            }
            bny.sS(a);
            ++n;
        }
    }
    
    protected final void sT() {
        super.sT();
        Arrays.fill(this.e, null);
        this.g = -1;
        this.i = null;
        this.f.clear();
        Collections.addAll(this.f, this.d);
    }
    
    public final bnv sU(final ayy ayy, final brf brf, final long n) {
        final int length = this.d.length;
        final bnv[] array = new bnv[length];
        final azm[] e = this.e;
        int i = 0;
        final int a = e[0].a(ayy.a);
        while (i < length) {
            array[i] = this.d[i].sU(ayy.b(this.e[i].f(a)), brf, n - this.h[a][i]);
            ++i;
        }
        return (bnv)new bog(this.h[a], array);
    }
}
