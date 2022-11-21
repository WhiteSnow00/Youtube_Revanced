import android.content.ComponentName;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class ccl
{
    public final Context e;
    public final ccj f;
    public final cci g;
    public ccg h;
    public boolean i;
    public ccm j;
    public boolean k;
    public oqz l;
    
    public ccl(final Context context) {
        this(context, null);
    }
    
    public ccl(final Context e, final ccj f) {
        this.g = new cci(this);
        if (e == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.e = e;
        if (f == null) {
            this.f = new ccj(new ComponentName(e, (Class)this.getClass()));
            return;
        }
        this.f = f;
    }
    
    public cck b(final String s) {
        throw null;
    }
    
    public void d(final ccg ccg) {
    }
    
    public cch lc(final String s) {
        if (s != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }
    
    public cck ld(final String s, final String s2) {
        if (s == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (s2 != null) {
            return this.b(s);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }
    
    public final void le(final ccm j) {
        dmo.r();
        if (this.j != j) {
            this.j = j;
            if (!this.k) {
                this.k = true;
                this.g.sendEmptyMessage(1);
            }
        }
    }
    
    public final void lf(final ccg ccg) {
        dmo.r();
        if (akq.b((Object)this.h, (Object)ccg)) {
            return;
        }
        this.lg(ccg);
    }
    
    public final void lg(final ccg h) {
        this.h = h;
        if (!this.i) {
            this.i = true;
            this.g.sendEmptyMessage(2);
        }
    }
    
    public final void lh(final oqz l) {
        dmo.r();
        this.l = l;
    }
}
