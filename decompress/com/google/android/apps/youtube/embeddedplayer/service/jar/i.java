// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.model.PlaybackEventData;
import com.google.android.apps.youtube.embeddedplayer.service.model.b;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.s;
import com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a;

public final class i implements a
{
    private h a;
    private h b;
    private h c;
    
    public i() {
        this.a = h.a;
        final h a = h.a;
        this.b = a;
        this.c = a;
    }
    
    final void a(final s s) {
        synchronized (this) {
            if (this.a.c(s)) {
                return;
            }
            this.a = new h(s);
            final h b = this.b;
            this.c = b;
            if (b.equals(h.a)) {
                this.b = this.a;
            }
        }
    }
    
    public final void b(final BusSupported$Data busSupported$Data) {
        synchronized (this) {
            if (!busSupported$Data.d().equals(com.google.android.apps.youtube.embeddedplayer.service.model.b.f) || !(busSupported$Data instanceof PlaybackEventData)) {
                return;
            }
            final PlaybackEventData playbackEventData = (PlaybackEventData)busSupported$Data;
            if (playbackEventData.b() == 5) {
                this.c.b(playbackEventData);
                this.c = h.a;
                this.b = this.a;
                return;
            }
            if (playbackEventData.b() == 1) {
                this.c.a();
                this.c = h.a;
                this.b = this.a;
            }
            this.b.b(playbackEventData);
        }
    }
    
    public final void d() {
    }
}
