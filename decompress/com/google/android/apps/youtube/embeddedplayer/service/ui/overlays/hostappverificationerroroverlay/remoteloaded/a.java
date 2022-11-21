// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.i;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.b;

public final class a implements b
{
    public i a;
    
    public a(final i a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        final i a = this.a;
        if (a != null) {
            try {
                a.a();
            }
            catch (final RemoteException ex) {
                lma.y(ex);
            }
        }
    }
}
