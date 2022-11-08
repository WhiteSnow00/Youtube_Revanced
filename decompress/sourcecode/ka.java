import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ka
{
    public ajk a;
    private final View b;
    private final kf c;
    private int d;
    private ajk e;
    private ajk f;
    
    public ka(final View b) {
        this.d = -1;
        this.b = b;
        this.c = kf.d();
    }
    
    public final void a() {
        final Drawable background = this.b.getBackground();
        if (background != null) {
            if (this.e != null) {
                if (this.f == null) {
                    this.f = new ajk();
                }
                final ajk f = this.f;
                f.d = null;
                f.c = false;
                f.b = null;
                f.a = false;
                final ColorStateList l = ana.l(this.b);
                if (l != null) {
                    f.c = true;
                    f.d = l;
                }
                final PorterDuff$Mode m = ana.m(this.b);
                if (m != null) {
                    f.a = true;
                    f.b = m;
                }
                if (f.c || f.a) {
                    or.h(background, f, this.b.getDrawableState());
                    return;
                }
            }
            final ajk a = this.a;
            if (a != null) {
                or.h(background, a, this.b.getDrawableState());
                return;
            }
            final ajk e = this.e;
            if (e != null) {
                or.h(background, e, this.b.getDrawableState());
            }
        }
    }
    
    public final void b(final AttributeSet set, final int n) {
        final cdn w = cdn.w(this.b.getContext(), set, gl.A, n, 0);
        final View b = this.b;
        ana.M(b, b.getContext(), gl.A, set, (TypedArray)w.a, n, 0);
        try {
            if (w.q(0)) {
                this.d = w.i(0, -1);
                final ColorStateList a = this.c.a(this.b.getContext(), this.d);
                if (a != null) {
                    this.d(a);
                }
            }
            if (w.q(1)) {
                ana.R(this.b, w.j(1));
            }
            if (w.q(2)) {
                ana.S(this.b, mb.a(w.f(2, -1), (PorterDuff$Mode)null));
            }
        }
        finally {
            w.o();
        }
    }
    
    public final void c(final int d) {
        this.d = d;
        final kf c = this.c;
        ColorStateList a;
        if (c != null) {
            a = c.a(this.b.getContext(), d);
        }
        else {
            a = null;
        }
        this.d(a);
        this.a();
    }
    
    final void d(final ColorStateList d) {
        if (d != null) {
            if (this.e == null) {
                this.e = new ajk();
            }
            final ajk e = this.e;
            e.d = d;
            e.c = true;
        }
        else {
            this.e = null;
        }
        this.a();
    }
    
    public final void e() {
        this.d = -1;
        this.d(null);
        this.a();
    }
}
