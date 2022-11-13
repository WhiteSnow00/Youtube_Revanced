import java.util.Iterator;
import android.os.Bundle;
import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agii implements agig
{
    public static volatile agig a;
    final man b;
    
    public agii(final man b, final byte[] array, final byte[] array2) {
        khl.aP(b);
        this.b = b;
        new ConcurrentHashMap();
    }
    
    public final void a(final String s, final Bundle bundle) {
        if (agij.b()) {
            if (!agij.a.contains(s)) {
                final Iterator iterator = agij.b.iterator();
                while (iterator.hasNext()) {
                    if (bundle.containsKey((String)iterator.next())) {
                        return;
                    }
                }
                if (!agij.a(s, bundle)) {
                    return;
                }
                ((neg)this.b.a).b("fcm", s, bundle);
            }
        }
    }
    
    public final void b(final Object o) {
        if (!agij.b()) {
            return;
        }
        final neg neg = (neg)this.b.a;
        neg.c((ndy)new ndx(neg, o));
    }
}
