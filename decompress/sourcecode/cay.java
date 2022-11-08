import androidx.mediarouter.app.MediaRouteButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cay extends bkt
{
    final /* synthetic */ MediaRouteButton h;
    
    public cay(final MediaRouteButton h) {
        this.h = h;
    }
    
    public final void f() {
        this.h.a();
    }
    
    public final void g() {
        this.h.a();
    }
    
    public final void h() {
        this.h.a();
    }
    
    public final void i(final ccs ccs) {
        this.h.a();
    }
    
    public final void j(final ccs ccs) {
        this.h.a();
    }
    
    public final void k(final ccs ccs) {
        this.h.a();
    }
    
    public final void l() {
        this.h.a();
    }
    
    public final void n(final ccz ccz) {
        final boolean b = ccz != null && ccz.d.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON");
        final MediaRouteButton h = this.h;
        if (h.b != b) {
            h.b = b;
            h.refreshDrawableState();
        }
    }
    
    public final void p() {
        this.h.a();
    }
}
