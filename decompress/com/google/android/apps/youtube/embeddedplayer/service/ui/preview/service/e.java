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
    
    public e(final adee a, final adee f, final Executor e, final Executor b) {
        this.c = atid.aD();
        this.a = a;
        this.f = f;
        this.e = e;
        this.b = b;
        this.d = null;
    }
    
    public e(final elw f, final addp e, final aceo b, final thh c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        f.getClass();
        this.f = f;
        this.a = new Handler(Looper.getMainLooper());
        this.e = e;
        this.b = b;
        this.c = c;
    }
    
    public static aorm a(final akyz akyz) {
        akyx akyx;
        if ((akyx = akyz.c) == null) {
            akyx = akyx.a;
        }
        if (akyx.b == 87079103) {
            akyx akyx2;
            if ((akyx2 = akyz.c) == null) {
                akyx2 = akyx.a;
            }
            akzb a;
            if (akyx2.b == 87079103) {
                a = (akzb)akyx2.c;
            }
            else {
                a = akzb.a;
            }
            aorm aorm;
            if ((aorm = a.b) == null) {
                aorm = aorm.a;
            }
            return aorm;
        }
        return aorm.a;
    }
    
    public final void b() {
        final Object d = this.d;
        if (d != null) {
            ((a)d).d();
        }
        this.d = null;
    }
    
    public final void c() {
        final boolean o = ((thh)this.c).o();
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
        final Object a = ((elw)f).a;
        if (a == null) {
            return;
        }
        try {
            final Parcel qq = ((eny)a).qQ();
            qq.writeString(s);
            eoa.f(qq, e);
            eoa.f(qq, d);
            ((eny)a).qS(2, qq);
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
        ((adee)o).d();
    }
}
