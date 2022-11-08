import java.io.IOException;
import java.util.List;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

final class dgb implements dez, dey
{
    public final dfa a;
    public final dey b;
    public volatile Object c;
    public volatile dex d;
    private volatile int e;
    private volatile dew f;
    private volatile alm g;
    
    public dgb(final dfa a, final dey b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        final alm g = this.g;
        if (g != null) {
            ((ddx)g.b).lq();
        }
    }
    
    public final void b(final ddj ddj, final Exception ex, final ddx ddx, final int n) {
        this.b.b(ddj, ex, ddx, ((ddx)this.g.b).g());
    }
    
    public final boolean c() {
        final Object c = this.c;
        boolean b = false;
        Label_0301: {
            if (c != null) {
                final Object c2 = this.c;
                this.c = null;
                try {
                    dpb.b();
                    boolean b2 = false;
                    Label_0281: {
                        try {
                            final ddz a = this.a.c.a().a(c2);
                            final Object a2 = a.a();
                            final ddb s = this.a.c.a().h.s((Class)a2.getClass());
                            if (s != null) {
                                final alm alm = new alm(s, a2, this.a.h);
                                final Object a3 = this.g.a;
                                final dfa a4 = this.a;
                                final dex d = new dex((ddj)a3, a4.m);
                                final dgv d2 = a4.d();
                                d2.b((ddj)d, alm);
                                if (d2.a((ddj)d) != null) {
                                    this.d = d;
                                    this.f = new dew(Collections.singletonList(this.g.a), this.a, (dey)this);
                                    ((ddx)this.g.b).d();
                                    break Label_0301;
                                }
                                try {
                                    this.b.d((ddj)this.g.a, a.a(), (ddx)this.g.b, ((ddx)this.g.b).g(), (ddj)this.g.a);
                                    return true;
                                }
                                finally {
                                    break Label_0281;
                                }
                            }
                            throw new dce((Class)a2.getClass());
                        }
                        finally {
                            b2 = false;
                        }
                    }
                    if (!b2) {
                        ((ddx)this.g.b).d();
                    }
                }
                catch (final IOException ex) {}
            }
        }
        if (this.f != null && this.f.c()) {
            return true;
        }
        this.f = null;
        this.g = null;
        while (!b && this.e < this.a.f().size()) {
            this.g = this.a.f().get(this.e++);
            if (this.g != null && (this.a.o.c(((ddx)this.g.b).g()) || this.a.h(((ddx)this.g.b).a()))) {
                ((ddx)this.g.b).f(this.a.n, (ddw)new dga(this, this.g, null, null));
                b = true;
            }
        }
        return b;
    }
    
    public final void d(final ddj ddj, final Object o, final ddx ddx, final int n, final ddj ddj2) {
        this.b.d(ddj, o, ddx, ((ddx)this.g.b).g(), ddj);
    }
    
    final boolean e(final alm alm) {
        final alm g = this.g;
        return g != null && g == alm;
    }
}
