// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared;

import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

public final class d extends eny implements f
{
    public d(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.IHostAppVerificationErrorOverlayClient");
    }
    
    public final void a() {
        this.qS(3, this.qQ());
    }
    
    public final void b(final i i) {
        final Parcel qq = this.qQ();
        eoa.j(qq, (IInterface)i);
        this.qS(1, qq);
    }
    
    public final void g(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(2, qq);
    }
}
