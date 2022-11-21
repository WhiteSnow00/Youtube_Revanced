// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.g;

final class ApiPlayerService$ApiPlayerListener implements lpd
{
    public g a;
    
    public ApiPlayerService$ApiPlayerListener(final g a) {
        this.a = a;
    }
    
    public final void a() {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.b();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void b(final boolean b, final long n) {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.g(b, n);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void c() {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.h();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void d() {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.i();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void e(final boolean b) {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.k(b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void f(final String s, final String s2, final long n, final long n2, final boolean b, final boolean b2, final int n3) {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.l(s, s2, n, n2, b, b2, n3);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void g() {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.m();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void h() {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.n();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void i(final long n) {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.o(n);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void j(final long n, final long n2) {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.p(n, n2);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void k() {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.q();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void l() {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.r();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void m() {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.s();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void n(final long n, final long n2) {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.t(n, n2);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void o(final long n) {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.u(n);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void p() {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.v();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void q() {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.w();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void r() {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.x();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void s(final String s) {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.y(s);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void t(final Intent intent) {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.z(intent);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void u(final int n) {
        final g a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.j(aftr.m(n));
        }
        catch (final RemoteException ex) {}
    }
}
