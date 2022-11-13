// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.databus.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupportedDataWrapper;
import android.os.IBinder;

public final class a extends enz implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.databus.shared.IDataBusClient");
    }
    
    public final void a(final BusSupportedDataWrapper busSupportedDataWrapper) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)busSupportedDataWrapper);
        this.qY(1, qw);
    }
}
