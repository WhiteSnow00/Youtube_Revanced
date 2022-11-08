import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class aghp implements agjg
{
    private volatile Set a;
    private volatile Set b;
    
    public aghp(final Collection collection) {
        this.b = null;
        (this.a = Collections.newSetFromMap((Map<Object, Boolean>)new ConcurrentHashMap())).addAll(collection);
    }
    
    static aghp b(final Collection collection) {
        return new aghp(collection);
    }
    
    private final void d() {
        monitorenter(this);
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                this.b.add(((agjg)iterator.next()).a());
            }
            this.a = null;
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final void c(final agjg agjg) {
        synchronized (this) {
            if (this.b == null) {
                this.a.add(agjg);
                return;
            }
            this.b.add(agjg.a());
        }
    }
}
