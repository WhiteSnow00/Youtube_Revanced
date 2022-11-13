// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.t;
import com.google.android.apps.youtube.embeddedplayer.service.model.FragmentKeyData;
import com.google.android.apps.youtube.embeddedplayer.service.model.ErrorData;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.b;

public final class g implements b
{
    final h a;
    private final int b;
    
    public g(final h a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void b(final BusSupported$Data busSupported$Data) {
        if (this.b != 0) {
            if (busSupported$Data.d().equals(com.google.android.apps.youtube.embeddedplayer.service.model.b.b)) {
                if (busSupported$Data instanceof ErrorData) {
                    final int a = ((ErrorData)busSupported$Data).a;
                    final t b = this.a.b;
                    if (b != null) {
                        b.d.post((Runnable)new ccm(b, a, 17));
                    }
                }
            }
            return;
        }
        if (busSupported$Data.d().equals(com.google.android.apps.youtube.embeddedplayer.service.model.b.d)) {
            if (busSupported$Data instanceof FragmentKeyData) {
                final h a2 = this.a;
                a2.e.a(((FragmentKeyData)busSupported$Data).a(), a2.b);
            }
        }
    }
    
    public final void d() {
    }
}
