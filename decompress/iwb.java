import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.markers.HeatMarkerView;
import android.graphics.PointF;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import java.util.function.Consumer;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.ArrayList;
import j$.util.Optional;
import java.util.List;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwb implements View$OnLayoutChangeListener, abao, abdw, iuu
{
    public final abap a;
    public final fpn b;
    public final List c;
    public final boolean d;
    public final abpu e;
    public final iuv f;
    public final wyw g;
    public Optional h;
    public long i;
    public Optional j;
    public toz k;
    public qv l;
    public final msr m;
    private fkr n;
    private boolean o;
    
    public iwb(final abap a, final fpn b, final iuv f, final abpu e, final vaf vaf, final wyw g, final msr m, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.f = f;
        this.e = e;
        this.g = g;
        this.n = fkr.a;
        this.m = m;
        this.j = Optional.empty();
        this.c = new ArrayList();
        this.h = Optional.empty();
        this.l = null;
        alxp alxp;
        if ((alxp = vaf.b().e) == null) {
            alxp = alxp.a;
        }
        this.d = alxp.by;
    }
    
    private final void b(final boolean b) {
        if (b) {
            this.g.t((wzz)new wyt(xaa.c(139609)), (alhi)null);
            return;
        }
        this.g.o((wzz)new wyt(xaa.c(139609)), (alhi)null);
    }
    
    private final void f() {
        final qv l = this.l;
        if (l == null) {
            return;
        }
        l.b();
    }
    
    private final void g() {
        if (this.c.isEmpty()) {
            return;
        }
        this.f();
        final toz k = this.k;
        if (k == null) {
            return;
        }
        if (this.n.c() && this.h.isPresent()) {
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)((View)this.h.get()).getLayoutParams();
            tpe.aF(k.a, tpe.an(new tut[] { tpe.ax(viewGroup$MarginLayoutParams.getMarginStart()), tpe.aw(viewGroup$MarginLayoutParams.getMarginEnd()) }), (Class)ViewGroup$MarginLayoutParams.class);
            return;
        }
        tpe.aF(k.a, tpe.an(new tut[] { tpe.ax(0), tpe.aw(0) }), (Class)ViewGroup$MarginLayoutParams.class);
    }
    
    public final void a() {
        final aazz o = this.a.o(abea.h);
        if (!(o instanceof abad)) {
            return;
        }
        final abad abad = (abad)o;
        (this.j = Optional.ofNullable((Object)abad.c)).ifPresent((Consumer)new inj(this, 8));
        final afeq a = abad.a;
        final afeq d = abad.d;
        if (!a.isEmpty() && this.i != 0L && !d.isEmpty()) {
            if (a.size() == d.size()) {
                this.c.clear();
                for (int i = 0; i < a.size(); ++i) {
                    this.c.add(new PointF(((TimelineMarker)a.get(i)).a / (float)this.i, (float)d.get(i)));
                }
            }
        }
    }
    
    public final void c(final TimelineMarker timelineMarker, final TimelineMarker timelineMarker2, final abea abea, final int n) {
    }
    
    public final void d(final abea abea) {
    }
    
    public final void h(final int n, final long n2) {
        this.o = (n == 1 || n == 2);
        if (this.c.isEmpty()) {
            return;
        }
        this.f();
        final toz k = this.k;
        if (k == null) {
            return;
        }
        if (n != 1) {
            if (n != 2) {
                if (n == 3 || n == 4) {
                    final HeatMarkerView heatMarkerView = (HeatMarkerView)k.a;
                    heatMarkerView.a.cancel();
                    heatMarkerView.a.reverse();
                    k.l(false, heatMarkerView.d = true);
                    this.b(false);
                }
            }
            else if (this.b.mf() > 0L) {
                final float n3 = (float)n2;
                final float n4 = (float)this.b.mf();
                final HeatMarkerView heatMarkerView2 = (HeatMarkerView)k.a;
                heatMarkerView2.c = n3 / n4;
                heatMarkerView2.invalidate();
            }
            return;
        }
        ((HeatMarkerView)k.a).b();
        k.l(true, false);
        this.b(true);
    }
    
    public final void i(final boolean b) {
    }
    
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
    }
    
    public final void l(final boolean b) {
    }
    
    public final void m(final boolean b) {
    }
    
    public final void n(final trs trs) {
    }
    
    public final void oR(final abea abea, final boolean b) {
        if (!abea.h.equals((Object)abea)) {
            return;
        }
        this.c.clear();
        if (!b) {
            return;
        }
        this.a();
        if (this.o) {
            this.f();
            final toz k = this.k;
            if (k != null) {
                ((HeatMarkerView)k.a).b();
                k.l(true, false);
            }
        }
    }
    
    public final void oY(final boolean b) {
    }
    
    public final void oZ(final ControlsState controlsState) {
        if (controlsState.a == abbx.a) {
            this.c.clear();
        }
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (this.h.isPresent() && view == this.h.get()) {
            this.g();
            ((View)this.h.get()).requestLayout();
            return;
        }
        view.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
    }
    
    public final void pa(final boolean b) {
    }
    
    public final void pb(final boolean b) {
    }
    
    public final void pc(final boolean b) {
    }
    
    public final void r(final fkr n) {
        if (this.n == n) {
            return;
        }
        this.n = n;
        this.g();
    }
    
    public final void s(final boolean b) {
    }
    
    public final void t(final boolean b) {
    }
    
    public final void u(final boolean b) {
    }
    
    public final void v(final boolean b) {
    }
    
    public final void w(final boolean b) {
    }
    
    public final void x(final int n) {
    }
    
    public final void y(final boolean b) {
    }
}
