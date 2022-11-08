// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.graphics.Bitmap;
import android.os.IBinder;

public final class a extends eny implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.IThumbnailOverlayClient");
    }
    
    public final void a() {
        this.qS(2, this.qQ());
    }
    
    public final void b() {
        this.qS(3, this.qQ());
    }
    
    public final void g(final Bitmap bitmap) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)bitmap);
        this.qS(4, qq);
    }
    
    public final void h() {
        this.qS(1, this.qQ());
    }
}
