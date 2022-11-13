// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import android.os.IBinder;

public final class a extends enz implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.IEmbedImageClientService");
    }
    
    public final void a(final BitmapKey bitmapKey) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)bitmapKey);
        this.qY(2, qw);
    }
    
    public final void b(final BitmapKey bitmapKey) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)bitmapKey);
        this.qY(1, qw);
    }
}
