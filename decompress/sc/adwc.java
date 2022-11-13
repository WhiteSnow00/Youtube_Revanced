import android.graphics.Rect;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adwc implements alw
{
    final Object a;
    private final int b;
    
    public adwc(final adsv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adwc(final adwd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adwc(final adzf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final aob a(final View view, final aob aob) {
        final int b = this.b;
        final boolean b2 = true;
        if (b == 0) {
            final adwd adwd = (adwd)this.a;
            if (adwd.b == null) {
                adwd.b = new Rect();
            }
            ((adwd)this.a).b.set(aob.b(), aob.d(), aob.c(), aob.a());
            ((adwd)this.a).a(aob);
            final Object a = this.a;
            boolean willNotDraw = b2;
            if (!aob.b.d().equals((Object)aib.a)) {
                willNotDraw = (((adwd)this.a).a == null && b2);
            }
            ((adwd)a).setWillNotDraw(willNotDraw);
            anb.H((View)this.a);
            return aob.l();
        }
        if (b != 1) {
            ((adzf)this.a).n = aob.a();
            ((adzf)this.a).o = aob.b();
            ((adzf)this.a).p = aob.c();
            ((adzf)this.a).j();
            return aob;
        }
        final Object a2 = this.a;
        aob i;
        if (!anb.ai((View)a2)) {
            i = null;
        }
        else {
            i = aob;
        }
        final adsv adsv = (adsv)a2;
        if (!akp.b((Object)adsv.i, (Object)i)) {
            adsv.i = i;
            adsv.requestLayout();
        }
        return aob.l();
    }
}
