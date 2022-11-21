// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay.accessibility;

import java.util.concurrent.atomic.AtomicReference;

public class AccessibilityEventLogger$LifecycleObserver implements tio
{
    public final jaj a;
    private asln b;
    
    public AccessibilityEventLogger$LifecycleObserver(final jaj a) {
        this.a = a;
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        this.b = this.a.b.a().an((asmi)new jai(this), (asmi)ixz.j);
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        final asln b = this.b;
        if (b != null) {
            atkw.f((AtomicReference)b);
            this.b = null;
        }
    }
}
