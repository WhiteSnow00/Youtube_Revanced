import androidx.mediarouter.app.MediaRouteButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class caz extends bku
{
    final MediaRouteButton h;
    
    public caz(final MediaRouteButton h) {
        this.h = h;
    }
    
    @Override
    public final void f() {
        this.h.a();
    }
    
    @Override
    public final void g() {
        this.h.a();
    }
    
    @Override
    public final void h() {
        this.h.a();
    }
    
    @Override
    public final void i(final cct cct) {
        this.h.a();
    }
    
    @Override
    public final void j(final cct cct) {
        this.h.a();
    }
    
    @Override
    public final void k(final cct cct) {
        this.h.a();
    }
    
    @Override
    public final void l() {
        this.h.a();
    }
    
    @Override
    public final void n(final cda cda) {
        final boolean b = cda != null && cda.d.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON");
        final MediaRouteButton h = this.h;
        if (h.b != b) {
            h.b = b;
            h.refreshDrawableState();
        }
    }
    
    @Override
    public final void p() {
        this.h.a();
    }
}
