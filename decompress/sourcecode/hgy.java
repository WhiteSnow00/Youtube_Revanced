import android.os.Looper;
import android.widget.ImageView;
import android.view.View;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hgy
{
    public final boolean a;
    public final wwv b;
    public final ChooseFilterView c;
    public final ChooseFilterView d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final ImageView i;
    public final unp j;
    public final View k;
    public final int l;
    public final int m;
    public final hgx n;
    public final hgx o;
    public final hgx p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final ndh t;
    
    public hgy(final ChooseFilterView c, final ChooseFilterView d, final unp j, final View e, final View g, final View f, final View h, final ImageView i, final View k, final wwv b) {
        this.c = c;
        this.d = d;
        j.getClass();
        this.j = j;
        e.getClass();
        this.e = e;
        g.getClass();
        this.g = g;
        this.h = h;
        this.i = i;
        this.k = k;
        this.f = f;
        b.getClass();
        this.b = b;
        final boolean b2 = true;
        if (c != null) {
            c.n((upc)new hgw(this, 1));
            c.h(k);
        }
        if (d != null) {
            d.n((upc)new hgw(this, 0));
            d.h(k);
        }
        boolean a = b2;
        if (c == null) {
            a = (d != null && b2);
        }
        this.a = a;
        if (a) {
            this.l = (int)g.getResources().getDimension(2131168822);
            this.m = (int)g.getResources().getDimension(2131168740);
        }
        else {
            this.l = 0;
            this.m = 0;
        }
        this.p = new hgx(this, f);
        this.n = new hgx(this, e);
        this.o = new hgx(this, g);
        this.t = new ndh(this, (View)i);
        j.g((unl)new hat(this, 3));
    }
    
    private static void e(final ChooseFilterView chooseFilterView, final boolean b) {
        if (chooseFilterView == null) {
            return;
        }
        if (chooseFilterView.f != b) {
            chooseFilterView.k();
        }
    }
    
    public final void a(final boolean q) {
        this.q = q;
        e(this.c, false);
        e(this.d, false);
        this.r = false;
        this.s = false;
    }
    
    public final void b(final apje apje) {
        final apje a = apje.a;
        final int ordinal = apje.ordinal();
        if (ordinal == 1) {
            e(this.c, true);
            e(this.d, false);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        e(this.d, true);
        e(this.c, false);
    }
    
    public final void c() {
        final hcp hcp = new hcp(this, 6);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ((Runnable)hcp).run();
            return;
        }
        this.e.post((Runnable)hcp);
    }
    
    public final boolean d() {
        return this.r || this.s;
    }
}
