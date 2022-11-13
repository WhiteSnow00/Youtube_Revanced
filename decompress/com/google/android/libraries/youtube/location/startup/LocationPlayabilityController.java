// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.location.startup;

import com.google.common.util.concurrent.ListenableFuture;

public class LocationPlayabilityController implements thl
{
    ListenableFuture a;
    ListenableFuture b;
    public final abkn c;
    private final bu d;
    private final tmx e;
    
    public LocationPlayabilityController(final bu d, final tmx e, final abkn c, final byte[] array) {
        this.d = d;
        this.e = e;
        this.c = c;
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        if (!acuq.g(this.d.getApplicationContext())) {
            teu.p(aun, this.a = this.e.b((aezf)wpw.e), (ttg)won.t, (ttg)new vll(this, 16));
            return;
        }
        teu.p(aun, this.b = this.e.a(), (ttg)won.s, (ttg)new vll(this, 15));
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        final ListenableFuture a = this.a;
        if (a != null) {
            a.cancel(true);
        }
        final ListenableFuture b = this.b;
        if (b != null) {
            b.cancel(true);
        }
    }
}
