import android.view.View$MeasureSpec;
import java.util.Iterator;
import android.view.SurfaceHolder;
import android.os.Handler;
import android.view.View;
import android.content.Context;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aasu extends zfg
{
    protected Surface e;
    protected bsh f;
    public final boolean g;
    public boolean h;
    private final aasp i;
    private final Context j;
    private boolean k;
    private final boolean l;
    private View m;
    private boolean n;
    
    public aasu(final Context j, final aasp i, final boolean k, final boolean l, final zeo zeo) {
        super(j, zeo);
        this.e = null;
        this.f = null;
        this.j = j;
        this.k = k;
        this.l = l;
        this.g = ((zcx)zeo).H();
        this.i = i;
        this.addView(this.m = i.a(j, (Handler)new aast(this), k, l));
        this.setSystemUiVisibility(4096);
    }
    
    public final SurfaceHolder A() {
        return null;
    }
    
    public final zfp B() {
        return zfp.f;
    }
    
    public final void C() {
        final aasp i = this.i;
        final aasb d = i.d;
        if (d != null) {
            d.j(false);
            i.d.d();
        }
        final aaut j = i.i;
        final aaux g = i.g;
        if (g != null) {
            g.b.b();
            i.g = null;
            i.i = null;
            i.j = null;
        }
        final aarm e = i.e;
        if (e != null) {
            e.a();
        }
        final aasb d2 = i.d;
        if (d2 != null) {
            d2.k();
            i.d = null;
        }
        i.e = null;
        if (i.p) {
            i.a.q(false);
        }
        if (j != null) {
            final Iterator iterator = i.b.iterator();
            while (iterator.hasNext()) {
                ((aaso)iterator.next()).rU();
            }
        }
    }
    
    public final boolean D() {
        return this.e != null || this.f != null;
    }
    
    public final void F() {
        if (this.f == null) {
            final aaux g = this.i.g;
            if (g != null) {
                g.b.i = false;
            }
        }
    }
    
    public final void G() {
        final aaux g = this.i.g;
        if (g != null) {
            g.b.i = true;
        }
    }
    
    protected final boolean I() {
        return this.h;
    }
    
    protected final boolean J() {
        return this.i.p();
    }
    
    public final bsh i() {
        return this.f;
    }
    
    public final void n() {
        if (this.g) {
            this.removeView(this.m);
            this.addView(this.m = this.i.a(this.j, (Handler)new aast(this), this.k, this.l));
        }
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.g && this.n) {
            this.n();
            this.n = false;
        }
    }
    
    protected final void onDetachedFromWindow() {
        if (this.g) {
            this.e = null;
            this.n = true;
            final zfm d = this.d;
            if (d != null) {
                d.f();
            }
        }
        super.onDetachedFromWindow();
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.H(n, n2, n3, n4);
        if (this.i.p()) {
            this.E(this.m, n3 - n, n4 - n2);
            return;
        }
        this.m.layout(0, 0, n3 - n, n4 - n2);
    }
    
    protected final void onMeasure(int measureSpec, int measureSpec2) {
        super.onMeasure(measureSpec, measureSpec2);
        measureSpec = View$MeasureSpec.makeMeasureSpec(super.b, 1073741824);
        measureSpec2 = View$MeasureSpec.makeMeasureSpec(super.c, 1073741824);
        this.measureChild(this.m, measureSpec, measureSpec2);
    }
    
    public final void p(final boolean b, final byte[] array, final long n, final long n2) {
        final aatx h = this.i.h;
        if (h != null) {
            h.p.a(b, array, n, n2);
        }
    }
    
    public final void s(final zfq l) {
        final aasp i = this.i;
        final aatx h = i.h;
        if (h != null) {
            h.i(l);
        }
        i.l = l;
    }
    
    public final void t(final int n, final int n2) {
        final vkr s = this.i.s;
        final float n3 = n / (float)n2;
        int r;
        int q;
        if (s == vkr.d && aavd.j(n3, 3.5555556f, 0.01f)) {
            final double n4 = n;
            Double.isNaN(n4);
            r = (int)Math.floor(n4 * 9.0 / 16.0);
            q = n;
        }
        else {
            q = n;
            r = n2;
            if (this.i.s == vkr.d) {
                q = n;
                r = n2;
                if (aavd.j(n3, 0.8888889f, 0.01f)) {
                    final double n5 = n2;
                    Double.isNaN(n5);
                    q = (int)Math.floor(n5 * 16.0 / 9.0);
                    r = n2;
                }
            }
        }
        super.t(q, r);
        final aasp i = this.i;
        i.q = q;
        i.r = r;
        i.l((Runnable)new hrk(i, q / (float)r, 7));
        i.o(i.b());
    }
    
    public final void x(final boolean k, final float n, final float n2, final int u) {
        super.x(this.k = k, n, n2, u);
        final aasp i = this.i;
        final aasr c = i.c;
        final boolean b = c.b;
        try {
            c.b(k);
        }
        catch (final aavb aavb) {
            i.r(aavb);
        }
        i.u = u;
        final aatx h = i.h;
        if (h != null) {
            final aasr c2 = i.c;
            h.l(c2.c(), c2.d(), c2.a, u);
        }
        if (b != k) {
            i.i();
            i.j();
        }
    }
    
    public final boolean y(final int v) {
        final aasp i = this.i;
        final aaux g = i.g;
        if (g != null) {
            g.l(v);
        }
        i.v = v;
        return true;
    }
    
    public final Surface z() {
        return this.e;
    }
}
