// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.watch.activity;

import android.content.Context;
import java.util.concurrent.Callable;
import android.app.Activity;

public final class ReelWatchActivityOrientationController implements ghj, aua
{
    public final Activity a;
    public final tpz b;
    public final asid c;
    private final ghk d;
    private final pja e;
    
    public ReelWatchActivityOrientationController(final Activity a, final msr msr, final tpz b, final ghk d, final asid c, final pja e, final vai vai, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
        this.e = e;
        if (!vai.cK()) {
            d.a = this;
            b.a((tpy)d);
            msr.S((Callable)new gqw(this, 12));
        }
    }
    
    private final void j() {
        this.e.l(this.a.getResources().getConfiguration(), (Context)this.a);
    }
    
    @Override
    public final void g(final int n) {
        boolean b = true;
        if (n != 1) {
            b = false;
        }
        this.i(b);
    }
    
    public final void h() {
        this.d.d(3);
        this.j();
    }
    
    public final void i(final boolean b) {
        if (b) {
            this.h();
            return;
        }
        this.d.d(0);
        this.j();
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
    }
    
    public final void oX(final aun aun) {
    }
}
