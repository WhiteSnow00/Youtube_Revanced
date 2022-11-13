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

public final class aare extends zdl
{
    protected Surface e;
    protected bse f;
    public final boolean g;
    public boolean h;
    private final aaqz i;
    private final Context j;
    private boolean k;
    private final boolean l;
    private View m;
    private boolean n;
    
    public aare(final Context j, final aaqz i, final boolean k, final boolean l, final zct zct) {
        super(j, zct);
        this.e = null;
        this.f = null;
        this.j = j;
        this.k = k;
        this.l = l;
        this.g = ((zbd)zct).H();
        this.i = i;
        this.addView(this.m = i.a(j, new aard(this), k, l));
        this.setSystemUiVisibility(4096);
    }
    
    public final SurfaceHolder A() {
        return null;
    }
    
    public final zdu B() {
        return zdu.f;
    }
    
    public final void C() {
        final aaqz i = this.i;
        final aaqc f = i.f;
        if (f != null) {
            f.j(false);
            i.f.d();
        }
        final aatj k = i.k;
        final aatn j = i.i;
        if (j != null) {
            j.b.b();
            i.i = null;
            i.k = null;
            i.l = null;
        }
        final aasj e = i.e;
        if (e != null) {
            e.a();
            i.e = null;
        }
        final aapn g = i.g;
        if (g != null) {
            g.a();
        }
        final aaqc f2 = i.f;
        if (f2 != null) {
            f2.k();
            i.f = null;
        }
        i.g = null;
        if (i.r) {
            i.a.q(false);
        }
        if (k != null) {
            final Iterator iterator = i.c.iterator();
            while (iterator.hasNext()) {
                ((aaqy)iterator.next()).rU();
            }
        }
    }
    
    public final boolean D() {
        return this.e != null || this.f != null;
    }
    
    public final void F() {
        if (this.f == null) {
            final aatn i = this.i.i;
            if (i != null) {
                i.b.i = false;
            }
        }
    }
    
    public final void G() {
        final aatn i = this.i.i;
        if (i != null) {
            i.b.i = true;
        }
    }
    
    protected final boolean I() {
        return this.h;
    }
    
    protected final boolean J() {
        return this.i.q();
    }
    
    public final bse i() {
        return this.f;
    }
    
    public final void n() {
        if (this.g) {
            this.removeView(this.m);
            this.addView(this.m = this.i.a(this.j, new aard(this), this.k, this.l));
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
            final zdr d = this.d;
            if (d != null) {
                d.f();
            }
        }
        super.onDetachedFromWindow();
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.H(n, n2, n3, n4);
        if (this.i.q()) {
            this.E(this.m, n3 - n, n4 - n2);
            return;
        }
        this.m.layout(0, 0, n3 - n, n4 - n2);
    }
    
    protected final void onMeasure(int measureSpec, int measureSpec2) {
        super.onMeasure(measureSpec, measureSpec2);
        measureSpec2 = View$MeasureSpec.makeMeasureSpec(super.b, 1073741824);
        measureSpec = View$MeasureSpec.makeMeasureSpec(super.c, 1073741824);
        this.measureChild(this.m, measureSpec2, measureSpec);
    }
    
    public final void p(final boolean b, final byte[] array, final long n, final long n2) {
        final aasm j = this.i.j;
        if (j != null) {
            j.p.a(b, array, n, n2);
        }
    }
    
    public final void s(final zdv n) {
        final aaqz i = this.i;
        final aasm j = i.j;
        if (j != null) {
            j.i(n);
        }
        i.n = n;
    }
    
    public final void t(final int n, final int n2) {
        final vjj u = this.i.u;
        final float n3 = n / (float)n2;
        int t;
        int s;
        if (u == vjj.d && aatt.j(n3, 3.5555556f, 0.01f)) {
            final double n4 = n;
            Double.isNaN(n4);
            t = (int)Math.floor(n4 * 9.0 / 16.0);
            s = n;
        }
        else {
            s = n;
            t = n2;
            if (this.i.u == vjj.d) {
                s = n;
                t = n2;
                if (aatt.j(n3, 0.8888889f, 0.01f)) {
                    final double n5 = n2;
                    Double.isNaN(n5);
                    s = (int)Math.floor(n5 * 16.0 / 9.0);
                    t = n2;
                }
            }
        }
        super.t(s, t);
        final aaqz i = this.i;
        i.s = s;
        i.t = t;
        i.m(new hrc(i, s / (float)t, 7));
        i.p(i.b());
    }
    
    public final void x(final boolean k, final float n, final float n2, final int x) {
        super.x(this.k = k, n, n2, x);
        final aaqz i = this.i;
        final aarb d = i.d;
        final boolean b = d.b;
        try {
            d.b(k);
        }
        catch (final aatr aatr) {
            i.s(aatr);
        }
        i.x = x;
        final aasm j = i.j;
        if (j != null) {
            final aarb d2 = i.d;
            j.l(d2.c(), d2.d(), d2.a, x);
        }
        if (b != k) {
            i.j();
            i.k();
        }
    }
    
    public final boolean y(final int y) {
        final aaqz i = this.i;
        final aatn j = i.i;
        if (j != null) {
            j.l(y);
        }
        i.y = y;
        return true;
    }
    
    public final Surface z() {
        return this.e;
    }
}
