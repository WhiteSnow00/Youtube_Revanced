import android.content.ComponentName;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class cch
{
    public final Context e;
    public final ccf f;
    public final cce g;
    public ccc h;
    public boolean i;
    public cci j;
    public boolean k;
    public qpt l;
    
    public cch(final Context context) {
        this(context, null);
    }
    
    public cch(final Context e, final ccf f) {
        this.g = new cce(this);
        if (e == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.e = e;
        if (f == null) {
            this.f = new ccf(new ComponentName(e, (Class)this.getClass()));
            return;
        }
        this.f = f;
    }
    
    public ccg b(final String s) {
        throw null;
    }
    
    public void d(final ccc ccc) {
    }
    
    public ccd lc(final String s) {
        if (s != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }
    
    public ccg ld(final String s, final String s2) {
        if (s == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (s2 != null) {
            return this.b(s);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }
    
    public final void le(final cci j) {
        dmk.r();
        if (this.j != j) {
            this.j = j;
            if (!this.k) {
                this.k = true;
                this.g.sendEmptyMessage(1);
            }
        }
    }
    
    public final void lf(final ccc ccc) {
        dmk.r();
        if (ako.b((Object)this.h, (Object)ccc)) {
            return;
        }
        this.lg(ccc);
    }
    
    public final void lg(final ccc h) {
        this.h = h;
        if (!this.i) {
            this.i = true;
            this.g.sendEmptyMessage(2);
        }
    }
    
    public final void lh(final qpt l) {
        dmk.r();
        this.l = l;
    }
}
