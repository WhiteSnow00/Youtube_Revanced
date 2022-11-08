import android.text.Spanned;
import android.view.View$OnClickListener;
import android.view.View;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gcy
{
    public final vax a;
    public acpf b;
    public gdf c;
    private final gda d;
    private wwv e;
    private FrameLayout f;
    private View g;
    
    public gcy(final vax a, final gda d) {
        this.d = d;
        this.a = a;
        this.e = wwv.k;
    }
    
    private final void k(final boolean b) {
        if (this.d.h()) {
            final gda d = this.d;
            if (d.b().h()) {
                d.d(b);
                final gcz gcz = (gcz)this.d.b().c();
                if (gcz.d.h()) {
                    ((actk)gcz.d.c()).a((Object)gcz, 3);
                }
                if (gcz.h == 2 && this.h()) {
                    this.c.b(false);
                }
            }
        }
    }
    
    public final void a() {
        this.k(false);
    }
    
    public final void b() {
        this.k(true);
    }
    
    public final void c(final FrameLayout f, final acpf b, final gdf c, final wwv e) {
        final FrameLayout f2 = this.f;
        if (f2 != null) {
            this.e(f2);
        }
        this.f = f;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d.e(f);
    }
    
    @Deprecated
    public final void d() {
        if (this.d.h()) {
            this.a();
        }
        this.f = null;
        this.b = null;
        this.c = null;
        this.g = null;
        this.e = wwv.k;
        this.d.f();
    }
    
    public final void e(final FrameLayout frameLayout) {
        if (frameLayout != this.f) {
            return;
        }
        this.d();
    }
    
    public final void f(final View g) {
        if (g == null) {
            return;
        }
        final gda d = this.d;
        if (d.c().h()) {
            ((View)d.c().c()).setAccessibilityTraversalBefore(g.getId());
            return;
        }
        this.g = g;
    }
    
    public final boolean g() {
        return this.b != null;
    }
    
    public final boolean h() {
        return this.c != null;
    }
    
    public final void i(final gcz gcz, final boolean b) {
        if (!this.g()) {
            return;
        }
        final gda d = this.d;
        final boolean b2 = gcz != d.b().f();
        if (d.h()) {
            if (!b2) {
                return;
            }
            this.a();
        }
        this.d.g(gcz, b);
        final gda d2 = this.d;
        if (d2.a().h()) {
            if (b2) {
                ((View)d2.a().c()).setOnClickListener((View$OnClickListener)new gbw(this, gcz, 2));
            }
            if (gcz.h == 2 && this.h()) {
                this.c.b(true);
            }
            if (gcz.d.h()) {
                ((actk)gcz.d.c()).mv((Object)gcz);
            }
            this.f(this.g);
            return;
        }
        throw new IllegalStateException("Click target is not available for pill");
    }
    
    public final gcz j(final aivy aivy) {
        acss a;
        if (aivy == null) {
            a = gcz.a();
        }
        else {
            final int b = aivy.b;
            int af = 4;
            if ((b & 0x4) != 0x0) {
                aivw aivw;
                if ((aivw = aivy.e) == null) {
                    aivw = aivw.a;
                }
                if ((af = aety.af(aivw.b)) == 0) {
                    af = 1;
                }
            }
            int ae;
            if ((aivy.b & 0x80) != 0x0) {
                aivx aivx;
                if ((aivx = aivy.g) == null) {
                    aivx = aivx.a;
                }
                if ((ae = aety.ae(aivx.c)) == 0) {
                    ae = 1;
                }
            }
            else {
                ae = 5;
            }
            akbe f = akbe.cU;
            if ((aivy.b & 0x2) != 0x0) {
                akbf akbf;
                if ((akbf = aivy.d) == null) {
                    akbf = akbf.a;
                }
                if ((f = akbe.b(akbf.c)) == null) {
                    f = akbe.a;
                }
            }
            final acss a2 = gcz.a();
            final int b2 = aivy.b;
            final Object o = null;
            ajsq ajsq;
            if ((b2 & 0x1) != 0x0) {
                if ((ajsq = aivy.c) == null) {
                    ajsq = ajsq.a;
                }
            }
            else {
                ajsq = null;
            }
            final Spanned b3 = abyh.b(ajsq);
            if (b3 == null) {
                throw new NullPointerException("Null text");
            }
            a2.d = b3;
            a2.a = af;
            a2.b = ae;
            if (f == null) {
                throw new NullPointerException("Null iconType");
            }
            a2.f = f;
            Object o2 = o;
            if ((aivy.b & 0x200) != 0x0 && (o2 = aivy.h) == null) {
                o2 = aioe.a;
            }
            a2.h = aexq.j(o2);
            aoqe aoqe;
            if ((aivy.b & 0x400) != 0x0) {
                if ((aoqe = aivy.i) == null) {
                    aoqe = aoqe.a;
                }
            }
            else {
                aoqe = aoqe.a;
            }
            a2.f(aoqe);
            int ag;
            if ((ag = aety.ag(aivy.j)) == 0) {
                ag = 1;
            }
            a2.c = ag;
            a = a2;
        }
        final wwv e = this.e;
        wws wws;
        if ((aivy.b & 0x10) != 0x0) {
            wws = new wws(aivy.f);
        }
        else {
            wws = new wws(wya.c(25067));
        }
        a.i = aexq.j(new inb((wxz)wws, e, 1));
        a.g = aexq.j(new gbw((wxz)wws, e, 3));
        final Object d = a.d;
        if (d != null) {
            final Object f2 = a.f;
            if (f2 != null) {
                final int b4 = a.b;
                if (b4 != 0) {
                    final int a3 = a.a;
                    if (a3 != 0) {
                        final Object e2 = a.e;
                        if (e2 != null) {
                            final int c = a.c;
                            if (c != 0) {
                                return new gcz((CharSequence)d, (akbe)f2, b4, a3, (aexq)a.h, (aexq)a.i, (aexq)a.g, (aoqe)e2, c);
                            }
                        }
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (a.d == null) {
            sb.append(" text");
        }
        if (a.f == null) {
            sb.append(" iconType");
        }
        if (a.b == 0) {
            sb.append(" position");
        }
        if (a.a == 0) {
            sb.append(" behavior");
        }
        if (a.e == null) {
            sb.append(" colorPalette");
        }
        if (a.c == 0) {
            sb.append(" presentationStyle");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
