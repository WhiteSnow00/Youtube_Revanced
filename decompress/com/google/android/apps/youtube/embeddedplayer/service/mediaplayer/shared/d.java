// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.IInterface;
import android.os.Parcel;
import android.graphics.Rect;
import android.os.IBinder;

public final class d extends enz implements f
{
    public d(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderClient");
    }
    
    public final Rect a() {
        final Parcel qx = this.qX(3, this.qW());
        final Rect rect = (Rect)eob.a(qx, Rect.CREATOR);
        qx.recycle();
        return rect;
    }
    
    public final void b(final int n, final int n2) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        qw.writeInt(n2);
        this.qY(5, qw);
    }
    
    public final void g(final int n) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        this.qY(6, qw);
    }
    
    public final void h(final boolean b) {
        final Parcel qw = this.qW();
        eob.f(qw, b);
        this.qY(4, qw);
    }
    
    public final void i() {
        this.qY(7, this.qW());
    }
    
    public final void j(final i i) {
        final Parcel qw = this.qW();
        eob.j(qw, (IInterface)i);
        this.qY(1, qw);
    }
    
    public final void k(final int n) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        this.qY(8, qw);
    }
    
    public final boolean l() {
        final Parcel qx = this.qX(2, this.qW());
        final boolean k = eob.k(qx);
        qx.recycle();
        return k;
    }
}
