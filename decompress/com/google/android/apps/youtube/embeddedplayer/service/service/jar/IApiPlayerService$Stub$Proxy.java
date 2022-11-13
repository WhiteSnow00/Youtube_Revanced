// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.view.KeyEvent;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.a;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c;
import android.os.IInterface;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData;
import android.os.IBinder;

public class IApiPlayerService$Stub$Proxy extends enz implements IApiPlayerService
{
    public IApiPlayerService$Stub$Proxy(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService");
    }
    
    public final void A(final EmbedsPrewarmData embedsPrewarmData) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)embedsPrewarmData);
        this.qY(41, qw);
    }
    
    public final void B(final boolean b) {
        final Parcel qw = this.qW();
        eob.f(qw, b);
        this.qY(14, qw);
    }
    
    public final void D(final CommandWrapper commandWrapper) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)commandWrapper);
        this.qY(40, qw);
    }
    
    public final void E(final int n) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        this.qY(18, qw);
    }
    
    public final void F(final int n) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        this.qY(17, qw);
    }
    
    public final void G(final boolean b) {
        final Parcel qw = this.qW();
        eob.f(qw, b);
        this.qY(19, qw);
    }
    
    public final void H(final boolean b) {
        final Parcel qw = this.qW();
        eob.f(qw, b);
        this.qY(22, qw);
    }
    
    public final void I(final boolean b) {
        final Parcel qw = this.qW();
        eob.f(qw, b);
        this.qY(20, qw);
    }
    
    public final void J() {
        this.qY(21, this.qW());
    }
    
    public final void K(final String s) {
        final Parcel qw = this.qW();
        qw.writeString(s);
        this.qY(36, qw);
    }
    
    public final void L() {
        this.qY(37, this.qW());
    }
    
    public final void M() {
        this.qY(10, this.qW());
    }
    
    public final void N() {
        this.qY(11, this.qW());
    }
    
    public final boolean O() {
        final Parcel qx = this.qX(13, this.qW());
        final boolean k = eob.k(qx);
        qx.recycle();
        return k;
    }
    
    public final boolean P(final byte[] array) {
        final Parcel qw = this.qW();
        qw.writeByteArray(array);
        final Parcel qx = this.qX(29, qw);
        final boolean k = eob.k(qx);
        qx.recycle();
        return k;
    }
    
    public final byte[] Q() {
        final Parcel qx = this.qX(33, this.qW());
        final byte[] byteArray = qx.createByteArray();
        qx.recycle();
        return byteArray;
    }
    
    public final byte[] R() {
        final Parcel qx = this.qX(28, this.qW());
        final byte[] byteArray = qx.createByteArray();
        qx.recycle();
        return byteArray;
    }
    
    public final d a() {
        final Parcel qx = this.qX(39, this.qW());
        final IBinder strongBinder = qx.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.csi.shared.ICsiControllerService");
            if (queryLocalInterface instanceof d) {
                o = queryLocalInterface;
            }
            else {
                o = new b(strongBinder);
            }
        }
        qx.recycle();
        return (d)o;
    }
    
    public final c b() {
        final Parcel qx = this.qX(42, this.qW());
        final IBinder strongBinder = qx.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.IEmbedsErrorLoggingService");
            if (queryLocalInterface instanceof c) {
                o = queryLocalInterface;
            }
            else {
                o = new a(strongBinder);
            }
        }
        qx.recycle();
        return (c)o;
    }
    
    public final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d d() {
        final Parcel qx = this.qX(35, this.qW());
        final IBinder strongBinder = qx.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.IEmbedInteractionLoggingService");
            if (queryLocalInterface instanceof com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d) {
                o = queryLocalInterface;
            }
            else {
                o = new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.b(strongBinder);
            }
        }
        qx.recycle();
        return (com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d)o;
    }
    
    public final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c e() {
        final Parcel qx = this.qX(32, this.qW());
        final IBinder strongBinder = qx.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.ISelectableItemRegistryService");
            if (queryLocalInterface instanceof com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c) {
                o = queryLocalInterface;
            }
            else {
                o = new com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.a(strongBinder);
            }
        }
        qx.recycle();
        return (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c)o;
    }
    
    public final void f() {
        this.qY(23, this.qW());
    }
    
    public final void g() {
        this.qY(12, this.qW());
    }
    
    public final void h(final String s, final int n, final int n2, final int n3) {
        final Parcel qw = this.qW();
        qw.writeString(s);
        qw.writeInt(n);
        qw.writeInt(n2);
        qw.writeInt(n3);
        this.qY(4, qw);
    }
    
    public final void i(final String s, final int n, final int n2) {
        final Parcel qw = this.qW();
        qw.writeString(s);
        qw.writeInt(n);
        qw.writeInt(n2);
        this.qY(2, qw);
    }
    
    public final void j(final List list, final int n, final int n2, final int n3) {
        final Parcel qw = this.qW();
        qw.writeStringList(list);
        qw.writeInt(n);
        qw.writeInt(n2);
        qw.writeInt(n3);
        this.qY(6, qw);
    }
    
    public final void k(final boolean b) {
        final Parcel qw = this.qW();
        eob.f(qw, b);
        this.qY(24, qw);
    }
    
    public final void l(final String s) {
        final Parcel qw = this.qW();
        qw.writeString(s);
        this.qY(38, qw);
    }
    
    public final void m() {
        this.qY(31, this.qW());
    }
    
    public final void n() {
        this.qY(30, this.qW());
    }
    
    public final void o(final String s, final int n, final int n2, final boolean b, final int n3) {
        final Parcel qw = this.qW();
        qw.writeString(s);
        qw.writeInt(n);
        qw.writeInt(n2);
        eob.f(qw, b);
        qw.writeInt(n3);
        this.qY(5, qw);
    }
    
    public final void p(final String s, final boolean b, final int n, final boolean b2, final int n2) {
        final Parcel qw = this.qW();
        qw.writeString(s);
        eob.f(qw, b);
        qw.writeInt(n);
        eob.f(qw, b2);
        qw.writeInt(n2);
        this.qY(3, qw);
    }
    
    public final void q(final List list, final int n, final int n2, final boolean b, final int n3) {
        final Parcel qw = this.qW();
        qw.writeStringList(list);
        qw.writeInt(n);
        qw.writeInt(n2);
        eob.f(qw, b);
        qw.writeInt(n3);
        this.qY(7, qw);
    }
    
    public final void r() {
        this.qY(15, this.qW());
    }
    
    public final void s(final VisibilityChangeEventData visibilityChangeEventData) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)visibilityChangeEventData);
        this.qY(1, qw);
    }
    
    public final void t(final byte[] array) {
        final Parcel qw = this.qW();
        qw.writeByteArray(array);
        this.qY(34, qw);
    }
    
    public final void u(final int n, final KeyEvent keyEvent) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        eob.h(qw, (Parcelable)keyEvent);
        this.qY(25, qw);
    }
    
    public final void v(final int n, final KeyEvent keyEvent) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        eob.h(qw, (Parcelable)keyEvent);
        this.qY(26, qw);
    }
    
    public final void w() {
        this.qY(27, this.qW());
    }
    
    public final void x() {
        this.qY(9, this.qW());
    }
    
    public final void y() {
        this.qY(8, this.qW());
    }
    
    public final void z() {
        this.qY(16, this.qW());
    }
}
