// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.graphics.Bitmap;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import android.os.IBinder;

public final class d extends enz implements f
{
    public d(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.IEmbedImageClientServiceClient");
    }
    
    public final void a(final BitmapKey bitmapKey, final Bitmap bitmap) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)bitmapKey);
        eob.h(qw, (Parcelable)bitmap);
        this.qY(2, qw);
    }
    
    public final void b(final c c) {
        final Parcel qw = this.qW();
        eob.j(qw, (IInterface)c);
        this.qY(1, qw);
    }
}
