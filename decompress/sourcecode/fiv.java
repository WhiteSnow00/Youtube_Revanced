import java.util.Map;
import java.util.List;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fiv implements vax
{
    public WeakReference a;
    
    public final void c(final aioe aioe, final Map map) {
        final WeakReference a = this.a;
        vax vax;
        if (a != null) {
            vax = (vax)a.get();
        }
        else {
            vax = null;
        }
        if (vax == null) {
            zjp.b(zjo.a, zjn.a, "Attempting to route command without a resolver ".concat(String.valueOf(String.valueOf(aioe))));
            return;
        }
        vax.c(aioe, map);
    }
}
