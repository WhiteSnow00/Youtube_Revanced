// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay.accessibility;

import java.util.concurrent.atomic.AtomicReference;

public class PlayerAccessibilitySettingsEduController$LifecycleObserver implements tfh
{
    final /* synthetic */ izd a;
    private asic b;
    
    public PlayerAccessibilitySettingsEduController$LifecycleObserver(final izd a) {
        this.a = a;
    }
    
    public final void oS(final aum aum) {
        if (gkt.G(this.a.j)) {
            final izd a = this.a;
            this.b = ((asgt)a.e.q().a).R().P(ashw.a()).am((asix)new iys(a, 6), (asix)iwn.l);
        }
    }
    
    public final void oW(final aum aum) {
        final asic b = this.b;
        if (b != null) {
            athh.f((AtomicReference)b);
            this.b = null;
        }
    }
}
