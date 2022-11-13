// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.csi;

import java.util.function.Consumer;
import j$.util.Optional;

public class WatchUiActionLatencyLogger implements thj, aaxv, laf
{
    public Optional a;
    public boolean b;
    private final xao c;
    private final aaxx d;
    private final lag e;
    private final boolean f;
    
    public WatchUiActionLatencyLogger(final xao c, final aaxx d, final lag e, final vai vai) {
        this.a = Optional.empty();
        this.b = false;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = vai.cW();
    }
    
    public final thh g() {
        return thh.a;
    }
    
    public final void j() {
        this.a.ifPresent((Consumer)fgu.a);
        this.n();
    }
    
    public final void k() {
        if (!this.f) {
            return;
        }
        if (!this.a.isEmpty()) {
            return;
        }
        this.a = Optional.of((Object)this.c.b(almx.O));
    }
    
    public final void l(final aaxu aaxu) {
        if (!this.b) {
            if (aaxu == aaxu.b) {
                final wyw a = this.d.a();
                if (a == null) {
                    return;
                }
                this.a.ifPresent((Consumer)new fvi(this, a, 1));
            }
        }
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void m(final int n) {
        if (n != 0) {
            return;
        }
        this.j();
    }
    
    public final void mM(final aun aun) {
        this.n();
        this.d.q(this);
        this.e.b((laf)this);
    }
    
    public final void mq(final aun aun) {
        if (!this.f) {
            return;
        }
        this.d.i(this);
        this.e.a((laf)this);
    }
    
    public final void my(final aun aun) {
    }
    
    public final void n() {
        this.a = Optional.empty();
        this.b = false;
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oT() {
        tfg.g((thj)this);
    }
    
    public final void oW() {
        tfg.f((thj)this);
    }
    
    public final void oX(final aun aun) {
    }
}
