// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared;

import android.os.IInterface;
import android.os.Parcelable;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.IBinder;

public final class a extends eoc implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.ILiveOverlayClient");
    }
    
    public final int a() {
        final Parcel qw = this.qW(6, this.qV());
        final int int1 = qw.readInt();
        qw.recycle();
        return int1;
    }
    
    public final int b() {
        final Parcel qw = this.qW(5, this.qV());
        final int int1 = qw.readInt();
        qw.recycle();
        return int1;
    }
    
    public final void g() {
        this.qX(4, this.qV());
    }
    
    public final void h(final Bitmap bitmap) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)bitmap);
        this.qX(7, qv);
    }
    
    public final void i(final f f) {
        final Parcel qv = this.qV();
        eoe.j(qv, (IInterface)f);
        this.qX(1, qv);
    }
    
    public final void j(final CharSequence charSequence, final CharSequence charSequence2, final boolean b, final CharSequence charSequence3, final int n, final CharSequence charSequence4, final int n2) {
        final Parcel qv = this.qV();
        eoe.g(qv, charSequence);
        eoe.g(qv, charSequence2);
        eoe.f(qv, b);
        eoe.g(qv, charSequence3);
        qv.writeInt(n);
        eoe.g(qv, charSequence4);
        qv.writeInt(n2);
        this.qX(2, qv);
    }
    
    public final void k(final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3) {
        final Parcel qv = this.qV();
        eoe.g(qv, charSequence);
        eoe.g(qv, charSequence2);
        eoe.g(qv, charSequence3);
        this.qX(3, qv);
    }
}
