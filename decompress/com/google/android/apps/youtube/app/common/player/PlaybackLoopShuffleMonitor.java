// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.player;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

public class PlaybackLoopShuffleMonitor implements thj
{
    public final Set a;
    public int b;
    public boolean c;
    private final abpu d;
    private asir e;
    
    public PlaybackLoopShuffleMonitor(final abpu d) {
        this.d = d;
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public final thh g() {
        return thh.a;
    }
    
    public final void j(final fnx fnx) {
        this.a.add(fnx);
    }
    
    public final void k(final fnx fnx) {
        this.a.remove(fnx);
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        final asir e = this.e;
        if (e != null) {
            athz.f((AtomicReference)e);
            this.e = null;
        }
    }
    
    public final void mq(final aun aun) {
        this.e = this.d.N().an((asjm)new fmn(this, 10), (asjm)ezq.o);
    }
    
    public final void my(final aun aun) {
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
