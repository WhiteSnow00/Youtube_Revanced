// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.Parcel;
import android.os.IBinder;

public final class a extends eoc implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.IApiMediaViewClient");
    }
    
    public final int a() {
        final Parcel qw = this.qW(2, this.qV());
        final int int1 = qw.readInt();
        qw.recycle();
        return int1;
    }
    
    public final int b() {
        final Parcel qw = this.qW(1, this.qV());
        final int int1 = qw.readInt();
        qw.recycle();
        return int1;
    }
    
    public final void g(final int n) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        this.qX(6, qv);
    }
    
    public final void h() {
        this.qX(8, this.qV());
    }
    
    public final void i(final int n) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        this.qX(7, qv);
    }
    
    public final void j() {
        this.qX(4, this.qV());
    }
    
    public final void k(final int n, final int n2) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        qv.writeInt(n2);
        this.qX(3, qv);
    }
    
    public final void l(final int n) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        this.qX(5, qv);
    }
}
