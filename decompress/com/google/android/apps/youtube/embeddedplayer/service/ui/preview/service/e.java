// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class e
{
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;
    public final Object f;
    
    public e(final adgg a, final adgg f, final Executor e, final Executor b) {
        this.c = ativ.aE();
        this.a = a;
        this.f = f;
        this.e = e;
        this.b = b;
        this.d = null;
    }
    
    public e(final elx f, final adfq e, final acgs b, final tjm c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        f.getClass();
        this.f = f;
        this.a = new Handler(Looper.getMainLooper());
        this.e = e;
        this.b = b;
        this.c = c;
    }
    
    public static aotp a(final albc albc) {
        alba alba;
        if ((alba = albc.c) == null) {
            alba = alba.a;
        }
        if (alba.b == 87079103) {
            alba alba2;
            if ((alba2 = albc.c) == null) {
                alba2 = alba.a;
            }
            albe a;
            if (alba2.b == 87079103) {
                a = (albe)alba2.c;
            }
            else {
                a = albe.a;
            }
            aotp aotp;
            if ((aotp = a.b) == null) {
                aotp = aotp.a;
            }
            return aotp;
        }
        return aotp.a;
    }
    
    public final void b() {
        final Object d = this.d;
        if (d != null) {
            ((a)d).d();
        }
        this.d = null;
    }
    
    public final void c() {
        final boolean o = ((tjm)this.c).o();
        int n = 1;
        if (!o) {
            n = 2;
        }
        this.f(n);
    }
    
    public final boolean d() {
        final Object d = this.d;
        return d != null && ((a)d).j();
    }
    
    public final boolean e() {
        final Object d = this.d;
        return d != null && ((a)d).k();
    }
    
    public final void f(final int n) {
        this.b();
        final Object f = this.f;
        String s;
        if (n != 1) {
            if (n != 2) {
                s = "UNKNOWN";
            }
            else {
                s = "INTERNAL_ERROR";
            }
        }
        else {
            s = "NETWORK_ERROR";
        }
        final boolean e = this.e();
        final boolean d = this.d();
        final Object a = ((elx)f).a;
        if (a == null) {
            return;
        }
        try {
            final Parcel qw = ((enz)a).qW();
            qw.writeString(s);
            eob.f(qw, e);
            eob.f(qw, d);
            ((enz)a).qY(2, qw);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void g(final boolean b) {
        Object o;
        if (b) {
            o = this.f;
        }
        else {
            o = this.a;
        }
        ((adgg)o).d();
    }
}
