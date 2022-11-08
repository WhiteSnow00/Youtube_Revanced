import android.util.Log;
import android.support.v7.widget.LinearLayoutManager;
import com.google.android.apps.youtube.app.common.ui.stickyheaders.StickyHeaderContainer;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkh
{
    public final RecyclerView a;
    public final nq b;
    public final ViewGroup c;
    public final gjy d;
    public final gjw e;
    public final oa f;
    public final float g;
    public final gkg h;
    public View i;
    public long j;
    public boolean k;
    public View l;
    public float m;
    public int n;
    public Runnable o;
    public boolean p;
    public boolean q;
    public final iw r;
    public hy s;
    private float t;
    private View u;
    private boolean v;
    private float w;
    private float x;
    
    public gkh(final StickyHeaderContainer stickyHeaderContainer, final nq b, final gjw e) {
        b.getClass();
        this.b = b;
        this.e = e;
        stickyHeaderContainer.getClass();
        final RecyclerView a = stickyHeaderContainer.a;
        this.a = a;
        this.c = (ViewGroup)a.getParent();
        this.g = (float)a.getContext().getResources().getDimensionPixelOffset(2131166442);
        b.v((hw)new gkb(this));
        this.f = (oa)new gkc(this);
        this.r = (iw)new gkd(this);
        this.h = new gkg(a.getContext());
        final gjy d = new gjy(b, e);
        this.d = d;
        d.d = new qpt(this);
        d.o();
    }
    
    private final void h() {
        if (!this.v) {
            this.a.ad((ns)gjz.a);
            this.v = true;
        }
    }
    
    private final void i() {
        final View i = this.i;
        if (i != null) {
            i.setVisibility(8);
            this.c.post((Runnable)new fsa(this, this.i, 10));
            this.i = null;
            this.j = 0L;
        }
    }
    
    private final void j() {
        if (this.v) {
            this.a.ad((ns)null);
            this.v = false;
        }
    }
    
    private final void k() {
        final View u = this.u;
        if (u != null) {
            u.setAlpha(this.t);
            final View u2 = this.u;
            int visibility;
            if (this.t == 0.0f) {
                visibility = 8;
            }
            else {
                visibility = 0;
            }
            u2.setVisibility(visibility);
            this.u = null;
        }
    }
    
    private static final boolean l(final int n) {
        return (n & 0x1C) == 0x1C;
    }
    
    public final float a(final int n, final View view, float n2) {
        if (fah.p(n, 64) && this.p && this.x < view.getTop()) {
            n2 = this.w;
            if (n2 <= 0.0f) {
                return 1.0f;
            }
            n2 = Math.max(0.0f, Math.min(1.0f, this.x / n2));
        }
        else {
            n2 = Math.max(0.0f, Math.min(1.0f, view.getTop() / n2));
        }
        return 1.0f - n2;
    }
    
    public final View b(final nw nw) {
        if (nw != null) {
            final gjy d = this.d;
            final int b = d.b;
            if (b == -1) {
                if (!d.q()) {
                    return null;
                }
            }
            else if (b >= d.a.size() - 1) {
                return null;
            }
            return nw.T(this.d.m());
        }
        return null;
    }
    
    public final void c() {
        final boolean p = this.p;
        final boolean g = this.g();
        this.p = g;
        if (g) {
            final nw n = this.a.n;
            View t;
            if (n == null) {
                t = null;
            }
            else {
                t = n.T(n.av() - 1);
            }
            if (t != null) {
                final float n2 = (float)(t.getBottom() - this.a.getHeight());
                this.x = n2;
                if (!p) {
                    this.w = n2;
                }
                return;
            }
        }
        this.p = false;
    }
    
    public final void d() {
        final hy s = this.s;
        if (s != null) {
            this.a.aG(s);
            this.a.Y(this.f);
            this.s = null;
        }
    }
    
    public final void e() {
        if (this.i != null) {
            this.i();
        }
        this.a.aH(this.r);
        this.d.p();
        if (this.s != null) {
            this.a.post((Runnable)new ghh(this, 14));
        }
        this.k();
        this.j();
        this.l = null;
        this.o = null;
    }
    
    public final void f() {
        this.c();
        final nw n = this.a.n;
        final long n2 = this.d.n();
        final gjy d = this.d;
        final nw n3 = this.a.n;
        int k;
        if (n3 instanceof LinearLayoutManager) {
            k = ((LinearLayoutManager)n3).K();
        }
        else {
            Log.w("StickyHeaders", "A LinearLayoutManager is required for sticky headers to work");
            k = 0;
        }
        final int c = d.c;
        Label_0480: {
            if (k != c) {
                d.c = k;
                final int min = Math.min(d.i(k), d.a.size() - 1);
                Label_0192: {
                    if (min >= 0) {
                        int b = min;
                        if (((gjx)d.a.get(min)).b > k) {
                            if (min > 0) {
                                b = min - 1;
                            }
                            else {
                                b = -1;
                            }
                        }
                        if (b != d.b) {
                            d.b = b;
                            break Label_0192;
                        }
                    }
                    if (c != -1) {
                        break Label_0480;
                    }
                }
                this.k();
                if (this.s != null) {
                    this.a.post((Runnable)new ghh(this, 14));
                }
                final int j = this.d.j();
                if (fah.q(j)) {
                    if (this.i != null) {
                        final gjy d2 = this.d;
                        if (n2 != Long.MAX_VALUE && d2.q() && n2 == ((gjx)d2.a.get(0)).c) {
                            final View t = n.T(this.d.k());
                            if (t != null) {
                                this.e.c(this.i, t);
                            }
                        }
                        this.i();
                    }
                }
                else if (fah.s(j) && (this.i == null || this.j != this.d.n())) {
                    final gjy d3 = this.d;
                    final int b2 = d3.b;
                    int b3;
                    if (b2 == -1) {
                        b3 = -1;
                    }
                    else {
                        b3 = d3.a.get(b2).b;
                    }
                    final View i = this.i;
                    if (!this.k) {
                        this.k = true;
                        this.c.post((Runnable)new gka(this, i, b3, n, 0));
                    }
                }
                final int l = this.d.l();
                if (fah.p(l, 8)) {
                    if (!l(l)) {
                        this.h();
                    }
                }
                else {
                    this.j();
                }
            }
        }
        Label_0666: {
            if (this.i != null) {
                if (fah.r(this.d.l())) {
                    final View b4 = this.b(n);
                    if (b4 != null) {
                        this.i.setTranslationY((float)Math.min(0, b4.getTop() - this.i.getHeight()));
                        break Label_0666;
                    }
                }
                final View m = this.i;
                final gjy d4 = this.d;
                float translationY = 0.0f;
                Label_0659: {
                    if (d4.q()) {
                        final int n4 = d4.a.size() - 1;
                        final gjx gjx = d4.a.get(n4);
                        if (d4.b != n4 || !fah.s(gjx.a)) {
                            if (d4.c >= gjx.b && fah.r(gjx.a)) {
                                translationY = (float)(-this.i.getHeight());
                                break Label_0659;
                            }
                        }
                    }
                    translationY = 0.0f;
                }
                m.setTranslationY(translationY);
            }
        }
        final int l2 = this.d.l();
        if (fah.p(l2, 20)) {
            final View b5 = this.b(n);
            if (b5 != null) {
                if (fah.p(l2, 4)) {
                    this.a.post((Runnable)new qo(this, b5, l2, 12));
                }
                final float a = this.a(l2, b5, this.g);
                if (fah.p(l2, 16)) {
                    this.k();
                    this.t = b5.getAlpha();
                    (this.u = b5).setAlpha(a);
                    final float t2 = this.t;
                    if (t2 == 0.0f && a > 0.0f) {
                        b5.setVisibility(0);
                    }
                    else if (t2 > 0.0f && a == 0.0f) {
                        b5.setVisibility(8);
                    }
                }
                if (l(l2)) {
                    if (a > 0.0f) {
                        this.h();
                        return;
                    }
                    this.j();
                }
            }
        }
    }
    
    public final boolean g() {
        final nw n = this.a.n;
        if (!(n instanceof LinearLayoutManager)) {
            return false;
        }
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)n;
        return linearLayoutManager != null && linearLayoutManager.M() == ((nw)linearLayoutManager).av() - 1;
    }
}
