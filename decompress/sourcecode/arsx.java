import java.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arsx
{
    public static final arsx a;
    public final ConcurrentNavigableMap b;
    public final ConcurrentNavigableMap c;
    public final ConcurrentMap d;
    public final ConcurrentMap e;
    public final ConcurrentMap f;
    
    static {
        Logger.getLogger(arsx.class.getName());
        a = new arsx();
    }
    
    public arsx() {
        this.b = new ConcurrentSkipListMap();
        this.c = new ConcurrentSkipListMap();
        this.d = (ConcurrentMap)new ConcurrentHashMap();
        this.e = (ConcurrentMap)new ConcurrentHashMap();
        this.f = (ConcurrentMap)new ConcurrentHashMap();
    }
    
    public static long a(final artf artf) {
        return artf.c().a;
    }
    
    public static void b(final Map map, final arsz arsz) {
        final arsz arsz2 = map.put(arsz.c().a, arsz);
    }
    
    public static void c(final Map map, final arsz arsz) {
        final arsz arsz2 = map.remove(a((artf)arsz));
    }
}
