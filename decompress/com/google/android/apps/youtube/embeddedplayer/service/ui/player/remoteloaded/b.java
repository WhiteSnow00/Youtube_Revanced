// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.player.remoteloaded;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.f;

public final class b implements Runnable
{
    public f a;
    
    public b(final f a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final void run() {
        final f a = this.a;
        if (a != null) {
            try {
                a.a();
            }
            catch (final RemoteException ex) {
                jfi.ak(ex);
            }
        }
    }
}
