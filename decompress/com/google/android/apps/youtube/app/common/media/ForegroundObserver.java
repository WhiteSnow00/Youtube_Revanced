// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.media;

import java.util.HashSet;
import java.util.Set;

public final class ForegroundObserver implements thl
{
    Set a;
    private final xsn b;
    
    public ForegroundObserver(final xsn b) {
        this.a = new HashSet();
        this.b = b;
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
        synchronized (this) {
            if (this.a.isEmpty()) {
                this.b.a(true);
            }
            this.a.add(aun);
        }
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        synchronized (this) {
            this.a.remove(aun);
            if (this.a.isEmpty()) {
                this.b.a(false);
            }
        }
    }
}
