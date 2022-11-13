// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded;

import android.os.RemoteException;

public final class d implements b
{
    private final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d b;
    private final int c;
    
    public d(final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    public final void a(final int n) {
        try {
            this.b.d(this.c, n);
        }
        catch (final RemoteException ex) {
            mft.v(ex);
        }
    }
    
    public final void b(final byte[] array) {
        try {
            this.b.e(this.c, array);
        }
        catch (final RemoteException ex) {
            mft.v(ex);
        }
    }
    
    public final void c(final int n) {
        try {
            this.b.j(this.c, n);
        }
        catch (final RemoteException ex) {
            mft.v(ex);
        }
    }
    
    public final void d(final byte[] array) {
        try {
            this.b.k(this.c, array);
        }
        catch (final RemoteException ex) {
            mft.v(ex);
        }
    }
}
