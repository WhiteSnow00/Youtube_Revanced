// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.f;

public final class b implements abcf
{
    public f a;
    
    public b(final f a) {
        a.getClass();
        this.a = a;
    }
    
    public final void a() {
        final f a = this.a;
        if (a != null) {
            try {
                a.tc();
            }
            catch (final RemoteException ex) {
                mft.v(ex);
            }
        }
    }
    
    public final void tc() {
        final f a = this.a;
        if (a != null) {
            try {
                a.tc();
            }
            catch (final RemoteException ex) {
                mft.v(ex);
            }
        }
    }
}
