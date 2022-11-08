// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.nextgenwatch.ui;

import java.util.concurrent.atomic.AtomicReference;

public class FullscreenExitController implements tfh
{
    public boolean a;
    private final fjp b;
    private asic c;
    
    public FullscreenExitController(final fjp b) {
        this.a = false;
        this.b = b;
    }
    
    public final int j() {
        if (this.a) {
            return 512;
        }
        return 128;
    }
    
    public final int k() {
        if (this.a) {
            return 0;
        }
        return 1;
    }
    
    public final void oS(final aum aum) {
        this.c = this.b.k().aK().aB((asix)new kul(17));
    }
    
    public final void oW(final aum aum) {
        final asic c = this.c;
        if (c != null) {
            asjg.b((AtomicReference)c);
            this.c = null;
        }
    }
}
