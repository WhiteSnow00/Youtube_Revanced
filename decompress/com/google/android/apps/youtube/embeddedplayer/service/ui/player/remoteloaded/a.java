// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.player.remoteloaded;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.f;

public final class a implements Runnable
{
    public f a;
    
    public a(final f a) {
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
                lma.y(ex);
            }
        }
    }
}
