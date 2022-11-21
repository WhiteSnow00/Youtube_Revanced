// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared;

import android.os.IInterface;
import android.os.Parcel;
import android.os.IBinder;

public final class a extends eoc implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiClient");
    }
    
    public final void a(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(2, qv);
    }
    
    public final void b(final f f) {
        final Parcel qv = this.qV();
        eoe.j(qv, (IInterface)f);
        this.qX(1, qv);
    }
}
