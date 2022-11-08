// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared;

import android.os.Parcel;
import android.os.IBinder;

public final class a extends eny implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.IPaidContentOverlayClient");
    }
    
    public final void a(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, false);
        this.qS(2, qq);
    }
    
    public final void b(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(6, qq);
    }
    
    public final void g(final long n) {
        final Parcel qq = this.qQ();
        qq.writeLong(n);
        this.qS(4, qq);
    }
    
    public final void h(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(5, qq);
    }
    
    public final void i(final CharSequence charSequence) {
        final Parcel qq = this.qQ();
        eoa.g(qq, charSequence);
        this.qS(3, qq);
    }
    
    public final void j() {
        this.qS(1, this.qQ());
    }
}
