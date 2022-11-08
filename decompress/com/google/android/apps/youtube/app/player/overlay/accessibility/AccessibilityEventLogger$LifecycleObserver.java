// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay.accessibility;

import java.util.concurrent.atomic.AtomicReference;

public class AccessibilityEventLogger$LifecycleObserver implements tfh
{
    public final /* synthetic */ izb a;
    private asic b;
    
    public AccessibilityEventLogger$LifecycleObserver(final izb a) {
        this.a = a;
    }
    
    public final void oS(final aum aum) {
        this.b = this.a.b.a().am((asix)new iza(this), (asix)iwn.k);
    }
    
    public final void oW(final aum aum) {
        final asic b = this.b;
        if (b != null) {
            athh.f((AtomicReference)b);
            this.b = null;
        }
    }
}
