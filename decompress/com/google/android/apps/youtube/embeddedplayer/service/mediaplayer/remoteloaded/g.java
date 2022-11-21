// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded;

import android.os.RemoteException;
import android.view.Surface;
import android.graphics.SurfaceTexture;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.o;
import android.view.TextureView$SurfaceTextureListener;

public final class g implements TextureView$SurfaceTextureListener
{
    public o a;
    public h b;
    
    public g(final o a, final h b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public final void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        if (this.a == null) {
            return;
        }
        final Surface surface = new Surface(surfaceTexture);
        try {
            this.a.b(surface);
        }
        catch (final RemoteException ex) {
            lma.y(ex);
        }
        final h b = this.b;
        if (b != null) {
            b.b.b();
        }
    }
    
    public final boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
        final o a = this.a;
        if (a != null) {
            try {
                a.g();
            }
            catch (final RemoteException ex) {
                lma.y(ex);
            }
            final h b = this.b;
            if (b != null) {
                b.b.a();
            }
        }
        return true;
    }
    
    public final void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        final o a = this.a;
        if (a != null) {
            try {
                a.a(n, n2);
            }
            catch (final RemoteException ex) {
                lma.y(ex);
            }
        }
    }
    
    public final void onSurfaceTextureUpdated(final SurfaceTexture surfaceTexture) {
        final o a = this.a;
        if (a != null) {
            try {
                a.h();
            }
            catch (final RemoteException ex) {
                lma.y(ex);
            }
        }
    }
}
