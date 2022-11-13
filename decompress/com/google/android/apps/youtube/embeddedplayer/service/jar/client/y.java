// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.f;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.b;

final class y implements b
{
    final ac a;
    
    public y(final ac a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        this.a.s.n();
        try {
            this.a.d.N();
        }
        catch (final RemoteException ex) {
            mft.v(ex);
        }
        final f w = this.a.w;
        w.k = 0;
        w.j = 0;
        w.i = 0;
        if (w.f.hasMessages(0)) {
            w.l = "Surface was destroyed. Please make sure the fragment is fully visible on screen.";
            w.d.b();
        }
        this.a.k = false;
    }
    
    @Override
    public final void b() {
        final ac a = this.a;
        a.k = true;
        if (a.l) {
            a.b();
        }
    }
}
