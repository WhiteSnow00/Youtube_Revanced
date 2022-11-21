// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared;

import android.os.Parcel;
import android.os.IBinder;

public final class a extends eoc implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.IPaidContentOverlayClient");
    }
    
    public final void a(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, false);
        this.qX(2, qv);
    }
    
    public final void b(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(6, qv);
    }
    
    public final void g(final long n) {
        final Parcel qv = this.qV();
        qv.writeLong(n);
        this.qX(4, qv);
    }
    
    public final void h(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(5, qv);
    }
    
    public final void i(final CharSequence charSequence) {
        final Parcel qv = this.qV();
        eoe.g(qv, charSequence);
        this.qX(3, qv);
    }
    
    public final void j() {
        this.qX(1, this.qV());
    }
}
