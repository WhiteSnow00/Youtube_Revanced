// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import java.util.Map;
import java.util.List;
import com.google.protos.youtube.api.innertube.AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint;

public final class b implements veh
{
    private final a a;
    
    public b(final a a) {
        this.a = a;
    }
    
    public final void a(final aisc aisc) {
        if (aisc != null) {
            if (((ahcu)aisc).ry((ahci)AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.adChoicesDialogEndpoint)) {
                ahmn ahmn;
                if ((ahmn = ((AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint)((ahcu)aisc).rx((ahci)AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.adChoicesDialogEndpoint)).b) == null) {
                    ahmn = ahmn.a;
                }
                if ((ahmn.b & 0x1) != 0x0) {
                    final a a = this.a;
                    ahmn ahmn2;
                    if ((ahmn2 = ((AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint)((ahcu)aisc).rx((ahci)AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.adChoicesDialogEndpoint)).b) == null) {
                        ahmn2 = ahmn.a;
                    }
                    ajtu ajtu;
                    if ((ajtu = ahmn2.c) == null) {
                        ajtu = ajtu.a;
                    }
                    a.a(ajtu);
                }
            }
        }
    }
    
    public final void b(final List list) {
        veg.b((veh)this, list);
    }
    
    public final void c(final aisc aisc, final Map map) {
        this.a(aisc);
    }
    
    public final void d(final List list, final Map map) {
        veg.c((veh)this, list, map);
    }
    
    public final void e(final List list, final Object o) {
        veg.d((veh)this, list, o);
    }
}
