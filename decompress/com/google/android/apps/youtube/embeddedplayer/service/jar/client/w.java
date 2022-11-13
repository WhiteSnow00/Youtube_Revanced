// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.RemoteException;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.b;

public final class w implements b
{
    final Object a;
    private final int b;
    
    public w(final aehe a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public w(final ac a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final boolean a(final VisibilityChangeEventData visibilityChangeEventData) {
        if (this.b != 0) {
            return ((aehe)this.a).F(visibilityChangeEventData);
        }
        final boolean f = ((ac)this.a).f();
        boolean b = false;
        if (f) {
            try {
                ((ac)this.a).d.s(visibilityChangeEventData);
                b = true;
            }
            catch (final RemoteException ex) {
                mft.v(ex);
            }
        }
        return b;
    }
}
