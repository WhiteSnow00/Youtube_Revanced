import java.util.Iterator;
import android.os.Bundle;
import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aggh implements aggf
{
    public static volatile aggf a;
    final mrm b;
    
    public aggh(final mrm b, final byte[] array, final byte[] array2, final byte[] array3) {
        kgk.aL((Object)b);
        this.b = b;
        new ConcurrentHashMap();
    }
    
    public final void a(final String s, final Bundle bundle) {
        if (aggi.b()) {
            if (!aggi.a.contains(s)) {
                final Iterator iterator = aggi.b.iterator();
                while (iterator.hasNext()) {
                    if (bundle.containsKey((String)iterator.next())) {
                        return;
                    }
                }
                if (!aggi.a(s, bundle)) {
                    return;
                }
                ((ndb)this.b.a).b("fcm", s, bundle);
            }
        }
    }
    
    public final void b(final Object o) {
        if (!aggi.b()) {
            return;
        }
        final ndb ndb = (ndb)this.b.a;
        ndb.c((nct)new ncs(ndb, o));
    }
}
