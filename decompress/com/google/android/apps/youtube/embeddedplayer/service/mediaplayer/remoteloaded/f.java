// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded;

import android.os.RemoteException;
import android.view.SurfaceHolder;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.i;
import android.view.SurfaceHolder$Callback;

public final class f implements SurfaceHolder$Callback
{
    public i a;
    public d b;
    
    public f(final i a, final d b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public final void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
        final i a = this.a;
        if (a != null) {
            try {
                a.a(n, n2, n3);
            }
            catch (final RemoteException ex) {
                lma.y(ex);
            }
        }
    }
    
    public final void surfaceCreated(final SurfaceHolder surfaceHolder) {
        final i a = this.a;
        if (a != null) {
            try {
                a.b(surfaceHolder.getSurface());
            }
            catch (final RemoteException ex) {
                lma.y(ex);
            }
            final d b = this.b;
            if (b != null) {
                surfaceHolder.getSurface();
                b.a.b();
            }
        }
    }
    
    public final void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        final i a = this.a;
        if (a != null) {
            try {
                a.g();
            }
            catch (final RemoteException ex) {
                lma.y(ex);
            }
            final d b = this.b;
            if (b != null) {
                b.a.a();
            }
        }
    }
}
