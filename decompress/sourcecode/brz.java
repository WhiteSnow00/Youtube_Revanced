import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class brz extends blw
{
    public final int c;
    public final boolean d;
    
    public brz(final Throwable t, final bly bly, final Surface surface) {
        super(t, bly);
        this.c = System.identityHashCode(surface);
        boolean d = true;
        if (surface != null) {
            d = (surface.isValid() && d);
        }
        this.d = d;
    }
}
