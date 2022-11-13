import android.animation.TimeInterpolator;
import java.util.ArrayList;
import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyg extends dyh
{
    private final int a;
    private final dyd b;
    private final Interpolator c;
    
    public dyg(final int a, final dyd b, final Interpolator c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void b(final ArrayList list) {
        list.add(this.b);
    }
    
    protected final void k(final pvh pvh) {
        final dzc dzc = new dzc(this.a);
        final dyv dyv = new dyv(pvh.R(this.b.a));
        final dyv dyv2 = new dyv(this.b.b);
        final dyz dyz = new dyz();
        final Interpolator c = this.c;
        if (c != null) {
            final dyy dyy = new dyy((TimeInterpolator)c);
            this.l((dzd)dzc, (dzd)dyy);
            this.l((dzd)dyy, (dzd)dyz);
        }
        else {
            this.l((dzd)dzc, (dzd)dyz);
        }
        this.m((dzd)dyv, (dzd)dyz, "initial");
        this.m((dzd)dyv2, (dzd)dyz, "end");
        this.l((dzd)dyz, (dzd)pvh.S(this.b.a));
    }
}
