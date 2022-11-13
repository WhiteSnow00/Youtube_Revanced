import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class agjq implements aglh
{
    private volatile Set a;
    private volatile Set b;
    
    public agjq(final Collection collection) {
        this.b = null;
        (this.a = Collections.newSetFromMap((Map<Object, Boolean>)new ConcurrentHashMap())).addAll(collection);
    }
    
    static agjq b(final Collection collection) {
        return new agjq(collection);
    }
    
    private final void d() {
        monitorenter(this);
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                this.b.add(((aglh)iterator.next()).a());
            }
            this.a = null;
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final /* bridge */ Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap((Map<Object, Boolean>)new ConcurrentHashMap());
                    this.d();
                }
            }
        }
        return Collections.unmodifiableSet((Set<?>)this.b);
    }
    
    final void c(final aglh aglh) {
        synchronized (this) {
            if (this.b == null) {
                this.a.add(aglh);
                return;
            }
            this.b.add(aglh.a());
        }
    }
}
