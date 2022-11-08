// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded.a;

public final class e extends enz implements f
{
    public c a;
    public a b;
    private final Handler c;
    
    public e() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.IHostAppVerificationErrorOverlayClient");
    }
    
    public e(final c a, final Handler c) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.IHostAppVerificationErrorOverlayClient");
        this.a = a;
        this.c = c;
    }
    
    public final void a() {
        this.c.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 11));
    }
    
    public final void b(final i i) {
        this.c.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c(this, i, 19));
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    return false;
                }
                this.a();
            }
            else {
                final boolean k = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.g(k);
            }
        }
        else {
            final IBinder strongBinder = parcel.readStrongBinder();
            Object o;
            if (strongBinder == null) {
                o = null;
            }
            else {
                final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.IHostAppVerificationErrorOverlayServiceListener");
                if (queryLocalInterface instanceof i) {
                    o = queryLocalInterface;
                }
                else {
                    o = new g(strongBinder);
                }
            }
            this.enforceNoDataAvail(parcel);
            this.b((i)o);
        }
        parcel2.writeNoException();
        return true;
    }
    
    public final void g(final boolean b) {
        this.c.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.a(this, b, 17));
    }
}
