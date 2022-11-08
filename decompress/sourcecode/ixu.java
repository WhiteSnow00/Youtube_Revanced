import android.view.ViewGroup$LayoutParams;
import java.util.ArrayDeque;
import android.widget.RelativeLayout$LayoutParams;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import java.util.ArrayList;
import com.google.android.apps.youtube.app.player.overlay.MusicAppDeeplinkButtonController;
import java.util.List;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
import com.google.android.apps.youtube.app.player.autonav.AutonavToggleController;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixu implements View$OnLayoutChangeListener, vzk
{
    public final ixv a;
    public final gfc b;
    public final ashj c;
    public final kti d;
    public final irf e;
    public final AutonavToggleController f;
    public final SubtitleButtonController g;
    public final iwx h;
    public final TouchImageView i;
    public final ImageView j;
    public final atir k;
    public final List l;
    public final MusicAppDeeplinkButtonController m;
    public aibk n;
    public its o;
    public int p;
    public final arud q;
    public lfy r;
    public final aja s;
    public final maw t;
    private boolean u;
    
    public ixu(final gfc b, final ixv a, final ashj c, final aja s, final iwx h, final kti d, final irf e, final AutonavToggleController f, final SubtitleButtonController g, final TouchImageView i, final ImageView j, final MusicAppDeeplinkButtonController m, final maw t, final arud q, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.s = s;
        this.h = h;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.i = i;
        this.j = j;
        this.k = atir.e();
        this.l = new ArrayList();
        this.m = m;
        this.t = t;
        this.q = q;
        a.getClass();
        e.m((fya)new ixs(a, 1));
        ((fxp)f).a = (fya)new ixs(a, 0);
        ((fxp)m).a = (fya)new ixs(a, 2);
    }
    
    public final int a() {
        return this.p;
    }
    
    public final void b(final aibk n) {
        this.n = n;
    }
    
    public final void c(final int p) {
        this.p = p;
        final boolean b = false;
        final boolean i = p != 0;
        this.a.i = i;
        if (i) {
            final atir k = this.k;
            boolean b2 = b;
            if (p == 1) {
                b2 = true;
            }
            k.tr((Object)b2);
        }
    }
    
    public final void d(final View view) {
        if (this.r == null) {
            this.l.add(view);
            return;
        }
        final Resources resources = view.getResources();
        final int dimensionPixelSize = resources.getDimensionPixelSize(2131166169);
        tmy.aG(view, (atjj)new ixt(dimensionPixelSize, 1), tmy.an(new tsp[] { tmy.aE(dimensionPixelSize, dimensionPixelSize), tmy.ax(resources.getDimensionPixelSize(2131166167)) }), (Class)ViewGroup$MarginLayoutParams.class);
        ((LinearLayout)((tmt)this.r.i).a).addView(view);
    }
    
    public final void onLayoutChange(final View view, int k, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        k = n2 - k;
        final boolean u = n3 - n > k;
        if (this.u != u) {
            this.u = u;
            final RelativeLayout$LayoutParams relativeLayout$LayoutParams = (RelativeLayout$LayoutParams)this.e.a();
            if (this.r != null) {
                if (relativeLayout$LayoutParams != null) {
                    final ArrayDeque<tsp> arrayDeque = new ArrayDeque<tsp>();
                    if (this.u) {
                        arrayDeque.add(tmy.ap(3, ((TouchImageView)((tmt)this.r.e).a).getId()));
                        arrayDeque.add(tmy.ao(21));
                        arrayDeque.add(tmy.az(10));
                        arrayDeque.add(tmy.az(16));
                    }
                    else {
                        arrayDeque.add(tmy.ap(16, 2131427719));
                        arrayDeque.add(tmy.ao(10));
                        arrayDeque.add(tmy.az(21));
                        arrayDeque.add(tmy.az(3));
                    }
                    if (tmy.aK((ArrayDeque)arrayDeque).a((ViewGroup$LayoutParams)relativeLayout$LayoutParams)) {
                        this.e.b((ViewGroup$LayoutParams)relativeLayout$LayoutParams);
                    }
                }
            }
            final ixv a = this.a;
            final boolean u2 = this.u;
            if (a.f != u2) {
                a.f = u2;
                a.b();
            }
        }
        final ixv a2 = this.a;
        if (a2.k != k) {
            a2.k = k;
            a2.b();
        }
    }
}
