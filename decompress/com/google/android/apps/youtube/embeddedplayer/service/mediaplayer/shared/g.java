// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.Parcelable;
import android.view.Surface;
import android.os.Parcel;
import android.os.IBinder;

public final class g extends enz implements i
{
    public g(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderServiceListener");
    }
    
    public final void a(final int n, final int n2, final int n3) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        qw.writeInt(n2);
        qw.writeInt(n3);
        this.qY(2, qw);
    }
    
    public final void b(final Surface surface) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)surface);
        this.qY(1, qw);
    }
    
    public final void g() {
        this.qY(3, this.qW());
    }
}
