// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared;

import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a;
import android.os.Handler;

public final class h extends eod implements i
{
    public b a;
    private final Handler b;
    
    public h() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.IHostAppVerificationErrorOverlayServiceListener");
    }
    
    public h(final Handler b) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.IHostAppVerificationErrorOverlayServiceListener");
        this.b = b;
    }
    
    public final void a() {
        this.b.post((Runnable)new a(this, 8));
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            this.a();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
