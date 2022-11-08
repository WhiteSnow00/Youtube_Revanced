// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import com.google.android.apps.youtube.embeddedplayer.service.model.PlayerViewModeData;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.b;

public final class c implements b
{
    public final atir a;
    private final /* synthetic */ int b;
    
    public c(final int b) {
        this.b = b;
        this.a = atir.e();
    }
    
    public c(final int b, final byte[] array) {
        this.b = b;
        this.a = atir.e();
    }
    
    public final void b(final BusSupported$Data busSupported$Data) {
        if (this.b != 0) {
            if (busSupported$Data.d().equals((Object)com.google.android.apps.youtube.embeddedplayer.service.model.b.g)) {
                if (busSupported$Data instanceof PlayerViewModeData) {
                    this.a.tr((Object)busSupported$Data);
                }
            }
            return;
        }
        if (busSupported$Data.d().equals((Object)com.google.android.apps.youtube.embeddedplayer.service.model.b.e)) {
            if (busSupported$Data instanceof MutedAutoplayState) {
                this.a.tr((Object)busSupported$Data);
            }
        }
    }
    
    public final void d() {
    }
}
