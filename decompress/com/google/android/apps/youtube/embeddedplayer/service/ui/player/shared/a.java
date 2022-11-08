// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared;

import android.os.IInterface;
import android.os.Parcel;
import android.os.IBinder;

public final class a extends eny implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiClient");
    }
    
    public final void a(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(2, qq);
    }
    
    public final void b(final f f) {
        final Parcel qq = this.qQ();
        eoa.j(qq, (IInterface)f);
        this.qS(1, qq);
    }
}
