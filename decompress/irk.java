import java.util.Map;
import android.util.LruCache;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irk implements irx, fxv, fjq, abps
{
    public boolean a;
    public boolean b;
    public abke c;
    private final atke d;
    private final fjv e;
    private final fjr f;
    private final abpu g;
    private final asiq h;
    private final auda i;
    
    public irk(final auda i, final atke d, final fjv e, final fjr f, final abpu g, final byte[] array, final byte[] array2) {
        this.i = i;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = new asiq();
    }
    
    @Override
    public final void a() {
        this.h.b();
        this.b();
    }
    
    @Override
    public final void b() {
        final elx e = this.f.e();
        if (!this.a && this.e.j().d() && e != null && !TextUtils.isEmpty((CharSequence)e.d())) {
            if (this.c != null) {
                final String d = e.d();
                final fon l = this.i.l(d);
                final abke c = this.c;
                final abke f = abke.f;
                long n = 0L;
                if (c == f) {
                    final auda i = this.i;
                    if (l != null) {
                        n = l.a;
                    }
                    i.n(d, n);
                    return;
                }
                final abke c2 = this.c;
                if (c2 != null && c2.c(abke.i)) {
                    if (l != null) {
                        n = l.a;
                    }
                    final long k = ((abpq)this.d.a()).k();
                    final long j = ((abpq)this.d.a()).j();
                    if (Math.abs(n - k) >= 500L) {
                        if (!this.b && k >= j) {
                            final auda m = this.i;
                            ((Map<Object, Object>)m.b).remove(d);
                            ((LruCache)m.d).remove((Object)d);
                            ((tgd)m.c).f((Object)new foo(d, (fon)null));
                            return;
                        }
                        this.i.n(d, k);
                    }
                }
            }
        }
    }
    
    @Override
    public final void c() {
        this.h.f(this.lX(this.g));
    }
    
    @Override
    public final asir[] lX(final abpu abpu) {
        final asir an = ((ashi)abpu.p().b).an((asjm)new ihl(this, 13), (asjm)hot.p);
        final asir an2 = ((ashi)abpu.p().l).an((asjm)new ihl(this, 14), (asjm)hot.p);
        asir asir;
        if (((vai)abpu.ci().g).bw()) {
            asir = ((ashi)abpu.cc().a).an((asjm)new ihl(this, 15), (asjm)hot.p);
        }
        else {
            asir = abpu.cc().c().an((asjm)new ihl(this, 15), (asjm)hot.p);
        }
        return new asir[] { an, an2, asir };
    }
    
    @Override
    public final void pd(final elx elx) {
        if (elx != null) {
            return;
        }
        this.b = false;
        this.c = null;
    }
}
