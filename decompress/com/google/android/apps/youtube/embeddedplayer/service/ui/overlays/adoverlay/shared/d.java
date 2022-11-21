// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.IBinder;

public final class d extends eoc implements f
{
    public d(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayServiceListener");
    }
    
    public final void a(final Bundle bundle) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)null);
        this.qX(2, qv);
    }
    
    public final void b() {
        this.qX(1, this.qV());
    }
    
    public final void d() {
        this.qX(3, this.qV());
    }
    
    public final void e(final int n, final int n2) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        qv.writeInt(n2);
        this.qX(4, qv);
    }
}
