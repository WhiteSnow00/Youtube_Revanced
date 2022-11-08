import android.content.res.Resources;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kzn
{
    public final View a;
    public final int b;
    public final int c;
    public final kzu d;
    public final atid e;
    public kzm f;
    public final lcf g;
    
    public kzn(final View view, final int n, final int n2, kyz b, kyz b2, final lcf lcf, final blt blt, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        b = kyv.b(b);
        b2 = kyv.b(b2);
        final lat lat = (lat)((SparseArray)((trp)blt.b).a()).get(n | n2);
        if (lat != null) {
            final kzu a = lat.a(view, n, b, n2, b2);
            a.a(0.0f);
            this(view, n, n2, a, lcf);
            return;
        }
        throw new IllegalArgumentException(String.format("Unsupported transition from %s to %s.", blt.R(n), blt.R(n2)));
    }
    
    public kzn(final View a, final int b, final int c, final kzu d, final lcf g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.e = atid.aE((Object)false);
        d.a(0.0f);
    }
    
    public final int a(int n, final boolean b) {
        final kzu d = this.d;
        Rect rect;
        if (b) {
            rect = d.a.get(0).a.u();
        }
        else {
            rect = d.a.get(0).a.s();
        }
        Rect rect2;
        if (b) {
            rect2 = ((kzt)adwd.aK((Iterable)d.a)).a.u();
        }
        else {
            rect2 = ((kzt)adwd.aK((Iterable)d.a)).a.s();
        }
        int n2;
        if (n == 1) {
            n2 = rect.centerY();
            n = rect2.centerY();
        }
        else {
            n2 = rect.centerX();
            n = rect2.centerX();
        }
        return n - n2;
    }
    
    public final void b() {
        final kzm f = this.f;
        if (f == null) {
            return;
        }
        f.b = true;
        f.a.cancel();
        this.f = null;
    }
    
    public final void c() {
        this.b();
        final kzs b = this.d.b;
        if (b != null) {
            b.a();
        }
    }
    
    public final void d(final float n) {
        final kzu d = this.d;
        if (n == d.d) {
            return;
        }
        d.a(n);
        this.g.b(this.b, this.c, n);
    }
    
    public final boolean e() {
        return this.f != null;
    }
    
    public final void f(final float n, final kzh kzh) {
        if (!this.e()) {
            final int b = this.b;
            final int c = this.c;
            boolean b2 = false;
            Label_0079: {
                if (blt.Q(b) != 2 || blt.Q(c) != 1) {
                    final int q = blt.Q(b);
                    b2 = false;
                    if (q != 1) {
                        break Label_0079;
                    }
                    b2 = b2;
                    if (blt.Q(c) != 2) {
                        break Label_0079;
                    }
                }
                b2 = true;
            }
            int n2;
            if (b == 128 && c == 2) {
                n2 = this.a.getContext().getResources().getInteger(2131493039);
            }
            else {
                final Resources resources = this.a.getContext().getResources();
                int n3;
                if (!b2) {
                    n3 = 2131493041;
                }
                else {
                    n3 = 2131493040;
                }
                n2 = resources.getInteger(n3);
            }
            final kzm f = new kzm(this, (int)(n2 * (1.0f - n)), n, kzh);
            this.f = f;
            f.a.addListener((Animator$AnimatorListener)f);
            f.a.addUpdateListener((ValueAnimator$AnimatorUpdateListener)f);
            final kzm f2 = this.f;
            f2.a.start();
            f2.c.e.tr((Object)true);
        }
    }
}
