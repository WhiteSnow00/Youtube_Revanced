// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.IBinder;

public final class d extends enz implements f
{
    public d(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayServiceListener");
    }
    
    public final void a(final Bundle bundle) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)null);
        this.qY(2, qw);
    }
    
    public final void b() {
        this.qY(1, this.qW());
    }
    
    public final void d() {
        this.qY(3, this.qW());
    }
    
    public final void e(final int n, final int n2) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        qw.writeInt(n2);
        this.qY(4, qw);
    }
}
