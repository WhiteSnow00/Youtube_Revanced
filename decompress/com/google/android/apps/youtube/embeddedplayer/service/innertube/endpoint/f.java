// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.c;
import j$.util.Optional;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.b;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.d;
import java.util.Map;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.e;

public final class f implements veh
{
    private static final afhk a;
    private final veh b;
    private final e c;
    
    static {
        a = afhk.s(ahud.class);
    }
    
    public f(final veh b, final e c) {
        this.b = b;
        this.c = c;
    }
    
    public final void a(final aisc aisc) {
        veg.a((veh)this, aisc);
    }
    
    public final void b(final List list) {
        veg.b((veh)this, list);
    }
    
    @Deprecated
    public final void c(final aisc aisc, final Map map) {
        final Object a = vei.a(aisc);
        if (a != null) {
            if (f.a.contains(a.getClass()) && (aisc.b & 0x1) != 0x0) {
                final e c = this.c;
                final ahbt c2 = aisc.c;
                final Optional b = c.b();
                if (b.isEmpty()) {
                    e.g(c.b);
                }
                else {
                    final c i = ((d)b.get()).i;
                    if (i != null) {
                        i.a(new b(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.a.b, c2.I()), null);
                    }
                    else {
                        aftr.l("Unable to log click: no active logger");
                    }
                }
            }
        }
        this.b.c(aisc, map);
    }
    
    public final void d(final List list, final Map map) {
        veg.c((veh)this, list, map);
    }
    
    public final void e(final List list, final Object o) {
        veg.d((veh)this, list, o);
    }
}
