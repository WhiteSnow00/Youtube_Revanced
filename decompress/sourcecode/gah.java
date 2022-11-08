import android.view.ViewGroup$MarginLayoutParams;
import java.util.Iterator;
import java.util.Map;
import j$.util.Map$_EL;
import java.util.EnumSet;
import android.view.View;
import android.content.Context;
import android.view.ContextThemeWrapper;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gah implements gau
{
    public final toa a;
    public boolean b;
    public BottomUiContainer c;
    public gav d;
    public final agmd e;
    private final asib h;
    private final ggs i;
    private final gko j;
    private final uyi k;
    private final adff l;
    private final hyr m;
    private final cya n;
    private final fzo o;
    
    public gah(final uyf uyf, final fzo fzo, final toa a, final fzo o, final ggs i, final hyr m, final gko j, final cya n, final uyi k, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.b = false;
        final ains b = uyf.b();
        long g = 0L;
        Label_0101: {
            if (b != null) {
                amga amga;
                if ((amga = b.i) == null) {
                    amga = amga.a;
                }
                if ((amga.b & 0x8000) != 0x0) {
                    amga amga2;
                    if ((amga2 = b.i) == null) {
                        amga2 = amga.a;
                    }
                    anje anje;
                    if ((anje = amga2.l) == null) {
                        anje = anje.a;
                    }
                    g = anje.b;
                    break Label_0101;
                }
            }
            g = gah.g;
        }
        this.l = fzo.ad("rate_limit_promo_last_allowed", g, TimeUnit.SECONDS);
        this.e = new agmd((byte[])null, (byte[])null);
        this.h = new asib();
        this.m = m;
        this.i = i;
        this.o = o;
        this.a = a;
        this.j = j;
        this.n = n;
        this.k = k;
    }
    
    public final int a() {
        final gav d = this.d;
        if (d != null) {
            return d.a();
        }
        return 0;
    }
    
    public final BottomUiContainer b() {
        return this.c;
    }
    
    public final gav c() {
        return this.d;
    }
    
    public final void d(final boolean b) {
        if (b) {
            this.k(0);
            return;
        }
        this.j(this.a());
    }
    
    public final void e(final boolean b) {
        final int a = this.a();
        if (a == 1) {
            if (!b) {
                return;
            }
        }
        else if (a == 0) {
            return;
        }
        this.c.j(3);
    }
    
    public final void f(final BottomUiContainer c) {
        if (this.b) {
            return;
        }
        this.b = true;
        c.getClass();
        this.c = c;
        c.d = Optional.of((Object)this.k);
        this.c.e = Optional.of((Object)this.o);
        if (c.getContext() != null) {
            if (this.k.aT() && this.k.aU()) {
                final BottomUiContainer c2 = this.c;
                final Context context = c.getContext();
                int n;
                if (this.j.a() == gkm.b) {
                    n = 2132084533;
                }
                else {
                    n = 2132084540;
                }
                c2.m((Context)new ContextThemeWrapper(context, n));
            }
            else {
                final BottomUiContainer c3 = this.c;
                final Context context2 = c.getContext();
                int n2;
                if (this.j.a() == gkm.b) {
                    n2 = 2132084532;
                }
                else {
                    n2 = 2132084539;
                }
                c3.m((Context)new ContextThemeWrapper(context2, n2));
            }
        }
        if (this.n.j()) {
            iba.d((View)c, (Runnable)tg.b);
        }
        else {
            final asib h = this.h;
            final BottomUiContainer c4 = this.c;
            h.c(this.a.c().al((asix)new hoq(this, ((View)c4).getPaddingLeft(), ((View)c4).getPaddingTop(), ((View)c4).getPaddingRight(), ((View)c4).getPaddingBottom(), 1)));
        }
        this.h.c(((ggs)this.m.a).i().W((asjc)gkj.o).z().aB((asix)new fqq(this, 20)));
        this.h.c(((asgt)this.e.a).al((asix)new gag(this, 1)));
        this.h.c(this.i.i().aB((asix)new gag(this, 0)));
    }
    
    public final void g(final gav gav) {
        this.j(gav.a());
    }
    
    public final void h() {
        this.d = null;
    }
    
    public final void i(final gav d) {
        this.d = d;
        if (d.b()) {
            this.l.b();
        }
        this.j(this.a());
    }
    
    public final void j(int b) {
        if (b != 0) {
            if (b != 1) {
                final agmd e = this.e;
                final EnumSet<fxr> of = EnumSet.of(fxr.b, fxr.f, fxr.e);
                b = e.b;
                final Iterator<Object> iterator = of.iterator();
                while (iterator.hasNext()) {
                    b -= (int)Map$_EL.getOrDefault((Map)e.c, (Object)iterator.next(), (Object)0);
                }
                this.k(b);
                return;
            }
            final agmd e2 = this.e;
            this.k(e2.b - (int)Map$_EL.getOrDefault((Map)e2.c, (Object)fxr.b, (Object)0));
        }
    }
    
    public final void k(final int n) {
        if (this.b) {
            final BottomUiContainer c = this.c;
            if (c != null) {
                if (c.getLayoutParams() instanceof ViewGroup$MarginLayoutParams && ((ViewGroup$MarginLayoutParams)this.c.getLayoutParams()).bottomMargin != n) {
                    tmy.aF((View)this.c, tmy.aq(n), (Class)ViewGroup$MarginLayoutParams.class);
                }
            }
        }
    }
    
    public final void l(final gas g) {
        this.c.g = g;
    }
    
    public final void m(final fxr fxr, final int n) {
        this.e.x(fxr, n);
    }
    
    public final boolean n(final gav gav) {
        final int a = gav.a();
        final int a2 = this.a();
        final boolean b = a == 1 || a2 != 1;
        final boolean b2 = gav.b() && !this.l.c();
        return a != 0 && b && !b2;
    }
}
