import java.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arxw
{
    public static final arxw a;
    public final ConcurrentNavigableMap b;
    public final ConcurrentMap c;
    public final ConcurrentMap d;
    
    static {
        Logger.getLogger(arxw.class.getName());
        a = new arxw();
    }
    
    public arxw() {
        new ConcurrentSkipListMap();
        this.b = new ConcurrentSkipListMap();
        this.c = (ConcurrentMap)new ConcurrentHashMap();
        this.d = (ConcurrentMap)new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
    
    public static void a(final Map map, final arxy arxy) {
        final arxy arxy2 = map.put(arxy.c().a, arxy);
    }
    
    public static void b(final Map map, final arxy arxy) {
        final arxy arxy2 = map.remove(((aryd)arxy).c().a);
    }
}
