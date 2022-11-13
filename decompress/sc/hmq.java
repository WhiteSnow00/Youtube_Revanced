import java.util.Map;
import java.util.HashMap;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hmq implements acse
{
    public final Optional a;
    public final uak b;
    
    public hmq(final uak b, final Optional a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final amgp amgp) {
        final uak b = this.b;
        final Optional a = this.a;
        final HashMap hashMap = new HashMap();
        hashMap.put(wyx.b, Boolean.TRUE);
        if (vyg.e(amgp) != null) {
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", b.e);
            ((vcy)b.c).c(vyg.e(amgp), (Map)hashMap);
            return;
        }
        if (vyg.d(amgp) != null) {
            ((vcy)b.c).c(vyg.d(amgp), (Map)hashMap);
            return;
        }
        if (a.isPresent()) {
            ((acse)a.get()).a(amgp);
        }
    }
}
