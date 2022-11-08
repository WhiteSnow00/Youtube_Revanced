import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abga
{
    public String a;
    public abxq b;
    public abxj c;
    public aboz d;
    public abtw e;
    public boolean f;
    final Map g;
    public abgd h;
    final Map i;
    public abik j;
    public final aamd k;
    
    public abga(final aamd k, final byte[] array, final byte[] array2) {
        this.g = new HashMap();
        this.k = k;
        this.i = new HashMap();
    }
    
    public final void a(final asgt asgt) {
        final asib asib = new asib();
        asib.c(asgt.j(aajj.r(1)).al((asix)new abfy(this, 0)));
        asib.c(asgt.p().Z((asjc)aaza.g).al((asix)new abfy(this, 2)));
        asib.c(aajj.q(asgt, (aexg)abbn.e).j(aajj.r(1)).al((asix)new abfy(this, 3)));
        asib.c(aajj.p(asgt, (aexg)abbn.f).al((asix)new abfy(this, 4)));
    }
    
    public final void b() {
        this.j = null;
        this.f = false;
    }
    
    public final void c(final String s, String e, final long n, final boolean b, final boolean b2) {
        final abxp d = this.b.d(s);
        final abxp d2 = this.b.d(e);
        if (d != null && d2 != null && d.f != null) {
            final PlayerResponseModel f = d2.f;
            if (f != null) {
                final String k = f.K();
                final PlayerResponseModel f2 = d.f;
                final boolean d3 = this.d(s);
                long longValue = -1L;
                if (!d3) {
                    longValue = longValue;
                    if (this.g.containsKey(s)) {
                        longValue = this.g.get(s);
                    }
                }
                final aalq aalq = new aalq(s, e, k, this.a, n, longValue, b, b2, f2);
                this.c.az().tr((Object)aalq);
                e = aalq.e();
                if (aalq.i()) {
                    if (this.d(e)) {
                        final aboz d4 = this.d;
                        d4.f = true;
                        d4.k(aalq.b(), aalq.e(), aalq.c(), 0);
                        return;
                    }
                    if (!this.d(e)) {
                        final aboz d5 = this.d;
                        if (d5.f) {
                            d5.f = false;
                        }
                    }
                }
                else {
                    if (!this.d(aalq.e())) {
                        this.d.f = true;
                        return;
                    }
                    final aboz d6 = this.d;
                    if (d6.f) {
                        d6.l();
                        this.d.f = false;
                    }
                }
            }
        }
    }
    
    public final boolean d(final String s) {
        return s.equals(this.a);
    }
}
