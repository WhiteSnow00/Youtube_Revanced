import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bsa extends blx
{
    public final int c;
    public final boolean d;
    
    public bsa(final Throwable t, final blz blz, final Surface surface) {
        super(t, blz);
        this.c = System.identityHashCode(surface);
        boolean d = true;
        if (surface != null) {
            d = (surface.isValid() && d);
        }
        this.d = d;
    }
}
