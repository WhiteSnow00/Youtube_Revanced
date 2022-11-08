import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class agfw implements mqo
{
    public static final AtomicReference a;
    
    static {
        a = new AtomicReference();
    }
    
    public agfw() {
    }
    
    public final void a(final boolean b) {
        final Object a = agfz.a;
        monitorenter(a);
        try {
            for (final agfz agfz : new ArrayList(agfz.b.values())) {
                if (agfz.d.get()) {
                    final Iterator iterator2 = agfz.f.iterator();
                    while (iterator2.hasNext()) {
                        ((xpb)iterator2.next()).z(b);
                    }
                }
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
