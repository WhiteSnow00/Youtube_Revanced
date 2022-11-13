// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.Parcelable;
import android.content.Intent;
import android.os.Parcel;
import android.os.IBinder;

public final class e extends enz implements g
{
    public e(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.IApiPlayerClient");
    }
    
    public final String a(final String s) {
        final Parcel qw = this.qW();
        qw.writeString(s);
        final Parcel qx = this.qX(20, qw);
        final String string = qx.readString();
        qx.recycle();
        return string;
    }
    
    public final void b() {
        this.qY(6, this.qW());
    }
    
    public final void g(final boolean b, final long n) {
        final Parcel qw = this.qW();
        eob.f(qw, b);
        qw.writeLong(n);
        this.qY(14, qw);
    }
    
    public final void h() {
        this.qY(19, this.qW());
    }
    
    public final void i() {
        this.qY(18, this.qW());
    }
    
    public final void j(final String s) {
        final Parcel qw = this.qW();
        qw.writeString(s);
        this.qY(9, qw);
    }
    
    public final void k(final boolean b) {
        final Parcel qw = this.qW();
        eob.f(qw, b);
        this.qY(16, qw);
    }
    
    public final void l(final String s, final String s2, final long n, final long n2, final boolean b, final boolean b2, final int n3) {
        final Parcel qw = this.qW();
        qw.writeString(s);
        qw.writeString(s2);
        qw.writeLong(n);
        qw.writeLong(n2);
        eob.f(qw, b);
        eob.f(qw, b2);
        qw.writeInt(n3);
        this.qY(5, qw);
    }
    
    public final void m() {
        this.qY(4, this.qW());
    }
    
    public final void n() {
        this.qY(2, this.qW());
    }
    
    public final void o(final long n) {
        final Parcel qw = this.qW();
        qw.writeLong(n);
        this.qY(11, qw);
    }
    
    public final void p(final long n, final long n2) {
        final Parcel qw = this.qW();
        qw.writeLong(n);
        qw.writeLong(n2);
        this.qY(10, qw);
    }
    
    public final void q() {
        this.qY(17, this.qW());
    }
    
    public final void r() {
        this.qY(3, this.qW());
    }
    
    public final void s() {
        this.qY(1, this.qW());
    }
    
    public final void t(final long n, final long n2) {
        final Parcel qw = this.qW();
        qw.writeLong(n);
        qw.writeLong(n2);
        this.qY(13, qw);
    }
    
    public final void u(final long n) {
        final Parcel qw = this.qW();
        qw.writeLong(n);
        this.qY(15, qw);
    }
    
    public final void v() {
        this.qY(12, this.qW());
    }
    
    public final void w() {
        this.qY(8, this.qW());
    }
    
    public final void x() {
        this.qY(7, this.qW());
    }
    
    public final void y(final String s) {
        final Parcel qw = this.qW();
        qw.writeString(s);
        this.qY(22, qw);
    }
    
    public final void z(final Intent intent) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)intent);
        this.qY(21, qw);
    }
}
