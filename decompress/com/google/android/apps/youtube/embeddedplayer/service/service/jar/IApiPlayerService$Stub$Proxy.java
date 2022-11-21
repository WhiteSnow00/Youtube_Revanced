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

public class IApiPlayerService$Stub$Proxy extends eoc implements IApiPlayerService
{
    public IApiPlayerService$Stub$Proxy(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService");
    }
    
    public final void A(final EmbedsPrewarmData embedsPrewarmData) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)embedsPrewarmData);
        this.qX(41, qv);
    }
    
    public final void B(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(14, qv);
    }
    
    public final void D(final CommandWrapper commandWrapper) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)commandWrapper);
        this.qX(40, qv);
    }
    
    public final void E(final int n) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        this.qX(18, qv);
    }
    
    public final void F(final int n) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        this.qX(17, qv);
    }
    
    public final void G(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(19, qv);
    }
    
    public final void H(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(22, qv);
    }
    
    public final void I(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(20, qv);
    }
    
    public final void J() {
        this.qX(21, this.qV());
    }
    
    public final void K(final String s) {
        final Parcel qv = this.qV();
        qv.writeString(s);
        this.qX(36, qv);
    }
    
    public final void L() {
        this.qX(37, this.qV());
    }
    
    public final void M() {
        this.qX(10, this.qV());
    }
    
    public final void N() {
        this.qX(11, this.qV());
    }
    
    public final boolean O() {
        final Parcel qw = this.qW(13, this.qV());
        final boolean k = eoe.k(qw);
        qw.recycle();
        return k;
    }
    
    public final boolean P(final byte[] array) {
        final Parcel qv = this.qV();
        qv.writeByteArray(array);
        final Parcel qw = this.qW(29, qv);
        final boolean k = eoe.k(qw);
        qw.recycle();
        return k;
    }
    
    public final byte[] Q() {
        final Parcel qw = this.qW(33, this.qV());
        final byte[] byteArray = qw.createByteArray();
        qw.recycle();
        return byteArray;
    }
    
    public final byte[] R() {
        final Parcel qw = this.qW(28, this.qV());
        final byte[] byteArray = qw.createByteArray();
        qw.recycle();
        return byteArray;
    }
    
    public final d a() {
        final Parcel qw = this.qW(39, this.qV());
        final IBinder strongBinder = qw.readStrongBinder();
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
        qw.recycle();
        return (d)o;
    }
    
    public final c b() {
        final Parcel qw = this.qW(42, this.qV());
        final IBinder strongBinder = qw.readStrongBinder();
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
        qw.recycle();
        return (c)o;
    }
    
    public final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d d() {
        final Parcel qw = this.qW(35, this.qV());
        final IBinder strongBinder = qw.readStrongBinder();
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
        qw.recycle();
        return (com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d)o;
    }
    
    public final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c e() {
        final Parcel qw = this.qW(32, this.qV());
        final IBinder strongBinder = qw.readStrongBinder();
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
        qw.recycle();
        return (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c)o;
    }
    
    public final void f() {
        this.qX(23, this.qV());
    }
    
    public final void g() {
        this.qX(12, this.qV());
    }
    
    public final void h(final String s, final int n, final int n2, final int n3) {
        final Parcel qv = this.qV();
        qv.writeString(s);
        qv.writeInt(n);
        qv.writeInt(n2);
        qv.writeInt(n3);
        this.qX(4, qv);
    }
    
    public final void i(final String s, final int n, final int n2) {
        final Parcel qv = this.qV();
        qv.writeString(s);
        qv.writeInt(n);
        qv.writeInt(n2);
        this.qX(2, qv);
    }
    
    public final void j(final List list, final int n, final int n2, final int n3) {
        final Parcel qv = this.qV();
        qv.writeStringList(list);
        qv.writeInt(n);
        qv.writeInt(n2);
        qv.writeInt(n3);
        this.qX(6, qv);
    }
    
    public final void k(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(24, qv);
    }
    
    public final void l(final String s) {
        final Parcel qv = this.qV();
        qv.writeString(s);
        this.qX(38, qv);
    }
    
    public final void m() {
        this.qX(31, this.qV());
    }
    
    public final void n() {
        this.qX(30, this.qV());
    }
    
    public final void o(final String s, final int n, final int n2, final boolean b, final int n3) {
        final Parcel qv = this.qV();
        qv.writeString(s);
        qv.writeInt(n);
        qv.writeInt(n2);
        eoe.f(qv, b);
        qv.writeInt(n3);
        this.qX(5, qv);
    }
    
    public final void p(final String s, final boolean b, final int n, final boolean b2, final int n2) {
        final Parcel qv = this.qV();
        qv.writeString(s);
        eoe.f(qv, b);
        qv.writeInt(n);
        eoe.f(qv, b2);
        qv.writeInt(n2);
        this.qX(3, qv);
    }
    
    public final void q(final List list, final int n, final int n2, final boolean b, final int n3) {
        final Parcel qv = this.qV();
        qv.writeStringList(list);
        qv.writeInt(n);
        qv.writeInt(n2);
        eoe.f(qv, b);
        qv.writeInt(n3);
        this.qX(7, qv);
    }
    
    public final void r() {
        this.qX(15, this.qV());
    }
    
    public final void s(final VisibilityChangeEventData visibilityChangeEventData) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)visibilityChangeEventData);
        this.qX(1, qv);
    }
    
    public final void t(final byte[] array) {
        final Parcel qv = this.qV();
        qv.writeByteArray(array);
        this.qX(34, qv);
    }
    
    public final void u(final int n, final KeyEvent keyEvent) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        eoe.h(qv, (Parcelable)keyEvent);
        this.qX(25, qv);
    }
    
    public final void v(final int n, final KeyEvent keyEvent) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        eoe.h(qv, (Parcelable)keyEvent);
        this.qX(26, qv);
    }
    
    public final void w() {
        this.qX(27, this.qV());
    }
    
    public final void x() {
        this.qX(9, this.qV());
    }
    
    public final void y() {
        this.qX(8, this.qV());
    }
    
    public final void z() {
        this.qX(16, this.qV());
    }
}
