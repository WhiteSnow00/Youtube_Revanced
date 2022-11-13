// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

public final class j extends enz implements l
{
    public j(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceTextureClient");
    }
    
    public final void a(final o o) {
        final Parcel qw = this.qW();
        eob.j(qw, (IInterface)o);
        this.qY(1, qw);
    }
}
