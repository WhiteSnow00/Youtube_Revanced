// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared;

import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

public final class d extends eoc implements f
{
    public d(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.IHostAppVerificationErrorOverlayClient");
    }
    
    public final void a() {
        this.qX(3, this.qV());
    }
    
    public final void b(final i i) {
        final Parcel qv = this.qV();
        eoe.j(qv, (IInterface)i);
        this.qX(1, qv);
    }
    
    public final void g(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(2, qv);
    }
}
