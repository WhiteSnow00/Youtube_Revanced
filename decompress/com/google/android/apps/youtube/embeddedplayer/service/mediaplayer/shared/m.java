// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.Parcelable;
import android.view.Surface;
import android.os.Parcel;
import android.os.IBinder;

public final class m extends enz implements o
{
    public m(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceTextureServiceListener");
    }
    
    public final void a(final int n, final int n2) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        qw.writeInt(n2);
        this.qY(2, qw);
    }
    
    public final void b(final Surface surface) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)surface);
        this.qY(1, qw);
    }
    
    public final void g() {
        this.qY(4, this.qW());
    }
    
    public final void h() {
        this.qY(3, this.qW());
    }
}
