// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.model.PlaybackEventData;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.t;
import com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.b;

public final class j implements b
{
    private i a;
    private i b;
    private i c;
    
    public j() {
        this.a = i.a;
        final i a = i.a;
        this.b = a;
        this.c = a;
    }
    
    final void a(final t t) {
        synchronized (this) {
            if (this.a.c(t)) {
                return;
            }
            this.a = new i(t);
            final i b = this.b;
            this.c = b;
            if (b.equals(i.a)) {
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
                this.c = i.a;
                this.b = this.a;
                return;
            }
            if (playbackEventData.b() == 1) {
                this.c.a();
                this.c = i.a;
                this.b = this.a;
            }
            this.b.b(playbackEventData);
        }
    }
    
    public final void d() {
    }
}
