import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kse implements adjd
{
    public final Map a;
    private final Executor b;
    private final Runnable c;
    private final /* synthetic */ int d;
    private final hdv e;
    
    public kse(final hdv e, final Executor b, final Runnable c, final int d, final byte[] array) {
        this.d = d;
        this.a = new HashMap();
        this.e = e;
        this.b = b;
        this.c = c;
        tcp.k(e.c(), b, (tcn)jbz.o, (tco)new jor(this, 9));
    }
    
    public kse(final hdv e, final Executor b, final Runnable c, final int d, final byte[] array, final byte[] array2) {
        this.d = d;
        this.a = new HashMap();
        this.e = e;
        this.b = b;
        this.c = c;
        tcp.k(e.c(), b, (tcn)jbz.n, (tco)new jor(this, 8, (byte[])null));
    }
    
    public final void h(final adku adku) {
        if (this.d != 0) {
            this.a.put(adku.k, adku);
            return;
        }
        this.a.put(adku.k, adku);
    }
    
    public final void k(final String s, final boolean b) {
        if (this.d != 0) {
            final adku adku = this.a.get(s);
            if (adku != null) {
                adks adks;
                if ((adks = adks.a(adku.l)) == null) {
                    adks = adks.a;
                }
                if (adks == adks.d) {
                    this.b.execute(this.c);
                }
            }
            return;
        }
        final adku adku2 = this.a.get(s);
        if (adku2 != null) {
            adks adks2;
            if ((adks2 = adks.a(adku2.l)) == null) {
                adks2 = adks.a;
            }
            if (adks2 == adks.d) {
                this.b.execute(this.c);
            }
        }
    }
}
