import androidx.mediarouter.app.MediaRouteButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbc extends bkx
{
    final MediaRouteButton a;
    
    public cbc(final MediaRouteButton a) {
        this.a = a;
    }
    
    public final void d() {
        this.a.a();
    }
    
    public final void e() {
        this.a.a();
    }
    
    public final void f() {
        this.a.a();
    }
    
    public final void g(final ccw ccw) {
        this.a.a();
    }
    
    public final void h(final ccw ccw) {
        this.a.a();
    }
    
    public final void i(final ccw ccw) {
        this.a.a();
    }
    
    public final void j() {
        this.a.a();
    }
    
    public final void l(final cdd cdd) {
        final boolean b = cdd != null && cdd.d.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON");
        final MediaRouteButton a = this.a;
        if (a.b != b) {
            a.b = b;
            a.refreshDrawableState();
        }
    }
    
    public final void n() {
        this.a.a();
    }
}
