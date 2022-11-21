import android.media.MediaRouter$RouteInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cdq extends cck
{
    private final Object a;
    
    public cdq(final Object a) {
        this.a = a;
    }
    
    @Override
    public final void b(final int n) {
        ((MediaRouter$RouteInfo)this.a).requestSetVolume(n);
    }
    
    @Override
    public final void c(final int n) {
        ((MediaRouter$RouteInfo)this.a).requestUpdateVolume(n);
    }
}
