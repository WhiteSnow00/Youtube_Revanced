// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.SurfaceControl;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c;

public abstract class a implements zds
{
    public c a;
    public zdr b;
    
    public a(final c a) {
        this.a = a;
    }
    
    public final int a() {
        final c a = this.a;
        if (a == null) {
            return 0;
        }
        try {
            return a.a();
        }
        catch (final RemoteException ex) {
            return 0;
        }
    }
    
    public final int b() {
        final c a = this.a;
        if (a == null) {
            return 0;
        }
        try {
            return a.b();
        }
        catch (final RemoteException ex) {
            return 0;
        }
    }
    
    public final int c() {
        return 0;
    }
    
    public final void d(final int n) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.g(n);
        }
        catch (final RemoteException ex) {}
    }
    
    public final int e() {
        return 0;
    }
    
    public final SurfaceControl f() {
        return null;
    }
    
    public final void g(final int n) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.l(n);
        }
        catch (final RemoteException ex) {}
    }
    
    public final ViewGroup h() {
        return null;
    }
    
    public final bse i() {
        return null;
    }
    
    public final void j() {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.h();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void k(final Bitmap bitmap, final tcc tcc) {
        tcc.sd((Object)bitmap, new Exception());
    }
    
    public final void l(final Object o) {
    }
    
    public final void m(final int n) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.i(n);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void n() {
        if (this.a == null) {
            return;
        }
        final zdr b = this.b;
        if (b != null) {
            b.f();
        }
        try {
            final c a = this.a;
            if (a != null) {
                a.j();
            }
        }
        catch (final RemoteException ex) {}
    }
    
    public final void o() {
    }
    
    public final void p(final boolean b, final byte[] array, final long n, final long n2) {
    }
    
    public final void q(final zdr b) {
        this.b = b;
    }
    
    public final void r(final zdu zdu) {
    }
    
    public final void s(final zdv zdv) {
    }
    
    public final void t(final int n, final int n2) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.k(n, n2);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void u(final boolean b) {
    }
    
    public final boolean v() {
        return false;
    }
    
    public final boolean w() {
        return false;
    }
    
    public final void x(final boolean b, final float n, final float n2, final int n3) {
    }
    
    public final boolean y(final int n) {
        return false;
    }
}
