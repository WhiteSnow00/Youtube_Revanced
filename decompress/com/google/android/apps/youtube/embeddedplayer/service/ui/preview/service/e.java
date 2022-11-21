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
    
    public e(final adht a, final adht f, final Executor e, final Executor b) {
        this.c = atls.aE();
        this.a = a;
        this.f = f;
        this.e = e;
        this.b = b;
        this.d = null;
    }
    
    public e(final ema f, final adhd e, final acig b, final tkq c, final byte[] array, final byte[] array2, final byte[] array3) {
        f.getClass();
        this.f = f;
        this.a = new Handler(Looper.getMainLooper());
        this.e = e;
        this.b = b;
        this.c = c;
    }
    
    public static aowb a(final aldc aldc) {
        alda alda;
        if ((alda = aldc.c) == null) {
            alda = alda.a;
        }
        if (alda.b == 87079103) {
            alda alda2;
            if ((alda2 = aldc.c) == null) {
                alda2 = alda.a;
            }
            alde a;
            if (alda2.b == 87079103) {
                a = (alde)alda2.c;
            }
            else {
                a = alde.a;
            }
            aowb aowb;
            if ((aowb = a.b) == null) {
                aowb = aowb.a;
            }
            return aowb;
        }
        return aowb.a;
    }
    
    public final void b() {
        final Object d = this.d;
        if (d != null) {
            ((a)d).d();
        }
        this.d = null;
    }
    
    public final void c() {
        final boolean o = ((tkq)this.c).o();
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
        final Object a = ((ema)f).a;
        if (a == null) {
            return;
        }
        try {
            final Parcel qv = ((eoc)a).qV();
            qv.writeString(s);
            eoe.f(qv, e);
            eoe.f(qv, d);
            ((eoc)a).qX(2, qv);
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
        ((adht)o).d();
    }
}
