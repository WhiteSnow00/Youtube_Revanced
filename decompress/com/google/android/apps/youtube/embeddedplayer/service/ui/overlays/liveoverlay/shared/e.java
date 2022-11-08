// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared;

import android.os.Parcel;

public final class e extends enz implements f, abak
{
    public abak a;
    
    public e() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.ILiveOverlayServiceListener");
    }
    
    public final void a() {
        this.a.a();
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            this.sW();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
    
    public final void sW() {
        this.a.sW();
    }
}
