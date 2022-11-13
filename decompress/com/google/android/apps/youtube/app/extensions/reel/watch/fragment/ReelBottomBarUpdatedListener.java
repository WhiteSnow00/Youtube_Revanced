// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.watch.fragment;

import android.view.ViewGroup$MarginLayoutParams;
import java.util.concurrent.Callable;
import com.google.android.apps.youtube.app.common.ui.pip.observer.PipPlayerObserver;
import android.view.View;

public final class ReelBottomBarUpdatedListener implements aua, fxy
{
    public final View a;
    public boolean b;
    public boolean c;
    public final vaf d;
    private int e;
    private final hzm f;
    
    public ReelBottomBarUpdatedListener(final hzm f, final msr msr, final PipPlayerObserver pipPlayerObserver, final vai vai, final vaf d, final View a, final byte[] array, final byte[] array2) {
        this.b = false;
        this.c = false;
        this.f = f;
        this.d = d;
        this.a = a;
        msr.Q((Callable)new hly(this, vai, 1));
        msr.Q((Callable)new hly(this, pipPlayerObserver, 0));
    }
    
    public final void g(final int e) {
        if (!this.b) {
            return;
        }
        if (this.c) {
            this.e = e;
            return;
        }
        int e2 = 0;
        int e3;
        if ((e3 = e) == 0) {
            e2 = this.e;
            e3 = 0;
        }
        tpe.aF(this.a, tpe.aq(e2), (Class)ViewGroup$MarginLayoutParams.class);
        this.e = e3;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        this.f.l(this);
    }
    
    public final void mq(final aun aun) {
        this.f.k(this);
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
    }
}
