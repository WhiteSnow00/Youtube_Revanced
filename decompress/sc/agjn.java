import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.Map;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

final class agjn implements agkp, agko
{
    public Queue a;
    private final Map b;
    private final Executor c;
    
    public agjn(final Executor c) {
        this.b = new HashMap();
        this.a = new ArrayDeque();
        this.c = c;
    }
    
    public final Set a(final agkm agkm) {
        synchronized (this) {
            final Map map = this.b.get(agkm.a());
            Set<Object> set;
            if (map == null) {
                set = Collections.emptySet();
            }
            else {
                set = map.entrySet();
            }
            return set;
        }
    }
    
    public final void b(final Class clazz, final agkn agkn) {
        this.c(clazz, this.c, agkn);
    }
    
    public final void c(final Class clazz, final Executor executor, final agkn agkn) {
        synchronized (this) {
            agpc.B(agkn);
            agpc.B(executor);
            if (!this.b.containsKey(clazz)) {
                this.b.put(clazz, new ConcurrentHashMap());
            }
            this.b.get(clazz).put((Object)agkn, (Object)executor);
        }
    }
}
