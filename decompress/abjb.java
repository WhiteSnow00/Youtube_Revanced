import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abjb
{
    public String a;
    public acbc b;
    public acav c;
    public absl d;
    public abxj e;
    public boolean f;
    public final Map g;
    public abjf h;
    public final Map i;
    public ablj j;
    public final abwe k;
    
    public abjb(final abwe k, final byte[] array, final byte[] array2) {
        this.g = new HashMap();
        this.k = k;
        this.i = new HashMap();
    }
    
    public final void a(final aske aske) {
        final aslm aslm = new aslm();
        aslm.c(aske.j(aana.q(1)).am((asmi)new abgi(this, 11)));
        aslm.c(aske.p().Z(aaqs.o).am((asmi)new abgi(this, 12)));
        aslm.c(aana.p(aske, (afax)abej.h).j(aana.q(1)).am((asmi)new abgi(this, 13)));
        aslm.c(aana.o(aske, (afax)abej.i).am((asmi)new abgi(this, 14)));
    }
    
    public final void b() {
        this.j = null;
        this.f = false;
    }
    
    public final void c(final String s, String e, final long n, final boolean b, final boolean b2) {
        final acbb d = this.b.d(s);
        final acbb d2 = this.b.d(e);
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
                final aaph aaph = new aaph(s, e, k, this.a, n, longValue, b, b2, f2);
                this.c.az().tt(aaph);
                e = aaph.e();
                if (aaph.i()) {
                    if (this.d(e)) {
                        final absl d4 = this.d;
                        d4.f = true;
                        d4.k(aaph.b(), aaph.e(), aaph.c(), 0);
                        return;
                    }
                    if (!this.d(e)) {
                        final absl d5 = this.d;
                        if (d5.f) {
                            d5.f = false;
                        }
                    }
                }
                else {
                    if (!this.d(aaph.e())) {
                        this.d.f = true;
                        return;
                    }
                    final absl d6 = this.d;
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
