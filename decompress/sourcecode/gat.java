import android.animation.Animator;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gat extends aqg
{
    final /* synthetic */ BottomUiContainer a;
    
    public gat(final BottomUiContainer a) {
        this.a = a;
    }
    
    public final int b(final View view) {
        return view.getHeight();
    }
    
    public final void d(final View view, final int n) {
        final arj n2 = this.a.n;
        if (n2 != null) {
            n2.i();
        }
    }
    
    public final void f(final View view, final float n, final float n2) {
        final int az = tmy.aZ(this.a.getResources().getDisplayMetrics(), 10);
        final boolean q = this.a.q;
        boolean b = true;
        final boolean b2 = q ? (view.getTop() < this.a.o - az && n2 <= 0.0f) : (view.getTop() > this.a.o + az && n2 >= 0.0f);
        Label_0139: {
            if (this.a.q) {
                if (view.getTop() < this.a.o) {
                    break Label_0139;
                }
            }
            else if (view.getTop() > this.a.o) {
                break Label_0139;
            }
            b = false;
        }
        if (b2) {
            final BottomUiContainer a = this.a;
            final View j = a.j;
            if (j != null) {
                if (j != a.k) {
                    if (!a.p) {
                        a.l(n2);
                        return;
                    }
                    final hez u = a.u;
                    if (u != null) {
                        u.d(0);
                    }
                    final arj n3 = a.n;
                    if (n3 != null) {
                        n3.i();
                    }
                    final Animator l = a.l;
                    if (l != null) {
                        l.cancel();
                    }
                    final arj f = a.f(a.j, n2);
                    ((arg)f).e((ard)new gaj(a, 0));
                    a.n = f;
                    final View i = a.j;
                    a.k = i;
                    int n4;
                    if (a.q) {
                        n4 = a.o - i.getHeight();
                    }
                    else {
                        n4 = a.o + i.getHeight();
                    }
                    a.n.h((float)n4);
                }
            }
        }
        else if (b) {
            this.a.l(n2);
        }
    }
    
    public final boolean g(final View view, final int n) {
        final BottomUiContainer a = this.a;
        return a.p && view == a.j && view != a.k;
    }
    
    public final int h(final View view, final int n) {
        return view.getLeft();
    }
    
    public final int i(final View view, final int n) {
        final BottomUiContainer a = this.a;
        int o;
        if (a.q) {
            o = a.o - view.getHeight();
        }
        else {
            o = a.o;
        }
        final BottomUiContainer a2 = this.a;
        int o2;
        if (a2.q) {
            o2 = a2.o;
        }
        else {
            o2 = view.getHeight() + a2.o;
        }
        return aeh.t(n, o, o2);
    }
    
    public final void l(final View view, final int n, final int n2, final int n3) {
        view.setAlpha(this.a.a(view, n2));
        final BottomUiContainer a = this.a;
        a.k(a.b(view));
    }
}
