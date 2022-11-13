import java.util.Iterator;
import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBarWrapper;
import java.util.function.Predicate;
import android.view.ViewStub;
import android.graphics.Point;
import android.graphics.Rect;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.HashSet;
import android.view.View;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izd implements fpn
{
    public final Set a;
    public final Set b;
    public Set c;
    public Set d;
    public Set e;
    final abdw f;
    final fpl g;
    final fpm h;
    final fpk i;
    public jki j;
    private abds k;
    private View l;
    private final Set m;
    private final Set n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private final vai s;
    
    public izd(final vai s) {
        this.s = s;
        this.a = new HashSet();
        this.b = new HashSet();
        final afiq a = afiq.a;
        this.c = (Set)a;
        this.d = (Set)a;
        this.e = (Set)a;
        Object a2;
        if (s.bG()) {
            this.n = new HashSet();
            a2 = new HashSet();
        }
        else {
            a2 = afiq.a;
            this.n = (Set)a2;
        }
        this.m = (Set)a2;
        this.f = (abdw)new jcj(this, 1);
        this.g = (fpl)new izc(this);
        this.h = (fpm)new iyz(this, 0);
        this.i = (fpk)new izi(this, 1);
    }
    
    private final long D(final Function function, final String s) {
        final jki j = this.j;
        if (j == null) {
            ttr.m("WWTimeBarController", String.format("%s: no active timebar", s));
            return 0L;
        }
        return (long)function.apply(j.a);
    }
    
    private final void E(final Consumer consumer, final String s) {
        final jki j = this.j;
        if (j == null) {
            ttr.m("WWTimeBarController", String.format("%s: no active timebar", s));
            return;
        }
        consumer.accept(j.a);
    }
    
    private final void F(final Consumer consumer) {
        Collection$_EL.stream((Collection)this.a).forEach((Consumer)new inj(consumer, 14));
    }
    
    public final void A(final int o) {
        this.o = o;
        this.F((Consumer)new iza(o, 1));
    }
    
    public final long c() {
        return this.D((Function)ipe.m, "getRelativeBufferedTimeMillis");
    }
    
    public final long d() {
        return this.D((Function)ipe.k, "getScrubberPositionTimeMillis");
    }
    
    public final View e() {
        final jki j = this.j;
        if (j == null) {
            ttr.m("WWTimeBarController", String.format("%s: no active timebar", "getView"));
            return null;
        }
        return (View)j.a;
    }
    
    public final abds f() {
        final abds k = this.k;
        k.getClass();
        return k;
    }
    
    public final void g(final Rect rect) {
        this.E((Consumer)new inj(rect, 9), "getScrubberBounds");
    }
    
    public final void h(final Point point) {
        this.E((Consumer)new inj(point, 15), "getSeekTimePosition");
    }
    
    public final void j() {
        this.E(hvn.n, "maybeCompleteScrub");
    }
    
    public final void k(final int n) {
        this.E((Consumer)new iza(n, 4), "maybeMoveScrub");
    }
    
    public final void l(final int n) {
        this.E((Consumer)new iza(n, 2), "maybeStartScrub");
    }
    
    public final long lY() {
        return this.D((Function)ipe.j, "getDisplayCurrentTimeMillis");
    }
    
    public final View m(final ViewStub viewStub, final Predicate predicate) {
        final InlineTimeBarWrapper inlineTimeBarWrapper = (InlineTimeBarWrapper)viewStub.inflate();
        inlineTimeBarWrapper.setVisibility(0);
        final fpe a = inlineTimeBarWrapper.a;
        if (!this.s.bG()) {
            adkp.R(this.r ^ true, "cannot add timebar after finalization");
        }
        this.a.add(new jki((fpn)a, predicate));
        final abds k = this.k;
        if (k == null) {
            this.k = ((fpn)a).f();
        }
        else {
            ((fpn)a).mg((abdv)k);
        }
        ((fpn)a).q(this.f);
        a.u = this.g;
        ((fpn)a).r(this.h);
        a.t = aezp.k((Object)this.i);
        ((fpn)a).A(this.o);
        ((fpn)a).w(this.p);
        ((fpn)a).setClickable(this.q);
        if (this.s.bG()) {
            final Iterator iterator = this.m.iterator();
            while (iterator.hasNext()) {
                ((fpn)a).o((View)iterator.next());
            }
            final Iterator iterator2 = this.n.iterator();
            while (iterator2.hasNext()) {
                ((fpn)a).n((View)iterator2.next());
            }
            final View l = this.l;
            if (l != null) {
                ((fpn)a).t(l);
            }
        }
        return (View)inlineTimeBarWrapper;
    }
    
    public final boolean mb() {
        final ipe l = ipe.l;
        final jki j = this.j;
        boolean booleanValue;
        if (j == null) {
            booleanValue = false;
            ttr.m("WWTimeBarController", String.format("%s: no active timebar", "isScrubbing"));
        }
        else {
            booleanValue = ((Function<Object, Boolean>)l).apply(j.a);
        }
        return booleanValue;
    }
    
    public final void mc() {
        this.E(new hvn(14), "setScrubbing");
    }
    
    public final long me() {
        return this.D((Function)ipe.n, "getDisplayScrubberTimeMillis");
    }
    
    public final long mf() {
        return this.D((Function)ipe.o, "getRelativeTotalTimeMillis");
    }
    
    public final /* bridge */ void mg(final abdv abdv) {
        final abds k = (abds)abdv;
        this.k = k;
        this.F((Consumer)new inj(k, 11));
    }
    
    public final void n(final View view) {
        this.F((Consumer)new inj(view, 10));
        if (this.s.bG()) {
            this.n.add(view);
            return;
        }
        this.r = true;
    }
    
    public final void o(final View view) {
        this.F((Consumer)new inj(view, 13));
        if (this.s.bG()) {
            this.m.add(view);
            return;
        }
        this.r = true;
    }
    
    public final void p(final boolean b, final boolean b2) {
        this.F((Consumer)new izb(b, b2, 1));
    }
    
    public final void q(final abdw abdw) {
        this.b.add(abdw);
    }
    
    public final void r(final fpm fpm) {
        this.d = (Set)afft.s((Object)fpm);
    }
    
    public final void s(final boolean b) {
        this.F((Consumer)new iyg(b, 3));
    }
    
    public final void sendAccessibilityEvent(final int n) {
        this.E(new hvn(13), "sendAccessibilityEvent");
    }
    
    public final void setAlpha(final float n) {
        this.F((Consumer)new kru(n, 1));
    }
    
    public final void setClickable(final boolean q) {
        this.q = q;
        this.F((Consumer)new iyg(q, 4));
    }
    
    public final void setVisibility(final int n) {
        throw null;
    }
    
    public final void t(final View l) {
        this.F((Consumer)new inj(l, 12));
        if (this.s.bG()) {
            this.l = l;
            return;
        }
        this.r = true;
    }
    
    public final void u(final int n) {
        this.F((Consumer)new iza(n, 0));
    }
    
    public final void v(final fpl fpl) {
        this.c = (Set)afft.s((Object)fpl);
    }
    
    public final void w(final int p) {
        this.p = p;
        this.F((Consumer)new iza(p, 3));
    }
    
    public final void x(final boolean b, final boolean b2) {
        this.F((Consumer)new izb(b, b2, 0));
    }
    
    public final void y(final abdw abdw) {
        this.b.remove(abdw);
    }
}
