// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.Parcel;
import android.os.IBinder;

public final class a extends enz implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.IApiMediaViewClient");
    }
    
    public final int a() {
        final Parcel qx = this.qX(2, this.qW());
        final int int1 = qx.readInt();
        qx.recycle();
        return int1;
    }
    
    public final int b() {
        final Parcel qx = this.qX(1, this.qW());
        final int int1 = qx.readInt();
        qx.recycle();
        return int1;
    }
    
    public final void g(final int n) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        this.qY(6, qw);
    }
    
    public final void h() {
        this.qY(8, this.qW());
    }
    
    public final void i(final int n) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        this.qY(7, qw);
    }
    
    public final void j() {
        this.qY(4, this.qW());
    }
    
    public final void k(final int n, final int n2) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        qw.writeInt(n2);
        this.qY(3, qw);
    }
    
    public final void l(final int n) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        this.qY(5, qw);
    }
}
