// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.f;

public final class c implements abdm
{
    public f a;
    
    public c(final f a) {
        a.getClass();
        this.a = a;
    }
    
    public final void a() {
        final f a = this.a;
        if (a != null) {
            try {
                a.b();
            }
            catch (final RemoteException ex) {
                lma.y(ex);
            }
        }
    }
    
    public final void b() {
        final f a = this.a;
        if (a != null) {
            try {
                a.b();
            }
            catch (final RemoteException ex) {
                lma.y(ex);
            }
        }
    }
}
