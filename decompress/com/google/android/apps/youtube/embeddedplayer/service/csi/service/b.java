// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.csi.service;

import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.SetOperationType;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.c;

public final class b extends c
{
    private final a a;
    
    public b(final a a) {
        this.a = a;
    }
    
    public final void a() {
        synchronized (this) {
            this.a.b();
        }
    }
    
    public final void b() {
        this.a.c();
    }
    
    public final void c() {
        synchronized (this) {
            this.a.d();
        }
    }
    
    public final void d(final d d) {
        monitorenter(this);
        monitorexit(this);
    }
    
    public final void e(final Tick tick, final long n) {
        synchronized (this) {
            this.a.e(tick, n);
        }
    }
    
    public final void f(final Tick tick, final long n) {
        this.a.g(tick, n);
    }
    
    public final void g(final Tick tick, final long n) {
        synchronized (this) {
            this.a.i(tick, n);
        }
    }
    
    public final void h(final long n) {
        synchronized (this) {
            this.a.j(n);
        }
    }
    
    public final void i(final long n) {
        this.a.k(n);
    }
    
    public final void j(final SetOperationType setOperationType, final long n) {
        synchronized (this) {
            this.a.l(setOperationType, n);
        }
    }
    
    public final void k(final SetOperationType setOperationType, final long n) {
        synchronized (this) {
            this.a.m(setOperationType, n);
        }
    }
}
