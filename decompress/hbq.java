import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbq implements umo
{
    public final hbt a;
    public final Bitmap b;
    public final View c;
    public final ViewGroup$LayoutParams d;
    public final ViewGroup e;
    public final ahfu f;
    
    public hbq(final hbt a, final Bitmap b, final View c, final ViewGroup$LayoutParams d, final ViewGroup e, final ahfu f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final uou uou) {
        final hbt a = this.a;
        final Bitmap b = this.b;
        final View c = this.c;
        final ViewGroup$LayoutParams d = this.d;
        final ViewGroup e = this.e;
        final ahfu f = this.f;
        if (a.e) {
            return;
        }
        b.recycle();
        c.setLayoutParams(d);
        e.addView(c);
        if (a.b == null) {
            a.b = aqzt.l();
        }
        final aqzr i = a.b.i();
        aqyd a2;
        if (i.c == 4) {
            a2 = (aqyd)i.d;
        }
        else {
            a2 = aqyd.a;
        }
        aqxx aqxx;
        if ((aqxx = a2.c) == null) {
            aqxx = aqxx.a;
        }
        final ahaz builder = ((ahbh)aqxx).toBuilder();
        final String c2 = uou.c;
        builder.copyOnWrite();
        final aqxx aqxx2 = (aqxx)builder.instance;
        c2.getClass();
        aqxx2.b = 1;
        aqxx2.c = c2;
        final aqxx c3 = (aqxx)builder.build();
        final aqzr j = a.b.i();
        aqyd a3;
        if (j.c == 4) {
            a3 = (aqyd)j.d;
        }
        else {
            a3 = aqyd.a;
        }
        final ahaz builder2 = ((ahbh)a3).toBuilder();
        builder2.copyOnWrite();
        final aqyd aqyd = (aqyd)builder2.instance;
        c3.getClass();
        aqyd.c = c3;
        aqyd.b |= 0x1;
        final aqyd d2 = (aqyd)builder2.build();
        final ahaz builder3 = ((ahbh)a.b.i()).toBuilder();
        builder3.copyOnWrite();
        final aqzr aqzr = (aqzr)builder3.instance;
        d2.getClass();
        aqzr.d = d2;
        aqzr.c = 4;
        final aqzr aqzr2 = (aqzr)builder3.build();
        final aqzs aqzs = (aqzs)((ahbh)a.b).toBuilder();
        ((ahaz)aqzs).copyOnWrite();
        aqzt.r((aqzt)aqzs.instance, aqzr2);
        vdh.aj(aqzs, uou);
        ((ahaz)aqzs).copyOnWrite();
        aqzt.s((aqzt)aqzs.instance, f);
        a.d.a((aqzt)((ahaz)aqzs).build());
    }
}
