import android.media.MediaRouter$RouteInfo;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cdm extends cds
{
    public cdm(final Context context, final cdt cdt) {
        super(context, cdt);
    }
    
    @Override
    protected void m(final cdo cdo, final ccb ccb) {
        super.m(cdo, ccb);
        ccb.f(((MediaRouter$RouteInfo)cdo.a).getDeviceType());
    }
}
