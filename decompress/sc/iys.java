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

public final class iys implements View$OnLayoutChangeListener, wbj
{
    public final iyt a;
    public final gfk b;
    public final ashy c;
    public final kuk d;
    public final isd e;
    public final AutonavToggleController f;
    public final SubtitleButtonController g;
    public final ixv h;
    public final TouchImageView i;
    public final ImageView j;
    public final atjm k;
    public final List l;
    public final MusicAppDeeplinkButtonController m;
    public aidi n;
    public iuq o;
    public int p;
    public final arwh q;
    public ktn r;
    public final ajb s;
    public final mcb t;
    private boolean u;
    
    public iys(final gfk b, final iyt a, final ashy c, final ajb s, final ixv h, final kuk d, final isd e, final AutonavToggleController f, final SubtitleButtonController g, final TouchImageView i, final ImageView j, final MusicAppDeeplinkButtonController m, final mcb t, final arwh q, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
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
        this.k = atjm.e();
        this.l = new ArrayList();
        this.m = m;
        this.t = t;
        this.q = q;
        a.getClass();
        e.m((fyi)new iyq(a, 1));
        ((fxx)f).a = (fyi)new iyq(a, 0);
        ((fxx)m).a = (fyi)new iyq(a, 2);
    }
    
    public final int a() {
        return this.p;
    }
    
    public final void b(final aidi n) {
        this.n = n;
    }
    
    public final void c(final int p) {
        this.p = p;
        final boolean b = false;
        final boolean i = p != 0;
        this.a.i = i;
        if (i) {
            final atjm k = this.k;
            boolean b2 = b;
            if (p == 1) {
                b2 = true;
            }
            k.tu((Object)b2);
        }
    }
    
    public final void d(final View view) {
        if (this.r == null) {
            this.l.add(view);
            return;
        }
        final Resources resources = view.getResources();
        final int dimensionPixelSize = resources.getDimensionPixelSize(2131166169);
        tpe.aG(view, (atke)new iyr(dimensionPixelSize, 1), tpe.an(new tut[] { tpe.aE(dimensionPixelSize, dimensionPixelSize), tpe.ax(resources.getDimensionPixelSize(2131166167)) }), (Class)ViewGroup$MarginLayoutParams.class);
        ((LinearLayout)((toz)this.r.f).a).addView(view);
    }
    
    public final void onLayoutChange(final View view, int k, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        k = n2 - k;
        final boolean u = n3 - n > k;
        if (this.u != u) {
            this.u = u;
            final RelativeLayout$LayoutParams relativeLayout$LayoutParams = (RelativeLayout$LayoutParams)this.e.a();
            if (this.r != null) {
                if (relativeLayout$LayoutParams != null) {
                    final ArrayDeque<tut> arrayDeque = new ArrayDeque<tut>();
                    if (this.u) {
                        arrayDeque.add(tpe.ap(3, ((TouchImageView)((toz)this.r.b).a).getId()));
                        arrayDeque.add(tpe.ao(21));
                        arrayDeque.add(tpe.az(10));
                        arrayDeque.add(tpe.az(16));
                    }
                    else {
                        arrayDeque.add(tpe.ap(16, 2131427719));
                        arrayDeque.add(tpe.ao(10));
                        arrayDeque.add(tpe.az(21));
                        arrayDeque.add(tpe.az(3));
                    }
                    if (tpe.aK((ArrayDeque)arrayDeque).a((ViewGroup$LayoutParams)relativeLayout$LayoutParams)) {
                        this.e.b((ViewGroup$LayoutParams)relativeLayout$LayoutParams);
                    }
                }
            }
            final iyt a = this.a;
            final boolean u2 = this.u;
            if (a.f != u2) {
                a.f = u2;
                a.b();
            }
        }
        final iyt a2 = this.a;
        if (a2.k != k) {
            a2.k = k;
            a2.b();
        }
    }
}
