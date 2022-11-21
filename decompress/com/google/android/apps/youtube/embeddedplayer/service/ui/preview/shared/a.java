// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.graphics.Bitmap;
import android.os.IBinder;

public final class a extends eoc implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.IThumbnailOverlayClient");
    }
    
    public final void a() {
        this.qX(2, this.qV());
    }
    
    public final void b() {
        this.qX(3, this.qV());
    }
    
    public final void g(final Bitmap bitmap) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)bitmap);
        this.qX(4, qv);
    }
    
    public final void h() {
        this.qX(1, this.qV());
    }
}
