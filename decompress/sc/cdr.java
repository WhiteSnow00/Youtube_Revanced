import android.view.Display;
import android.media.MediaRouter$RouteInfo;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

class cdr extends cdq implements ccv
{
    private tg r;
    private bly s;
    
    public cdr(final Context context, final cdt cdt) {
        super(context, cdt);
    }
    
    protected boolean C(final cdo cdo) {
        if (this.s == null) {
            this.s = new bly();
        }
        final Object a = cdo.a;
        throw null;
    }
    
    protected void m(final cdo cdo, final ccb ccb) {
        super.m(cdo, ccb);
        if (!((MediaRouter$RouteInfo)cdo.a).isEnabled()) {
            ccb.g(false);
        }
        if (this.C(cdo)) {
            ccb.d(1);
        }
        final Display b = cdk.b(cdo.a);
        if (b != null) {
            ccb.j(b.getDisplayId());
        }
    }
    
    protected final Object q() {
        return new ccz(this);
    }
    
    protected void y() {
        super.y();
        if (this.r == null) {
            this.r = new tg(2, (byte[])null);
        }
        throw null;
    }
}
