// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.Map;
import java.util.List;

public final class g implements veh
{
    private final oqz a;
    
    public g(final oqz a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
    }
    
    public final void a(final aisc aisc) {
        veg.a((veh)this, aisc);
    }
    
    public final void b(final List list) {
        veg.b((veh)this, list);
    }
    
    public final void c(final aisc a, final Map map) {
        if (a != null) {
            if (((ahcu)a).ry((ahci)WatchEndpointOuterClass.watchEndpoint)) {
                final abkw d = PlaybackStartDescriptor.d();
                d.a = a;
                this.a.m(d.a());
            }
        }
    }
    
    public final void d(final List list, final Map map) {
        veg.c((veh)this, list, map);
    }
    
    public final void e(final List list, final Object o) {
        veg.d((veh)this, list, o);
    }
}
