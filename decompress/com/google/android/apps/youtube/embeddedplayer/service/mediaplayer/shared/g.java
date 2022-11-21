// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.Parcelable;
import android.view.Surface;
import android.os.Parcel;
import android.os.IBinder;

public final class g extends eoc implements i
{
    public g(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderServiceListener");
    }
    
    public final void a(final int n, final int n2, final int n3) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        qv.writeInt(n2);
        qv.writeInt(n3);
        this.qX(2, qv);
    }
    
    public final void b(final Surface surface) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)surface);
        this.qX(1, qv);
    }
    
    public final void g() {
        this.qX(3, this.qV());
    }
}
