import android.support.v7.widget.LinearLayoutManager;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.support.v7.widget.RecyclerView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsx extends dst
{
    @dyi(a = 3)
    @dyj(a = dyk.a)
    long a;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    long b;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    iw c;
    
    public gsx() {
        super("ClipStoryboard");
    }
    
    protected final int K() {
        return 1;
    }
    
    protected final Object R(final Context context) {
        return new gtw(context);
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aa(final dsx dsx, final Object o) {
        final gtw gtw = (gtw)o;
        final long b = this.b;
        final iw c = this.c;
        final long a = this.a;
        gtw.ac = a;
        gtw.af = b;
        if (gtw.ab == null) {
            gtw.getContext();
            (gtw.ab = (LinearLayoutManager)new gtq(gtw)).ac(0);
            gtw.af((nw)gtw.ab);
        }
        gtt gtt = (gtt)gtw.m;
        if (gtt == null) {
            gtt = (gtt)gtw.aa.a();
            gtw.ac((nq)gtt);
        }
        else {
            ((nq)gtt).p((RecyclerView)gtw);
        }
        gtt.a = b;
        gtt.e = a;
        gtt.f = gtt.x();
        ((nq)gtt).rZ();
        final iw ag = gtw.ag;
        if (ag != null) {
            if (ag != c) {
                gtw.aH(ag);
                gtw.ag = c;
            }
        }
        else {
            gtw.ag = c;
        }
        if (gtw.ah == null) {
            gtw.ah = (iw)new gtr(gtw);
        }
        if (gtw.ae == null) {
            (gtw.ae = new gte()).addUpdateListener((ValueAnimator$AnimatorUpdateListener)new qh(gtw, 11));
            final gte ae = gtw.ae;
            ae.setDuration(100L);
            ae.setInterpolator((TimeInterpolator)new LinearInterpolator());
            ae.addListener((Animator$AnimatorListener)new gtd(ae, 0));
        }
        c.b((RecyclerView)gtw, 100);
    }
    
    protected final void ac(final dsx dsx, final Object o) {
        final gtt gtt = (gtt)((gtw)o).m;
        if (gtt != null) {
            ((nq)gtt).u();
        }
    }
    
    public final boolean am() {
        return true;
    }
    
    public final int an() {
        return 3;
    }
    
    protected final boolean ay(final dst dst, final dst dst2) {
        final gsx gsx = (gsx)dst;
        final gsx gsx2 = (gsx)dst2;
        final Object o = null;
        Object value;
        if (gsx == null) {
            value = null;
        }
        else {
            value = gsx.b;
        }
        final dub dub = new dub(value, (Object)gsx2.b);
        Object value2;
        if (gsx == null) {
            value2 = o;
        }
        else {
            value2 = gsx.a;
        }
        final dub dub2 = new dub(value2, (Object)gsx2.a);
        return !hko.N(dub) || !hko.N(dub2);
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst != null && this.getClass() == dst.getClass()) {
            final gsx gsx = (gsx)dst;
            final iw c = this.c;
            if (c != null) {
                if (c.equals(gsx.c)) {
                    return this.a == gsx.a && this.b == gsx.b;
                }
            }
            else if (gsx.c == null) {
                return this.a == gsx.a && this.b == gsx.b;
            }
            return false;
        }
        return false;
    }
}
