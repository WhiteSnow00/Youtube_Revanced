import android.media.MediaRouter$RouteInfo;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cdl extends cdr
{
    public cdl(final Context context, final cds cds) {
        super(context, cds);
    }
    
    @Override
    protected void m(final cdn cdn, final cca cca) {
        super.m(cdn, cca);
        cca.f(((MediaRouter$RouteInfo)cdn.a).getDeviceType());
    }
}
