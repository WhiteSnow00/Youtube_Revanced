// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import java.util.Iterator;
import android.net.Uri;
import android.content.Intent;
import com.google.protos.youtube.api.innertube.AndroidIntentActionEndpointOuterClass;
import java.util.List;
import java.util.Map;

public final class c implements veh
{
    private final oqz a;
    
    public c(final oqz a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
    }
    
    public final void a(final aisc aisc) {
        this.c(aisc, null);
    }
    
    public final void b(final List list) {
        veg.b((veh)this, list);
    }
    
    public final void c(final aisc aisc, final Map map) {
        final oqz a = this.a;
        final ahud ahud = (ahud)((ahcu)aisc).rx((ahci)AndroidIntentActionEndpointOuterClass.androidIntentActionEndpoint);
        final Intent intent = new Intent(ahud.d);
        intent.setPackage(ahud.c);
        if ((ahud.b & 0x4) != 0x0) {
            intent.setData(Uri.parse(ahud.e));
        }
        for (final almt almt : ahud.f) {
            final String e = almt.e;
            String s;
            if (almt.c == 2) {
                s = (String)almt.d;
            }
            else {
                s = "";
            }
            intent.putExtra(e, s);
        }
        ((lpd)a.a).t(intent);
    }
    
    public final void d(final List list, final Map map) {
        veg.c((veh)this, list, map);
    }
    
    public final void e(final List list, final Object o) {
        veg.d((veh)this, list, o);
    }
}
