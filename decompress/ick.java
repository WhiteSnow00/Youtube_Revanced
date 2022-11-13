import android.app.Dialog;
import android.content.DialogInterface$OnClickListener;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import android.view.View;
import j$.util.Optional;
import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ick implements ida, laf, icu, kyo, tgg
{
    public final tgd a;
    public final xnt b;
    public final icf c;
    public final idb d;
    public final icl e;
    public final ghb f;
    public final lag g;
    public final atke h;
    public final atjz i;
    public final asht j;
    public int k;
    public final ibz l;
    public MdxWatchDrawerLayout m;
    public ViewGroup n;
    public boolean o;
    public final icj p;
    public final fti q;
    public final elx r;
    public final pvh s;
    private final Context t;
    private final ida u;
    private final kuj v;
    private final fzl w;
    private final vwu x;
    
    public ick(final Context t, final tgd a, final xnt b, final atke atke, final icf c, final ida u, final kuj v, final fzl w, final idb d, final icl e, final ghb f, final elx r, final vwu x, final lag g, final atke h, final byte[] array, final byte[] array2, final byte[] array3) {
        final atjm aw = atjm.aW((Object)Optional.empty());
        this.i = (atjz)aw;
        this.j = ((asht)aw).aq((asjr)hzh.j);
        this.t = t;
        this.a = a;
        this.b = b;
        this.c = c;
        this.u = u;
        this.v = v;
        this.w = w;
        this.d = d;
        this.e = e;
        this.f = f;
        this.r = r;
        this.x = x;
        this.g = g;
        this.h = h;
        this.p = new icj(this, 0);
        this.q = new fti(this, 14);
        this.s = new pvh(this);
        this.l = (ibz)atke.a();
        w.b(fzk.c, agy.a(t, 2131101499));
    }
    
    public final void b() {
        final ViewGroup n = this.n;
        if (n == null) {
            return;
        }
        this.v.f(this.b.g() != null && this.g.e(), n.getHeight());
    }
    
    public final void c(int e) {
        final MdxWatchDrawerLayout m = this.m;
        if (m == null) {
            return;
        }
        final int i = e + this.t.getResources().getDimensionPixelOffset(2131167883);
        final View f = m.f;
        if (f != null) {
            if (m.i != i) {
                f.setPaddingRelative(0, 0, 0, i);
                e = m.e(m.h, i);
                m.i = i;
                m.f();
                m.h(e, true);
            }
        }
    }
    
    public final void d(final boolean b) {
        final boolean h = this.h();
        final MdxWatchDrawerLayout m = this.m;
        if (m != null) {
            m.c();
        }
        this.u.d(b & (h ^ true));
    }
    
    public final void f(final boolean b) {
        final Object a = this.r.a;
        if (a == null) {
            return;
        }
        final View viewById = ((View)((DefaultWatchPanelViewController)a).k).findViewById(2131431265);
        if (viewById == null) {
            return;
        }
        int visibility;
        if (!b) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        viewById.setVisibility(visibility);
    }
    
    public final void g(final float n) {
        this.w.a(fzk.c, n);
    }
    
    public final boolean h() {
        if (this.o) {
            final MdxWatchDrawerLayout m = this.m;
            if (m != null && m.a().a()) {
                return true;
            }
        }
        return false;
    }
    
    public final void m(final int n) {
        if (n == 0) {
            final xnm g = this.b.g();
            if (g != null && !g.t().isEmpty()) {
                final vwu x = this.x;
                if (x.a && ((xsj)x.c).f.j == 1) {
                    ((abpq)((atke)x.d).a()).a();
                    ((Dialog)((aeea)x.b).al((Context)x.f).setTitle(2132018486).setMessage(2132018485).setPositiveButton(2132018484, (DialogInterface$OnClickListener)new jjm(x, 7, (byte[])null)).setNegativeButton(2132017611, (DialogInterface$OnClickListener)new jjm(x, 8, (byte[])null)).setCancelable(false).create()).show();
                }
            }
        }
        this.b();
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final xlj xlj = (xlj)o;
            final xlj c = xlj.c;
            array = null;
            if (xlj == c) {
                this.qU();
                return null;
            }
        }
        else {
            array = new Class[] { xlj.class };
        }
        return array;
    }
    
    public final void qU() {
        this.u.qU();
    }
}
