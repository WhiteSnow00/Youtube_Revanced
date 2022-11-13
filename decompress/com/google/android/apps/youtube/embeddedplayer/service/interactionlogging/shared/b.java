// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared;

import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import android.os.Parcel;
import android.os.IBinder;

public final class b extends enz implements d
{
    public b(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.IEmbedInteractionLoggingService");
    }
    
    public final int a(int int1) {
        final Parcel qw = this.qW();
        qw.writeInt(int1);
        final Parcel qx = this.qX(1, qw);
        int1 = qx.readInt();
        qx.recycle();
        return int1;
    }
    
    public final void b(final int n) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        this.qY(7, qw);
    }
    
    public final void c(final byte[] array) {
        final Parcel qw = this.qW();
        qw.writeByteArray(array);
        this.qY(8, qw);
    }
    
    public final void d(final int n, final int n2) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        qw.writeInt(n2);
        this.qY(11, qw);
    }
    
    public final void e(final int n, final byte[] array) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        qw.writeByteArray(array);
        this.qY(12, qw);
    }
    
    public final void f(final int n, final SimplePlaybackDescriptor simplePlaybackDescriptor, final boolean b) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        eob.h(qw, (Parcelable)simplePlaybackDescriptor);
        eob.f(qw, true);
        this.qY(4, qw);
    }
    
    public final void g(final int n) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        this.qY(3, qw);
    }
    
    public final void h(final int n) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        this.qY(5, qw);
    }
    
    public final void i(final byte[] array) {
        final Parcel qw = this.qW();
        qw.writeByteArray(array);
        this.qY(6, qw);
    }
    
    public final void j(final int n, final int n2) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        qw.writeInt(n2);
        this.qY(9, qw);
    }
    
    public final void k(final int n, final byte[] array) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        qw.writeByteArray(array);
        this.qY(10, qw);
    }
    
    public final void l(final int n) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        this.qY(2, qw);
    }
}
