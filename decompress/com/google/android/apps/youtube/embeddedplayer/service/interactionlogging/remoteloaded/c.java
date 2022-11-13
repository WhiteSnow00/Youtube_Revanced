// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d;

public final class c implements b
{
    private final d b;
    
    public c(final d b) {
        this.b = b;
    }
    
    public final void a(final int n) {
        try {
            this.b.b(n);
        }
        catch (final RemoteException ex) {
            mft.v(ex);
        }
    }
    
    public final void b(final byte[] array) {
        try {
            this.b.c(array);
        }
        catch (final RemoteException ex) {
            mft.v(ex);
        }
    }
    
    public final void c(final int n) {
        try {
            this.b.h(n);
        }
        catch (final RemoteException ex) {
            mft.v(ex);
        }
    }
    
    public final void d(final byte[] array) {
        try {
            this.b.i(array);
        }
        catch (final RemoteException ex) {
            mft.v(ex);
        }
    }
}
