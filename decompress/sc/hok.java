import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hok implements acse
{
    public final Object a;
    private final int b;
    
    public hok(final how a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hok(final htk a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final amgp amgp) {
        if (this.b == 0) {
            final Object a = this.a;
            if (amgp != null) {
                final how how = (how)a;
                if (!how.bm) {
                    how.ao.d();
                }
            }
            return;
        }
        final Object a2 = this.a;
        final HashMap hashMap = new HashMap();
        hashMap.put(wyx.b, Boolean.TRUE);
        if (vyg.e(amgp) != null) {
            ((vcy)((htk)a2).b).c(vyg.e(amgp), (Map)hashMap);
            return;
        }
        if (vyg.d(amgp) != null) {
            ((vcy)((htk)a2).b).c(vyg.d(amgp), (Map)hashMap);
        }
    }
}
