// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.IInterface;
import android.os.Parcel;
import android.graphics.Rect;
import android.os.IBinder;

public final class d extends eoc implements f
{
    public d(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderClient");
    }
    
    public final Rect a() {
        final Parcel qw = this.qW(3, this.qV());
        final Rect rect = (Rect)eoe.a(qw, Rect.CREATOR);
        qw.recycle();
        return rect;
    }
    
    public final void b(final int n, final int n2) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        qv.writeInt(n2);
        this.qX(5, qv);
    }
    
    public final void g(final int n) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        this.qX(6, qv);
    }
    
    public final void h(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(4, qv);
    }
    
    public final void i() {
        this.qX(7, this.qV());
    }
    
    public final void j(final i i) {
        final Parcel qv = this.qV();
        eoe.j(qv, (IInterface)i);
        this.qX(1, qv);
    }
    
    public final void k(final int n) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        this.qX(8, qv);
    }
    
    public final boolean l() {
        final Parcel qw = this.qW(2, this.qV());
        final boolean k = eoe.k(qw);
        qw.recycle();
        return k;
    }
}
