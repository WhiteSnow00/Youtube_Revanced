// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.RemoteException;
import android.hardware.camera2.CameraCaptureSession;

public final class o implements Runnable
{
    public final int a;
    public final long b;
    public final Object c;
    public final Object d;
    private final int e;
    
    public o(final s c, final int a, final String d, final long b, final int e) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public o(final vo d, final CameraCaptureSession c, final int a, final long b, final int e) {
        this.e = e;
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        if (this.e != 0) {
            ((vo)this.d).a.onCaptureSequenceCompleted((CameraCaptureSession)this.c, this.a, this.b);
            return;
        }
        final Object c = this.c;
        final int a = this.a;
        final Object d = this.d;
        final long b = this.b;
        try {
            final d n = ((s)c).n;
            if (n != null) {
                n.b(a);
            }
            ((s)c).k.l(a, (String)d, b);
        }
        catch (final RemoteException ex) {
            aftr.k("Problem sending playback event to client.");
        }
    }
}
